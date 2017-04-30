import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * https://www.hackerrank.com/contests/world-codesprint-10/challenges/zigzag-array
 *
 * @author Darpan Dodiya
 */

public class Solution {

    static int minimumDeletions(int[] a){
        if(a.length <= 2) {
            return 0;
        }
        int count = 0;
        
        for(int i=0; i<a.length-2; i++) {
            if(a[i] > a[i+1] && a[i+1] > a[i+2]) {
                count++;
            }
            else if(a[i] < a[i+1] && a[i+1] < a[i+2]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Return the minimum number of elements to delete to make the array zigzag
        int result = minimumDeletions(a);
        System.out.println(result);
    }
}

    static int getPoints(int month){
        if(month >= 10) {
            return 100;
        }
        else {
            return month * 10;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month1 = in.nextInt();
        int month2 = in.nextInt();
        int month3 = in.nextInt();
        System.out.println(getPoints(month1) + getPoints(month2) + getPoints(month3));
    }
}
