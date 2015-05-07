/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mena
 */
public class Link1Generic<T> {
    public T dData; // data item
	public Link1Generic next; // next link in list
	// -------------------------------------------------------------

	public Link1Generic(T d) // constructor
	{
		dData = d;
	}

	// -------------------------------------------------------------
	public void displayLink() // display this link
	{
		System.out.print(dData + " ");
	}
	// -------------------------------------------------------------
} // end class Link
// //////////////////////////////////////////////////////////////

class FirstLastList<D> {
	private Link1Generic first; // ref to first link
	private Link1Generic last; // ref to last link
	// -------------------------------------------------------------

	public FirstLastList() // constructor
	{
		first = null; // no links on list yet
		last = null;
	}

	// -------------------------------------------------------------
	public boolean isEmpty() // true if no links
	{
		return first == null;
	}

	// -------------------------------------------------------------
	public void insertFirst(D dd) // insert at front of list
	{
		Link1Generic newLink = new Link1Generic(dd); // make new link

		if (isEmpty()) // if empty list,
		{
			last = newLink; // newLink <-- last
		}
		newLink.next = first; // newLink --> old first
		first = newLink; // first --> newLink
	}

	// -------------------------------------------------------------
	public void insertLast(D dd) // insert at end of list
	{
		Link1Generic newLink = new Link1Generic(dd); // make new link
		if (isEmpty()) // if empty list,
			first = newLink; // first --> newLink
		else
			last.next = newLink; // old last --> newLink
		last = newLink; // newLink <-- last
	}

	// -------------------------------------------------------------
	public D deleteFirst() // delete first link
	{ // (assumes non-empty list)
		D temp = (D) first.dData;
		if (first.next == null) // if only one item
			last = null; // null <-- last
		first = first.next; // first --> old next
		return temp;
	}

	// -------------------------------------------------------------
	public void displayList() {
		System.out.print("List (first-->last): ");
		Link1Generic current = first; // start at beginning
		while (current != null) // until end of list,
		{
			current.displayLink(); // print data
			current = current.next; // move to next link
		}
		System.out.println("");
	}
    
}

