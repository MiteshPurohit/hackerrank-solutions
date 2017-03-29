
import java.util.*;

/**
 * https://www.hackerrank.com/challenges/compare-the-triplets
 *
 * @author Darpan Dodiya
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        int alicePoint=0;
        int bobPoint=0;
        
        if(a0 > b0) {
            alicePoint++;
        }
        else if (a0 < b0){
            bobPoint++;
        }
        if(a1 > b1) {
            alicePoint++;
        }
        else if (a0 < b0){
            bobPoint++;
        }
        if(a2 > b2) {
            alicePoint++;
        }
        else if (a0 < b0){
            bobPoint++;
        }
        System.out.println(alicePoint + " " + bobPoint);
    }
}
