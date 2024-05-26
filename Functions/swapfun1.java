import java.util.Arrays;

public class swapfun1 {
    public static void main(String[] args) 
    {
        int [] a = {1,2,3,4,5,6,7,8,9,10,11};
        change(a);
        System.out.println(Arrays.toString(a));
    }
    static void change(int[] num)
    {
            num[0] =44;
    }

}
