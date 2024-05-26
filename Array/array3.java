import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        //input array from user
        for (int i = 0; i <arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}
