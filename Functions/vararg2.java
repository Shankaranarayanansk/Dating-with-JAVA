import java.util.Arrays;

public class vararg2 {
    static void fun(int a, int b ,String ...is)//the vararg need to be at last 
     {
        System.out.println(Arrays.toString(is));
    }
    public static void main(String[] args) {
        fun(2,3,"shankar"); 
    }
}
