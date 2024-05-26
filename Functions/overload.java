public class overload {
    static void fun(int a) {
        System.out.println(a);
    }
    static void fun(String a) {
        System.out.println(a);
    }
    public static void main(String[] args) {
        fun(10);
        fun("shankar");
    }
}
