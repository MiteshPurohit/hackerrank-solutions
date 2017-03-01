/**
 * https://www.hackerrank.com/challenges/java-loops-i
 *
 * @author Darpan Dodiya
 */
 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
 
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        
        for(int j=1; j<=10; j++) {
            System.out.println(i + " " + "x" + " " + j + " = " + i *j);
        }
    }
}