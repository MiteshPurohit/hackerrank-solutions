import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * https://www.hackerrank.com/challenges/ctci-lonely-integer
 * 
 * @author Darpan Dodiya
 */

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int lonely = 0;
        
        for(int a_i=0; a_i < n; a_i++){
			//Simple XOR FTW
            lonely = lonely ^ in.nextInt();
        }
        
        System.out.println(lonely);
    }
}
