import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * https://www.hackerrank.com/contests/world-codesprint-10/challenges/reward-points/
 *
 * @author Darpan Dodiya
 */

public class Solution {

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
