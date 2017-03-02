/**
 * https://www.hackerrank.com/challenges/java-date-and-time
 *
 * @author Darpan Dodiya
 */

import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = Integer.parseInt(in.next()) - 1;
        int day = Integer.parseInt(in.next());
        int year = Integer.parseInt(in.next());
        
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(year, month, day);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("EEEE");
        System.out.println(dateFormatter.format(calendar.getTime()).toUpperCase());
    }
}
