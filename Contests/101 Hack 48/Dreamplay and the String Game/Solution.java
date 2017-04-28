import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/101hack48/challenges/dreamplay-and-the-string-game/
 *
 * @author Darpan Dodiya
 */
public class Solution {

    static String stringGameWinner(String s, String p){
        
        if(s.length() < p.length()) {
            return "Steven";
        }
        
        if(s.contains(p)) {
            return "Amanda";
        }
        else {
            return "Steven";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String p = in.next();
            String result = stringGameWinner(s, p);
            System.out.println(result);
        }
    }
}
