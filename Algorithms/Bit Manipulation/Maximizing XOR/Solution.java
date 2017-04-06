import java.util.*;

/**
 * https://www.hackerrank.com/challenges/maximizing-xor
 *
 * @author Darpan Dodiya
 */
public class Solution {

    static int maxXor(int l, int r) {
        int currentMax=0;
        
        for(int i=l; i<=r; i++) {
            for(int j=l; j<=r; j++) {
                int currentXor = i ^ j;
                
                if(currentMax < currentXor) {
                    currentMax = currentXor;
                }
            }
        }
        return currentMax;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
    }
}
