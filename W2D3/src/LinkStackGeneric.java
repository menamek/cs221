/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mena
 */
public class LinkStackGeneric<D> {
    private LinkList1Generic theList;

	// --------------------------------------------------------------
	public LinkStackGeneric() // constructor
	{
		theList = new LinkList1Generic();
	}

	// --------------------------------------------------------------
	public void push(D j) // put item on top of stack
	{
		theList.insertFirst(j);
	}

	// --------------------------------------------------------------
	public D pop() // take item from top of stack
	{
		if (!isEmpty()) {
			return (D) theList.deleteFirst();
		}
		return null;
	}

	// --------------------------------------------------------------
	public boolean isEmpty() // true if stack is empty
	{
		return (theList.isEmpty());
	}

	// --------------------------------------------------------------
	public void displayStack() {
		System.out.print("Stack (top-->bottom): ");
		theList.displayList();
	}
	// --------------------------------------------------------------
    public static void main(String[] args) {
		LinkStackGeneric<Float> theStack = new LinkStackGeneric<Float>(); // make
																			// stack
		LinkStackGeneric<Double> theStack2 = new LinkStackGeneric<Double>(); // make
																				// stack

		theStack.push(10.8f); // push items
		theStack.push(20.5f);

		theStack.displayStack(); // display stack

		theStack.push(30.8f); // push items
		theStack.push(40.5f);

		theStack.displayStack(); // display stack

		theStack.pop(); // pop items
		theStack.pop();
		theStack.displayStack(); // display stack
		theStack.pop();
		theStack.pop();
		System.out.println("Item Deleted : " + theStack.pop());
		theStack.displayStack(); // display stack

		System.out.println("for the double ");
		theStack2.push(2.2); // push items
		theStack2.push(7.9);

		theStack.displayStack(); // display stack

		theStack2.push(3.8); // push items
		theStack2.push(4.8);

		theStack2.displayStack(); // display stack

		theStack2.pop(); // pop items
		theStack2.pop();
		theStack2.displayStack(); // display stack
		theStack2.pop();
		theStack2.pop();
		System.out.println("Item Deleted : " + theStack2.pop());
		theStack2.displayStack(); // display stack
	} // end main()

}
