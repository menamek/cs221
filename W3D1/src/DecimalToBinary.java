
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
public class DecimalToBinary {
    public static void main(String[] args) {

    int input;
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter number to convert to binary: ");
    input = scan.nextInt();
    DecimalToBinary(input);

}

public static void DecimalToBinary(int num) {
	
    if (num>0) {
    	
        DecimalToBinary(num/2);
        
        System.out.print(num%2 + " ");
    }
}

}
