import java.util.*;
public class greeting {
    public static void main(String[] args) {
        int sum =greeting();
        System.out.println(sum);
    }
    static int  greeting()
    {
        
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Enter the n1 :");
        int n1 = scanner.nextInt();
        System.out.println("Enter the n2 :");
        int n2 = scanner.nextInt();
        int ans = n1+n2;
        return ans;
    }
}
