import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/w30/challenges/melodious-password
 *
 * @author Darpan Dodiya
 */

public class Solution {

    static List<String> passwordList = new ArrayList<>();

    private static void generatePassword(int n) {
        String[] vowels = {"a","e","i","o","u"};
        String[] consonants = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};

        List<String> vowelLastList = Arrays.asList(vowels);
        List<String> consonantsLastList = Arrays.asList(consonants);

        for(int i=0; i<n-1; i++) {
            List<String> tempList1 = new ArrayList<>();
            List<String> tempList2 = new ArrayList<>();

            for(String s1 : vowelLastList) {
                for(String s2 : consonants) {
                    tempList1.add(s1 + s2);
                }
            }

            for(String s1 : consonantsLastList) {
                for(String s2 : vowels) {
                    tempList2.add(s1 + s2);
                }
            }
            vowelLastList = tempList2;
            consonantsLastList = tempList1;
        }

        passwordList.addAll(vowelLastList);
        passwordList.addAll(consonantsLastList);

        return;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        generatePassword(n);

        for(String s : passwordList) {
            System.out.println(s);
        }
    }
}

