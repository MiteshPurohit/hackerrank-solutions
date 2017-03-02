/**
 * https://www.hackerrank.com/challenges/java-currency-formatter
 *
 * @author Darpan Dodiya
 */

import java.text.NumberFormat;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale inLocale = new Locale("en", "in");
        NumberFormat inNF = NumberFormat.getCurrencyInstance(inLocale);
        
        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println("India: " + inNF.format(payment));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
    }
}