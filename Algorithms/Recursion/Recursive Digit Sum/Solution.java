import java.util.*;

/**
 * https://www.hackerrank.com/challenges/recursive-digit-sum
 *
 * @author Darpan Dodiya
 */


public class Solution {

    static int superDigit(String p, int k) {
        if(p.length() == 1) {
            return Integer.parseInt(p);
        }
        else {
            long sumOfDigits = 0;
            for(int i=0; i<p.length(); i++) {
                sumOfDigits += Character.getNumericValue((p.charAt(i)));
            }
            if(p.length() == k) {
                sumOfDigits = sumOfDigits * k;
            }
            return superDigit(String.valueOf(sumOfDigits), k);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();
        int k = sc.nextInt();
        
        System.out.print(superDigit(n, k));
    }
}
