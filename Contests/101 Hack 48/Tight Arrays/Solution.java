import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/101hack48/challenges/tight-arrays/
 *
 * @author Darpan Dodiya
 */
public class Solution {

    static int shortestTightArray(int a, int b, int c){
        if(b >= a && b <= c) {
            return c-a+1;
        }
        else {
            return Math.abs(a-b) + Math.abs(c-b) + 1;
        }
    }
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        int result = shortestTightArray(a, b, c);
        System.out.println(result);
        
        
    }
}
