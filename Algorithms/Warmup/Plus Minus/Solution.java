import java.util.*;

/**
 * https://www.hackerrank.com/challenges/plus-minus
 *
 * @author Darpan Dodiya
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double n_d = n;
        int positiveCount=0;
        int negativeCount=0;
        int zeroCount=0;
        
        for (int arr_i = 0; arr_i < n; arr_i++) {
            int temp = in.nextInt();
            
            if(temp > 0) {
                positiveCount++;
            }
            else if(temp < 0) {
                negativeCount++;
            }
            else {
                zeroCount++;
            }
        }
        
        System.out.print(positiveCount/n_d + "\n" + negativeCount/n_d + "\n" + zeroCount/n_d);
    }
}
