/**
 * https://www.hackerrank.com/challenges/java-loops
 *
 * @author Darpan Dodiya
 */
 
import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int lastSum = 0;
            
            for(int j=0; j<n; j++) {
                lastSum += (b * 1<<j);
                System.out.print((a + lastSum) + " ");
            }
        }
        in.close();
    }
}