import java.util.*;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum
 *
 * @author Darpan Dodiya
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        long totalSum = 0;
        long temp = 0;
        
        for(int i=0; i<5; i++) {
            temp = in.nextLong();
            arr[i] = temp;
            totalSum += temp;
        }
        
        Arrays.sort(arr);
        
        System.out.println((totalSum-arr[4]) + " " + (totalSum-arr[0]));
    }
}
