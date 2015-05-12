/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mena
 */
public class linear {
    public static void main(String[] args) {
		int a[] = { 5, 6, 8, 9, 0,1};

		System.out.println("linear search  : ");
		if (linear(a, 12, 0)) {
			System.out.println("it is found ");
		} else
			System.out.println("not found");

	}

	public static boolean linear(int[] date, int searchKey, int index) {
		if (index == date.length - 1) {
			return false;
		}
		if (date[index] == searchKey) {
			return true;
		} else
			return linear(date, searchKey, ++index);

	}

}

run:
linear search  : 
not found
BUILD SUCCESSFUL (total time: 0 seconds)

