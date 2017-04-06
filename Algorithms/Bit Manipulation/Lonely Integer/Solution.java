import java.util.*;

/**
 * https://www.hackerrank.com/challenges/lonely-integer
 *
 * @author Darpan Dodiya
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int lonelyInteger=0;
        
        for (int i = 0; i < n; i++) {
            lonelyInteger ^= in.nextInt();
        }
        
        System.out.println(lonelyInteger);
    }
}
