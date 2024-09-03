package Capgemini;

import java.util.Scanner;
 public class Code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        
        int zCount = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                zCount++;
            }
        }
        
        int minDel = zCount;
        int oCount = 0;
        int zAfter = zCount;
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                oCount++;
            } else {
                zAfter--;
            }
            minDel = Math.min(minDel, oCount + zAfter);
        }
        
        System.out.println(minDel);
    }
}