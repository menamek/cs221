
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import static sun.org.mozilla.javascript.internal.ScriptRuntime.name;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mena
 */
public class Admission {

    int adno; // Admission number 
    String name; // Name of the student
    String pno;  // Phone number

    public Admission(int adno, String name, String pno) {
        this.adno = adno;
        this.name = name;
        this.pno = pno;

    }

    public String toString() {
        return adno + " " + name + " " + pno + " ";
    }

    public static void main(String[] args) {
        Queue<Admission> m = new LinkedList<Admission>();
        String name[] = {"mena", "me", "m", "kl", "k"};
        String pno[] = {"mena", "me", "m", "kl", "k"};
        for (int i = 0; i < 5; i++) {
            m.add(new Admission(i + 1, name[i], pno[i]));

        }
        System.out.println(m.toString());
        System.out.println("The peek element is: " + m.peek());
        System.out.println("The size of the queue is: " + m.size());
        while (!m.isEmpty()) {
            System.out.println(m.remove());
        }
        System.out.println("queue is empty :" + m.isEmpty());

    }

}

run:
[1 mena mena , 2 me me , 3 m m , 4 kl kl , 5 k k ]
The peek element is: 1 mena mena 
The size of the queue is: 5
1 mena mena 
2 me me 
3 m m 
4 kl kl 
5 k k 
queue is empty :true
BUILD SUCCESSFUL (total time: 0 seconds)


