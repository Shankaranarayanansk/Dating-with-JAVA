import java.util.Scanner;

public class tabel {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = a.nextInt();
        int d = a.nextInt();
        
        
        for (int i = d; i <= c; i++) {
            System.out.println(b + " * " + i + " = " + (b * i));
        }
    }
}
