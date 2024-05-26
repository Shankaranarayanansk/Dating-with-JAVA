import java.util.Scanner;

public class argfun {
    public static void main(String[] args) {
        int ans = sum(2,3);
        System.out.println(ans);
        String ans2 = val("dolly");
        System.out.println(ans2);
        Scanner  in = new Scanner(System.in);
        String ans3 = in.next();
        String ans4 = val(ans3);
        System.out.println(ans4);
        
    }
    static int sum(int x, int y) {
        return x + y;
    
}
     static String val(String name)
     {
         return "Hello "+name;
     }
}
