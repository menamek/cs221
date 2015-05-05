/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mena
 */
public class DirectoryTestD {
    public static void main(String[] args) {
		DirectoryO directory = new DirectoryO();
				
		directory.insertFirst("iuhiu", 1452147L);
		directory.insertFirst("jhbhk", 25462L);
		directory.insertFirst("kijuhho", 456879L);
		directory.insertFirst("jkhk", 1235478L);
		
		directory.displayList();
		System.out.println();
		
		directory.insertLast("hjlk", 789456L);
		
		directory.displayList();
		System.out.println();
		
		directory.deleteFirst();
		
		directory.displayList();
		System.out.println();
		
		System.out.println(" list size is: " + directory.size());
		
		System.out.println( directory.find("iuhiu"));
		System.out.println( directory.find("jhbhk"));
		

	}

}
