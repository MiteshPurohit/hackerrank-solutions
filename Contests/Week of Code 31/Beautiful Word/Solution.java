import java.util.*;

/**
 * https://www.hackerrank.com/contests/w31/challenges/beautiful-word
 * 
 * This Solution might not be the most elegant or efficient one. 
 * Time has more priority here.
 *
 * @author Darpan Dodiya
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w = in.next();
        String vowels = "aeiouy";
        
        for(int i=0; i<w.length()-1; i++) {
            if(w.charAt(i) == w.charAt(i+1)) {
                System.out.println("No");
                return;
            }
            if(vowels.contains(w.substring(i, i+1)) && vowels.contains(w.substring(i+1, i+2))) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}