import java.util.*;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference
 *
 * @author Darpan Dodiya
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int leftSum = 0;
        int rightSum = 0;
        int frontPointer = 0;
        int endPointer = n-1;
        int temp = 0;
        
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                temp = in.nextInt();
                
                if(a_j == frontPointer) {
                    leftSum+= temp;
                }
                if(a_j == endPointer) {
                    rightSum+= temp;
                }
            }
            frontPointer++;
            endPointer--;
        }
        
        System.out.println(Math.abs(leftSum-rightSum));
    }
}