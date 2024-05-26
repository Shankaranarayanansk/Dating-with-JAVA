import java.util.*;
public class fun2 
{ //function writing 
    static void sum ()
    {
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Enter the n1 :");
        int n1 = scanner.nextInt();
        System.out.println("Enter the n2 :");
        int n2 = scanner.nextInt();
        int ans = n1+n2;
        System.out.println("the sum is "+ans);
    }
    public static void main(String[] args) {
        sum();
        sum();
    }
}
