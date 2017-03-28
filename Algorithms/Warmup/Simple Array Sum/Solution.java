import java.util.*;

/**
 * https://www.hackerrank.com/challenges/simple-array-sum
 *
 * @author Darpan Dodiya
 */


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int total = 0;
        
        for(int arr_i=0; arr_i < n; arr_i++){
            total += in.nextInt();
        }
        
        System.out.println(total);
    }
}
