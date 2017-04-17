import java.util.*;

/**
 * https://www.hackerrank.com/contests/w31/challenges/zero-one-game
 * 
 * @author Darpan Dodiya
 */
public class Solution {

    public static int turns = 0;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            turns = 0;
            
            int n = in.nextInt();
            
            if(n == 1) {
                in.nextInt();
                System.out.println("Bob");
                continue;
            }
            if(n == 2) {
                in.nextInt();
                in.nextInt();
                System.out.println("Bob");
                continue;
            }
            
            LinkedList<Integer> sequence = new LinkedList<>();
            sequence.add(in.nextInt());
            sequence.add(in.nextInt());
            
            for(int i=2; i<n; i++) {
                sequence.add(in.nextInt());
                checkAndRemove(sequence);
            }
            if(turns % 2 == 0) {
                System.out.println("Bob");
            }
            else {
                System.out.println("Alice");
            }
        }
    }
    
    public static void checkAndRemove(LinkedList<Integer> sequenceIn) {
        if(sequenceIn.size() > 2 && sequenceIn.get(sequenceIn.size()-3) == 0 && 
                (sequenceIn.get(sequenceIn.size()-2) == 0 || sequenceIn.get(sequenceIn.size()-2) == 1) 
                    && sequenceIn.get(sequenceIn.size()-1) == 0) {
                    sequenceIn.remove(sequenceIn.size()-2);
                    turns++;
                    checkAndRemove(sequenceIn);
                }        
    }
}