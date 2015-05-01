/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mena
 */
public class StackY {

    private int maxSize;        // size of stack array
    private long[] stackArray;
    private int top;            // top of stack
//--------------------------------------------------------------

    public StackY(int s) // constructor
    {
        maxSize = s;             // set array size
        stackArray = new long[maxSize];  // create array
        top = -1;                // no items yet
    }

//--------------------------------------------------------------
    public void push(long j) // put item on top of stack
    {
        if (!isFull()) {
            stackArray[++top] = j;
        } else {
            System.out.println(" is full");    // increment top, insert item
        }
    }

//--------------------------------------------------------------
    public long pop() // take item from top of stack
    {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println(" cant delet");    // increment top, insert item
        }
        return 0;
    }

//--------------------------------------------------------------
    public long peek() // peek at top of stack
    {
        return stackArray[top];
    }
//--------------------------------------------------------------

    public boolean isEmpty() // true if stack is empty
    {
        return (top == -1);
    }
//--------------------------------------------------------------

    public boolean isFull() // true if stack is full
    {
        return (top == maxSize - 1);
    }

    public int size() {
        return top + 2;
    }

    public void clear() {
        while (!isEmpty()) {
            pop();

        }
    }

    public boolean find(long id) {
        int j;
        for (j = 0; j < top; j++) // for each element,
        {
            if (stackArray[j] == id) {
                break;
            } else if (j == top) {
                return false;
            }
        }

        return true;
    }


    public String toString() {
        String out = "";
        for (int i = top; i >= 0; i--) {
            out = out + stackArray[i] + " ";
        }

        return "[ " + out + "]";
    }

//--------------------------------------------------------------
}  // end class StackX 
////////////////////////////////////////////////////////////////

class StackApp {
     public static StackY merge(StackY s1, StackY s2) {
        StackY s3 = new StackY(s1.size() + s2.size());
        while (!s1.isEmpty()) {
            s3.push(s1.pop());
        }
        while (!s2.isEmpty()) {
            s3.push(s2.pop());
        }
        return s3;
    }

    public static void main(String[] args) {
        
        StackY s = new StackY(4);
        StackY ss = new StackY(2);
        
        s.push(1);
        s.push(2);
        s.push(2);
        ss.push(5);
        ss.push(6);
        
        StackY sss=merge(s,ss);
        System.out.println(sss);
        
        StackY theStack = new StackY(7);  // make new stack
        theStack.push(20);               // push items onto stack
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        theStack.push(100);
        theStack.push(20);               // push items onto stack
        theStack.push(40);
        theStack.push(40);

        System.out.println(theStack);
        System.out.println(theStack.size());
        System.out.println(theStack.find(85));

        theStack.pop();               // push items onto stack
        theStack.pop();
        theStack.pop();
        theStack.pop();
        theStack.pop();
        theStack.pop();
        theStack.pop();
        theStack.pop();

    }  // end main()

}  // end class StackApp
/*
run:
[ 5 6 1 2 2 ]
 is full
[ 40 20 100 80 60 40 20 ]
8
true
 cant delet
BUILD SUCCESSFUL (total time: 0 seconds)

*/