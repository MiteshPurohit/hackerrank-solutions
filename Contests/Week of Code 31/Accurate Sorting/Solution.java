import java.util.*;

/**
 * https://www.hackerrank.com/contests/w31/challenges/accurate-sorting
 * 
 * @author Darpan Dodiya
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            a[0] = in.nextInt();
            int max = a[0];
            
            for(int a_i=1; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                
                if(a[a_i] > max) {
                    max = a[a_i];
                }
                if((Math.abs(a[a_i] - a[a_i-1]) == 1) &&  a[a_i] < a[a_i-1]) {
                    int temp = a[a_i];
                    a[a_i] = a[a_i-1];
                    a[a_i-1] = temp;
                }               
            }
            if(a[n-1] == max) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}