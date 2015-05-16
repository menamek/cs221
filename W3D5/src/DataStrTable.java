/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mena
 */
class DataStrTable {
    private DataStr[] hashArray;
	private int arraySize;
	private DataStr nonItem;
	private int size;

	DataStrTable(int size) {
		arraySize = size;
		hashArray = new DataStr[arraySize];
		nonItem = new DataStr(null);
		size=0;
}
        public void displayTable() {
		System.out.print("Table: ");
		for (int j = 0; j < arraySize; j++) {
			if (hashArray[j] != null)
				System.out.print(hashArray[j].getkey() + " ");
			else
				System.out.print("** ");
		}
		System.out.println("");
	}

	public int hashFunc(String key) {
		int k = key.hashCode() % arraySize;
		System.out.println("Index : " + k);
		return k;
	}

	public void insert(DataStr item)

	{
		String key = item.getkey();
		int hashVal = hashFunc(key);

		while (hashArray[hashVal] != null
				&& hashArray[hashVal].getkey() != null) {
			++hashVal;
			hashVal %= arraySize;
		}
		hashArray[hashVal] = item;
		size++;
	}

	public DataStr delete(DataStr item) {
		String key = item.getkey();
		int hashVal = hashFunc(key);

		while (hashArray[hashVal] != null) {
			if (hashArray[hashVal].getkey() == key) {
				DataStr temp = hashArray[hashVal];
				hashArray[hashVal] = nonItem;
				return temp;
			}
			++hashVal;
			hashVal %= arraySize;
		}
		size--;
		return null;
	}

	

	

	public DataStr find(DataStr item) {
		String key = item.getkey();
		int hashVal = hashFunc(key);

		while (hashArray[hashVal] != null) {
			if (hashArray[hashVal].getkey() == key)
				return hashArray[hashVal];
			++hashVal;

			hashVal %= arraySize;

		}
		return null;

	}

	public int getSize() {
		return size;
	}
}
