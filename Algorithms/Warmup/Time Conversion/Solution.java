import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * https://www.hackerrank.com/challenges/time-conversion
 *
 * @author Darpan Dodiya
 */
public class Solution {

    public static void main(String[] args) throws ParseException {        
        SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm:ss");

        System.out.println(date24Format.format(date12Format.parse(new Scanner(System.in).next())));
    }
}
