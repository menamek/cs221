
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mena
 */
public class IsAnagrams {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s = input.nextLine();
        System.out.println("Enter the second string: ");
        String ss = input.nextLine();

        char c[] = null;
        char cc[] = null;
        if (s.length() == ss.length()) {
            c = s.toCharArray();
            cc = ss.toCharArray();
            Arrays.sort(c);
            Arrays.sort(cc);
            if (Arrays.equals(c, cc)) {

                System.out.println(" are equal and anagram");
            } else {
                System.out.println(" No anagram ");
            }
        }else{
            System.out.println(" No anagram ");
        }
        }
    }
    
    run:
Enter the first string: 
mena 
Enter the second string: 
mean 
 are equal and anagram
BUILD SUCCESSFUL (total time: 13 seconds)

