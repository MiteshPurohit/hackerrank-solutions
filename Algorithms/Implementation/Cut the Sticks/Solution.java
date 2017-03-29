import java.util.*;

/**
 * https://www.hackerrank.com/challenges/cut-the-sticks
 *
 * @author Darpan Dodiya
 */

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList();
        
        for(int i=0; i<n; i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);

        while(arr.size() > 0) {
            System.out.println(arr.size());
            int firstElement = arr.get(0);
            
            for(int i=0; i<arr.size();) {
                if(arr.get(i) - firstElement <= 0) {
                    arr.remove(i);
                }
                else {
                    arr.set(i, arr.get(i) - firstElement);
                    i++;
                }
            }
        }
    }
}