class mygrandapa{
    void display(){
        System.out.println("My Grandfather is a Farmer");
        
    }
}
class mydaddy extends mygrandapa{
    void show(){
        System.out.println("My Father is a Business Man");
    }
}
class me extends mydaddy{
    void display()
    {
        System.out.println("I am a Freelancer");
        
    }
}
    public class Main{
        public static void main(String[] args){
            me obj=new me();
            obj.display();
            obj.show();
            obj.display();
            
        }
    }
