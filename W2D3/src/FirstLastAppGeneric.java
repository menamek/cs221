/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mena
 */
public class FirstLastAppGeneric {
    public static void main(String[] args) { // make a new list
		FirstLastList<Integer> theList = new FirstLastList<Integer>();

		theList.insertFirst(22); // insert at front
		theList.insertFirst(44);
		theList.insertFirst(66);

		theList.insertLast(11); // insert at rear
		theList.insertLast(33);
		theList.insertLast(55);

		theList.displayList(); // display the list
		theList.deleteFirst(); // delete first two items
		theList.displayList(); // display again

		FirstLastList<String> theList2 = new FirstLastList<String>();
		theList2.insertFirst("mena"); // insert at front
		theList2.insertFirst("mena1");
		theList2.insertFirst("mennnna");

		theList2.insertLast("c"); // insert at rear
		theList2.insertLast("d");
		theList2.insertLast("e");

		theList2.displayList(); // display the list
		theList2.deleteFirst(); // delete first two items
		theList2.displayList(); // display again

	} // end main()
}
