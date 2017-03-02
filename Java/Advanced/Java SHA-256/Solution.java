/**
 * https://www.hackerrank.com/challenges/sha-256
 *
 * @author Darpan Dodiya
 */

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(s.getBytes("UTF-8"));
        byte[] bytehash = md.digest();
        
        StringBuilder hexString = new StringBuilder();

        for (int i = 0; i < bytehash.length; i++) {
            String hex = Integer.toHexString(0xff & bytehash[i]);
            if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        
        System.out.println(hexString.toString());
    }//end of main

}//end of class