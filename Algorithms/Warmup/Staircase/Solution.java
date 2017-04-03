import java.util.*;

/**
 * https://www.hackerrank.com/challenges/staircase
 *
 * @author Darpan Dodiya
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int divider = n-1;
        
        for(int i=0; i<n; i++) {
            StringBuilder sb = new StringBuilder();
            
            for(int j=0; j<n; j++) {
                if(j<divider) {
                    sb.append(" ");
                }
                else {
                    sb.append("#");
                }
            }
            divider--;
            System.out.println(sb.toString());
        }
    }
}
