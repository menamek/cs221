/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mena
 */
public class Queue<D> {

    private int maxSize;
    private D[] queArray;
    private int front;
    private int rear;
    private int nItems;

    // --------------------------------------------------------------
    public Queue(int s) // constructor
    {
        maxSize = s;
        queArray = (D[]) new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    // --------------------------------------------------------------
    public void insert(D j) // put item at rear of queue
    {
        if (rear == maxSize - 1) // deal with wraparound
        {
            rear = -1;
        }
        queArray[++rear] = j; // increment rear and insert
        nItems++; // one more item
    }

    // --------------------------------------------------------------
    public D remove() // take item from front of queue
    {
        D temp = queArray[front++]; // get value and incr front
        if (front == maxSize) // deal with wraparound
        {
            front = 0;
        }
        nItems--; // one less item
        return temp;
    }

    // --------------------------------------------------------------
    public D peekFront() // peek at front of queue
    {
        return queArray[front];
    }

    // --------------------------------------------------------------
    public boolean isEmpty() // true if queue is empty
    {
        return (nItems == 0);
    }

    // --------------------------------------------------------------
    public boolean isFull() // true if queue is full
    {
        return (nItems == maxSize);
    }

    // --------------------------------------------------------------
    public int size() // number of items in queue
    {
        return nItems;
    }

    public void display() {
        StringBuilder bd = new StringBuilder("[");
        for (int i = 0; i < nItems; i++) {
            bd.append(queArray[i] + ",");
        }
        bd.append("]");
        System.out.println(bd.toString());

    }
    // --------------------------------------------------------------
public static void main(String[] args) {
		Queue<Integer> o = new Queue<Integer>(7);
		o.insert(10);
		o.insert(12);

		o.display();

		Queue<String> ob = new Queue<String>(7);

		ob.insert("menna");
		ob.insert("mena");
		ob.remove();

		ob.display();
		System.out.println(ob.peekFront());
	}
}
