class Book {
    int number;
    String name;
    String subject;
    int price;
    int year;

    Book(int number, String name, String subject, int price, int year) {
        this.number = number;
        this.name = name;
        this.subject = subject;
        this.price = price;
        this.year = year;
    }

    void display() {
        System.out.println("number: " + number);
        System.out.println("name: " + name);
        System.out.println("subject: " + subject);
        System.out.println("price: " + price);
        System.out.println("year: " + year);
        System.out.println("");
    }
}

public class Main {
    public static void main(String[] args) {
        Book[] Book = new Book[3];

        Book[0] = new Book(25, "PS 1", "Old age", 4000,1874);
        Book[1] = new Book(26, "KAMBARAMAYANAM", "Devotion", 4800, 1982);
        Book[2] = new Book(47, "MAHABARATHAM", "Dharma", 3000,1741);

    
        for (int i = 0; i < Book.length; i++) {
            Book[i].display();
        }
    }
}
