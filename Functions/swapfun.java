import java.util.Scanner;

public class swapfun {
    static int swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int swap = swap(a, b);
        System.out.println(swap);
    }
}
// for num swap functions not work in this approch 