import java.util.*;

/**
 * https://www.hackerrank.com/challenges/apple-and-orange
 *
 * @author Darpan Dodiya
 */
public class Solution {

    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int apples = 0;
        int oranges = 0;
        int temp = 0;
        
        for(int apple_i=0; apple_i < m; apple_i++){
            temp = in.nextInt();
            if(temp + a >= s && temp + a <= t) {
                apples++;
            }
        }
        for(int orange_i=0; orange_i < n; orange_i++){
            temp = in.nextInt();
            if(temp + b <= s && temp + b >= t) {
                oranges++;
            }
        }
        System.out.println(apples + "\n" + oranges);
    }
}
