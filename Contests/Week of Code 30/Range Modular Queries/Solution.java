import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/w30/challenges/range-modular-queries
 * 
 * Warning: This is non-optimized naive solution. Doesn't pass all test cases. 
 *
 * @author Darpan Dodiya
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeOfA = in.nextInt();
        int noQueries = in.nextInt();
        int[] a = new int[sizeOfA];
        for(int a_i=0; a_i < sizeOfA; a_i++){
            a[a_i] = in.nextInt();
        }

        for(int i = 0; i < noQueries; i++){
            int left = in.nextInt();
            int right = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int validElement = 0;

            for(int j = left; j<=right; j++) {
                if(a[j] % x == y) {
                    validElement++;
                }
            }

            System.out.println(validElement);
        }

    }
}