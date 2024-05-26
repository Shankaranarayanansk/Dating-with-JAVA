import java.util.Scanner;

public class calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Enter the operation: ");
            char ch = sc.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.print("Enter the 2 numbers: ");
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                if (ch == '+') {
                    ans = n1 + n2;
                } else if (ch == '-') {
                    ans = n1 - n2;
                } else if (ch == '*') {
                    ans = n1 * n2;
                } else if (ch == '/') {
                    if (n2 == 0) {
                        System.out.println("Divide by zero");
                    } else {
                        ans = n1 / n2;
                    }
                } else if (ch == '%') {
                    ans = n1 % n2;
                }
            } else if (ch == 'x' || ch == 'X') {
                break;
            } else {
                System.out.println("Invalid operation");
                continue;
            }
            System.out.println("The answer is " + ans);
            ans = 0;
        }
        
    }
}
