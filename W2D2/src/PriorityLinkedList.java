/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mena
 */
public class PriorityLinkedList {

    Node head;

    public PriorityLinkedList() {
        head = null;
    }

    public void insert(int key) {
        if (isEmpty()) {
            head = new Node(key);
        } else {
            Node newNode = new Node(key);

            if (newNode.key < head.key) {
                newNode.next = head;
                head = newNode;
            } else {
                Node prevNode;
                for (prevNode = head; prevNode.next != null; prevNode = prevNode.next) {
                    if (newNode.key < prevNode.next.key) {
                        break;
                    }
                }
                newNode.next = prevNode.next;
                prevNode.next = newNode;
            }
        }
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Priority queue is empty.");
        }

        int key = head.key;

        head = head.next;

        return key;
    }

    public int pick() throws Exception {
        if (isEmpty()) {
            throw new Exception("Priority queue is empty.");
        }

        return head.key;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder("[");

        if (head != null) {
            builder.append(head.key);
        }

        for (Node n = head.next; n != null; n = n.next) {
            builder.append(", ").append(n.key);
        }

        builder.append("]");

        return builder.toString();
    }

    class Node {

        int key;
        Node next;

        public Node(int key) {
            this.key = key;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        try {
            PriorityLinkedList queue = new PriorityLinkedList();

            queue.insert(15);
            queue.insert(10);
            queue.insert(25);
            queue.insert(0);
            queue.insert(40);
            queue.insert(20);

            System.out.println(queue);

            System.out.println("Remove: " + queue.remove());

            System.out.println(queue);

            System.out.println("Pick: " + queue.pick());

            while (!queue.isEmpty()) {
                System.out.println(queue.remove());
            }

            System.out.println("isEmpty: " + queue.isEmpty());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
