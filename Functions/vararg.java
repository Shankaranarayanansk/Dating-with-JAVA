import java.util.Arrays;
public class vararg {
    static void  fun(int ...suma)//here ...is the variable argument
     //in above we can use the any data type
    {
        System.out.println(Arrays.toString(suma));
     }
    public static void main(String[] args) {
        fun(1,2,8,9,10,11,12,13,14,15);
        //fun();//it also work 
        
    }
}
