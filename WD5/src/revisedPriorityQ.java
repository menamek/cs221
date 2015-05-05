/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mena
 */
public class revisedPriorityQ {

    // array in sorted order, from max at 0 to min at size-1

    private int maxSize;
    private long[] queArray;
    private int nItems;

    // -------------------------------------------------------------
    public revisedPriorityQ(int s) // constructor
    {
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }

    // -------------------------------------------------------------
    public void insert(long item) // insert item
    {
        int j;

        if (nItems == 0) // if no items,
        {
            queArray[nItems++] = item; // insert at 0
        } else // if items,
        {
            for (j = nItems - 1; j >= 0; j--) // start at end,
            {
                if (item < queArray[j]) // if new item larger,
                {
                    queArray[j + 1] = queArray[j]; // shift upward
                } else // if smaller,
                {
                    break; // done shifting
                }
            } // end for
            queArray[j + 1] = item; // insert it
            nItems++;
        } // end else (nItems > 0)
    } // end insert()
    // -------------------------------------------------------------

    public long remove() // remove minimum item
    {
        long h = queArray[0];

        for (int i = 0; i < nItems - 1; i++) {
            queArray[i] = queArray[i + 1];
        }
        nItems--;
        return h;
    }

    // -------------------------------------------------------------
    public long peekMin() // peek at minimum item
    {
        return queArray[0];
    }

    // -------------------------------------------------------------
    public boolean isEmpty() // true if queue is empty
    {
        return (nItems == 0);
    }

    // -------------------------------------------------------------
    public boolean isFull() // true if queue is full
    {
        return (nItems == maxSize);
    }
	// -------------------------------------------------------------
    public static void main(String[] args) {
		
		revisedPriorityQ PQ = new revisedPriorityQ(5);
		
		PQ.insert(30);
		PQ.insert(50);
		PQ.insert(10);
		PQ.insert(40);
		PQ.insert(20);

		while (!PQ.isEmpty()) {
			long item = PQ.remove();
			System.out.print(item + " "); // 10, 20, 30, 40, 50
		} // end while
		System.out.println("");
	} // end main()
	// -------------------------------------------------------------
}
run:
10 20 30 40 50 
BUILD SUCCESSFUL (total time: 0 seconds)

