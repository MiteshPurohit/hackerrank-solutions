import java.util.*;

/**
 * https://www.hackerrank.com/challenges/missing-numbers
 *
 * @author Darpan Dodiya
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer, Integer> A = getMapInputs(in, n);
        int m = in.nextInt();
        HashMap<Integer, Integer> B = getMapInputs(in, m);
        
        ArrayList<Integer> missingNumbers = new ArrayList();
        
        for(int key : B.keySet()) {
            if(A.get(key) != B.get(key)) {
                missingNumbers.add(key);
            }
        }
        
        Collections.sort(missingNumbers);
        
        for(int missed : missingNumbers) {
            System.out.print(missed + " ");
        }
    }
    
    private static HashMap getMapInputs(Scanner in, int sizeOfInput) {
        //Key = Number, Value = Its Frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        int tempInput;
        for(int i=0; i<sizeOfInput; i++) {
            tempInput = in.nextInt();
            if(map.containsKey(tempInput)) {
                map.put(tempInput, map.get(tempInput)+1);
            }
            else {
                map.put(tempInput, 1);
            }
        }
        return map;
    }
}
