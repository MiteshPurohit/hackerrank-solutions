import java.io.*;
import java.text.*;
import java.math.*;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/hourrank-19/challenges/what-are-the-odds
 * 
 * WARNING: Getting time out in most of the test cases. Need to optimize this solution.
 * 
 * @author Darpan Dodiya
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] piles = new int[n];
        int ways = 0;

        for (int s_i = 0; s_i < n; s_i++) {
            piles[s_i] = in.nextInt();
        }
        int b=0;
        int e=0;
        int i1;
        int j1;
        int i2;
        int j2;
        int xorSum;
        
        while(true) {            
            xorSum = 0;
            
            i1 = 0;
            j1 = b-1;
            i2 = e+1;
            j2 = n-1;
            
            //Interval 1
            for(int i=i1; i<=j1; i++) {
                xorSum = xorSum ^ piles[i];
            }
            
            //Interval 2
            for(int i=i2; i<=j2; i++) {
                xorSum = xorSum ^ piles[i];
            }
            
            //Alice wins only if nim-sum is zero
            if(xorSum == 0) {
                //System.out.println("b: " + b + "\te: " + e);
                ways++;
            }
            
            //Break when we reach to end
            if(b == n-1 && e == n-1) {
                //No piles remaining, Alice wins
                //System.out.println("b: " + b + "\te: " + e);
                break;
            }
            
            //Increment b & e
            if(e == n-1) {
                b++;
                e = b;
            }
            else {
                e++;
            }
        }
        
        System.out.println(ways);
    }
}