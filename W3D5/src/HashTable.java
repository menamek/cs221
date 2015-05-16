/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mena
 */
public class HashTable {
    private DataItem[] hashArray;
	private int arraySize;
	private DataItem nonItem;
	private int size;


	public HashTable(int size) {
		arraySize = size;
		hashArray = new DataItem[arraySize];
		nonItem = new DataItem(-1);
		this.size = 0;
	}
	
	public int getSize(){
		return size;
	}

	public void displayTable() {
		System.out.print("Table: ");
		for (int j = 0; j < arraySize; j++) {
			if (hashArray[j] != null)
				System.out.print(hashArray[j].getKey() + " ");
			else
				System.out.print("** ");
		}
		System.out.println("");
	}

	public int hashFunc(int key) {
		return key % arraySize;
	}
	public int hashFunc1(int key) {
		return 5 - key % 5;
	}

	public void insert(int key, DataItem item)

	{
		
		int hashVal = hashFunc(key);
		int step = hashFunc1(key);

		while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
			
		
			hashVal += step;
			hashVal %= arraySize;
		}
		hashArray[hashVal] = item;
		size++;
	}

	public DataItem delete(int key) {
		int hashVal = hashFunc(key);
		int step = hashFunc1(key);

		while (hashArray[hashVal] != null) {
			if (hashArray[hashVal].getKey() == key) {
				DataItem temp = hashArray[hashVal];
				hashArray[hashVal] = nonItem;
				return temp;
			}
		
			hashVal += step;
			hashVal %= arraySize;
		}
		size--;
		return null;
		
	}

	public DataItem find(int key) {
		int hashVal = hashFunc(key);
		int step = hashFunc1(key);

		while (hashArray[hashVal] != null) {
			if (hashArray[hashVal].getKey() == key)
				return hashArray[hashVal];
			
			hashVal += step;
			hashVal %= arraySize;
		}
		return null;
	}
}
