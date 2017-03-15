import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/w30/challenges/candy-replenishing-robot
 *
 * @author Darpan Dodiya
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int candiesBeginning = in.nextInt();
        int partyTime = in.nextInt();
        int addedCandies = 0;
        int currentCandies = candiesBeginning - in.nextInt();

        for(int c_i=1; c_i < partyTime-1; c_i++){
            currentCandies = currentCandies - in.nextInt();

            if(currentCandies < 5) {
                int temp = candiesBeginning - currentCandies;
                addedCandies += temp;
                currentCandies += temp;
            }

        }

        System.out.println(addedCandies);
    }
}
