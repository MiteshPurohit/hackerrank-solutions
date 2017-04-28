import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/101hack48/challenges/walking-robots/
 *
 * @author Darpan Dodiya
 */
public class Solution {

    static int howManyCollisions(String s){
        if(s.length() == 1) {
            return 0;
        }
        int rightMoving = 0;
        char previousChar = 'x';
        int collisons = 0;
        boolean deathFlag = false;
        
        for(int i=0; i<s.length(); i++) {
            char currentChar = s.charAt(i);
            
            if(currentChar == 'r') {
                rightMoving++;
                deathFlag = false;
            }
            
            else if(currentChar == 'l') {
                if(previousChar == 'r') {
                    collisons = collisons + rightMoving;
                    rightMoving = 0;
                    deathFlag = true;
                }
                if(deathFlag) {
                    collisons++;
                }
                previousChar = currentChar;
                continue;
            }
            else {
                collisons = collisons + rightMoving;
                rightMoving = 0;
                deathFlag = true;
            }
            previousChar = currentChar;
            
        }
        return collisons;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // Returns the number of times moving robots collide.
            int result = howManyCollisions(s);
            System.out.println(result);
        }
    }
}
