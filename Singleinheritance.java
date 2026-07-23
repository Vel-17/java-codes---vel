class parent {
    void display(){
        System.out.print("This is the parent class.");
    }
    }
    class child extends parent{
        void show(){
            System.out.print("This is the child class.");
        }
    }
    public class Main{
    
    public static void main(String[] args) {
      child obj=new child();
      parent obj1=new parent();
      obj.display();
      obj.show();
    }
}
