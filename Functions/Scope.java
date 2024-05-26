public class Scope  {

    public static void main(String[] args) {
        int a=10;//initialize the val 
        int b=20;
        {
            a=7;// can be changed but cannot be initialized 
            int c= 10;///it in a scope 
        }
        System.out.println(c);// so here can't be accesesd
    static void random(int marks)
    {
        int num = 67;
        System.out.println(num) ;
        System.out.println(marks);
    }
}
}// if initialization something on outside the that can be used inside the block while declaring it on inside can'tt be used in outside 