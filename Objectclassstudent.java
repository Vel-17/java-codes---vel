class Student {
    int rollno;
    String name;
    String dept;
    String section;
    int year;

    Student(int rollno, String name, String dept, String section, int year) {
        this.rollno = rollno;
        this.name = name;
        this.dept = dept;
        this.section = section;
        this.year = year;
    }

    void display() {
        System.out.println("Rollno: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Dept: " + dept);
        System.out.println("Section: " + section);
        System.out.println("Year: " + year);
        System.out.println("                        ");
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] Students = new Student[3];

        Students[0] = new Student(127, "Dharanish", "ECE", "A", 2);
        Students[1] = new Student(128, "Dharani dharan", "ECE", "A", 3);
        Students[2] = new Student(129, "Dharani vel", "ECE", "A", 4);

    
        for (int i = 0; i < Students.length; i++) {
            Students[i].display();
        }
    }
}
