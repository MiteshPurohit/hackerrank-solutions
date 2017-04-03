import java.util.*;

/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles
 *
 * @author Darpan Dodiya
 */
public class Solution {

    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int currentMax = 0;
        int count = 0;
        int temp = 0;
        
        for(int height_i=0; height_i < n; height_i++){
            temp = in.nextInt();
            if(temp > currentMax) {
                currentMax = temp;
                count = 1;
            }
            else if(temp == currentMax) {
                count++;
            }
        }
        System.out.println(count);
    }
}
