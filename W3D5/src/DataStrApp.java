
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mena
 */
public class DataStrApp {
    public static void main(String[] args) throws IOException {
		String aKey;
		DataStr aDataItem = null;
		int size;
		int n;

		System.out.print("Enter size : ");
		size = getInt();
		System.out.print("Enter initial items: ");
		n = getInt();

		DataStrTable theHashTable = new DataStrTable(size);

		while (true) {
			System.out.print("Enter first letter of ");
			System.out.print("show, insert, delete,  find,or S ");
			char choice = getChar();
			switch (choice) {
			case 'S':
				System.out.println("The size of the hashtable is: "+ theHashTable.getSize());
				break;
			case 's':
				theHashTable.displayTable();
				break;
			case 'i':
				System.out.print("Enter key value to insert: ");
				aKey = getString();
				aDataItem = new DataStr(aKey);
				theHashTable.insert(aDataItem);
				break;
			case 'd':
				System.out.print("Enter key value to delete: ");
				aKey = getStrin();
				theHashTable.delete(aDataItem);
				break;
			case 'f':
				System.out.print("Enter key value to find: ");
				aKey = getStrin();
				aDataItem = theHashTable.find(aDataItem);
				if (aDataItem != null)
					System.out.println("Found " + aKey);
				else
					System.out.println("Could not find " + aKey);
				break;
			default:
				System.out.print("Invalid entry\n");
			}
		}
	}

	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}

	private static String getStrin() throws IOException {

		String s = getString();
		return s;
	}

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	public static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}

	public static int getString1() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}

}
