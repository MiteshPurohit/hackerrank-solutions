import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * https://www.hackerrank.com/contests/world-codesprint-10/challenges/maximal-and-subsequences/
 *
 * @author Darpan Dodiya
 */

public class Solution {

    static long[] solve(int n, int k, long[] a) {
        long opsize = (int) Math.pow(2, n);
        long maxAND = -1;
        long currentAND = 0;
        long maxANDCount = 0;
        long MOD = (long) (Math.pow(10, 9) + 7);

        for (long i = 1; i < opsize; i++) {
            if (Long.bitCount(i) != k) {
                continue;
            }
            currentAND = 0;
            boolean isInitialized = false;

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    if(!isInitialized) {
                        isInitialized = true;
                        currentAND = a[j];
                    }
                    else {
                        currentAND = currentAND & a[j];
                    }
                }
            }

            if (currentAND > maxAND) {
                maxAND = currentAND;
                maxANDCount = 1;
            } else if (currentAND == maxAND) {
                maxANDCount++;
            }
        }

        return new long[]{maxAND, maxANDCount % MOD};
    }

    public static void main(String[] args) throws FileNotFoundException {
        //Scanner in = new Scanner(new File("input.txt"));
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        long[] a = new long[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextLong();
        }
        long[] result = solve(n, k, a);
        System.out.println(result[0] + "\n" + result[1]);

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
