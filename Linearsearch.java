import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] name={"samantha","vel","rashmika"};
        String n=sc.nextLine();
        for (int i=0;i<name.length;i++)
        {
            if (name[i].equals(n))
            {
                System.out.println("name found");
                return;
            }
        }
        System.out.println("name not found");
            }
}
