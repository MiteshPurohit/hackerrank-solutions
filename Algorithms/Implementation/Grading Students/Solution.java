import java.util.*;

/**
 * https://www.hackerrank.com/challenges/grading
 *
 * @author Darpan Dodiya
 */
public class Solution {

    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            
            if(grade < 38) {
                System.out.println(grade);
            }
            else {
                int modulo = grade / 5;
                if(((modulo+1) * 5)- grade< 3) {
                    System.out.println((modulo+1) * 5);
                }
                else {
                    System.out.println(grade);
                }
            }
        }
    }
}
