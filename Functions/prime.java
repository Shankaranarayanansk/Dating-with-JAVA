import java.util.Scanner;

public class prime {

    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        int c =2;
        while (c*c <= n) {
            if(n%c == 0)
            {
                return false;
            }
            c++;
        
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n)); 
    }
}