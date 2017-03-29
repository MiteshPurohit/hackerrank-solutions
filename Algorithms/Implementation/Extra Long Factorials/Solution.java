import java.math.BigInteger;
import java.util.*;

/**
 * https://www.hackerrank.com/challenges/extra-long-factorials
 *
 * @author Darpan Dodiya
 */

public class Solution {
    
    private static BigInteger factorial(BigInteger n) {
        if(n == BigInteger.valueOf(0) || n == BigInteger.valueOf(1)) {
            return BigInteger.ONE;
        }
        return factorial(n.subtract(BigInteger.ONE)).multiply(n);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = BigInteger.valueOf(sc.nextInt());
        
        System.out.println(factorial(n));
    }
}