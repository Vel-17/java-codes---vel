import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.print("enter n:");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int sum =0;
        for (int i =1;i<=n;i++){
            sum+=i;
            
        }
    System.out.println("Sum =" +sum);
    }
}
