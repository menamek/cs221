/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mena
 */
public class IsPalindrome {
     public static void main (String[] args) {

        String str = "siis";

        if (IsPalindrome (str))
            System.out.println ("Yes");
        else
            System.out.println ("No");
    }

    public static boolean IsPalindrome (String str) {

        if (str == null || str.length () <= 1)
            return true;

        char chFirst = str.charAt (0);
        char chLast = str.charAt (str.length () - 1);

        if (chFirst == chLast)
            return IsPalindrome(str.substring (1, str.length () - 1));

        return false;
    }

}
