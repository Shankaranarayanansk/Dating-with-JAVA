import java.util.*;
public class amstrong {// update the code also for aal the digits 
    static boolean amstrongnum(int n)
    {
        int real = n;
        int sum = 0;
        while (n>0)
       {
        int rem = n%10;
        n=n/10;
        sum = sum + rem*rem*rem;
       }
 
    
    if(sum==real)
    {
        return true;
    }
    return false;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //   int n = scanner.nextInt();
    //     boolean ans = amstrongnum(n);
    //     System.out.println(ans);
    //
       for(int i = 100; i < 1000; i++)//all the amstrong numbers in 100 to 1000
       {
        if(amstrongnum(i))
        {
            System.out.println(i);
        }
       }
 }

}
