import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/w30/challenges/find-the-minimum-number
 *
 * @author Darpan Dodiya
 */

public class Solution {

    private static String minString(int n) {
        //Base case
        if(n == 2) {
            return "min(int, int)";
        }
        else {
            n--;
            //Recursive call
            return "min(int, " + minString(n) + ")";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(minString(n));
    }
}

