import java.util.*;

/**
 * https://www.hackerrank.com/challenges/funny-string
 *
 * @author Darpan Dodiya
 */

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i=0; i<T; i++) {
            String s = sc.next();
            boolean funnyFlag = false;
            
            for(int j=1; j<s.length(); j++) {
                if(Math.abs(s.charAt(j) - s.charAt(j-1)) ==  Math.abs(s.charAt(s.length()- j) - s.charAt(s.length() - j-1))) {
                    funnyFlag = true;
                }
                else {
                    funnyFlag = false;
                    break;
                }
            }
            if(funnyFlag) {
                System.out.println("Funny");
            }
            else {
                System.out.println("Not Funny");
            }
            
        }
    }
    
}