/**
 * https://www.hackerrank.com/challenges/java-exception-handling-try-catch
 *
 * @author Darpan Dodiya
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        
        String xString = sc.nextLine();
        String yString = sc.nextLine();
        
        try {
            x = Integer.parseInt(xString);
            y = Integer.parseInt(yString);
            
        }
        catch(Exception e) {
            System.out.println("java.util.InputMismatchException");
            System.exit(0);
        }
        
        try {
            System.out.println(x/y);
        }
        catch(Exception e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}