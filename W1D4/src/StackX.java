
import static java.lang.System.in;
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mena
 */
public class StackX {

    private int maxSize;        // size of stack array
    private long[] stackArray;
    private int top;

    public StackX(int s) // constructor
    {
        maxSize = s;             // set array size
        stackArray = new long[maxSize];  // create array
        top = -1;                // no items yet
    }

    public void push(long j) throws Exception {
        if (!isFull()) {
            stackArray[++top] = j;
        } else {
            throw new Exception("stack is full.");
        }
    }

    public long pop() throws Exception {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            throw new Exception("stack is empty.");
        }
    }

    public long peek() throws Exception {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            throw new Exception("stack is empty.");
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public String toString() {
        String out = "";
        for (int i = top; i >= 0; i--) {
            out = out + stackArray[i] + " ";
        }

        return "[ " + out + "]";
    }

    public static void main(String[] args) {
        StackX s = new StackX(4);
        long n;
        int input;
        while (true) {
            System.out
                    .println("enter 1 to push, 2 to pop, 3 to peek, 4 to quit: ");
            Scanner in = new Scanner(System.in);
            input = in.nextInt();
            switch (input) {
                case 1:
                    try {

                        System.out.print("enter the number to push: ");
                        n = in.nextInt();
                        s.push(n);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        n = s.pop();
                        System.out.println("pooped number is " + n);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        n = s.peek();
                        System.out.println("peeked number is " + n);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("good bye!");
                    return;
                default:
                    System.out.println("invalid commaned ");

            }
        }
    }

}
/*
run:
enter 1 to push, 2 to pop, 3 to peek, 4 to quit: 
1
enter the number to push: 5
enter 1 to push, 2 to pop, 3 to peek, 4 to quit: 
5
invalid commaned 
enter 1 to push, 2 to pop, 3 to peek, 4 to quit: 
2
pooped number is 5
enter 1 to push, 2 to pop, 3 to peek, 4 to quit: 
65
invalid commaned 
enter 1 to push, 2 to pop, 3 to peek, 4 to quit: 
5
invalid commaned 
enter 1 to push, 2 to pop, 3 to peek, 4 to quit: 
3
stack is empty.
enter 1 to push, 2 to pop, 3 to peek, 4 to quit: 
4
good bye!
*/