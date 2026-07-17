import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.print("enter n:");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int product =1;
        for (int i =1;i<=n;i++){
            product*=i;
            
        }
    System.out.println("product =" +product);
    }
}
