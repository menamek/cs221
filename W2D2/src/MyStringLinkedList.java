/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mena
 */
public class MyStringLinkedList {

    class Node {

        String value;
        Node next;
        Node previous;

        Node(String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

    }
    Node first;
    Node last;

    MyStringLinkedList() {
        first = null;
    }

    public void addFront(String item) {
        if (first == null) {
            first = new Node(item);
        } else {
            Node n = new Node(item);

            first.previous = n;
            n.next = first;
            first = n;
        }

    }

    public void addLast(String item) {
        Node n = new Node(item);
        if (first == null) {
            first = n;
        } else {
            Node lastNode = findLast();
            lastNode.next = n;
            n.previous = lastNode;
            last = n;
        }

    }

    public void postAddNode(Node n, String value) {
        Node newNode = new Node(value);
        if (n.next == null) {
            addLast(value);
        } else {

            newNode.next = n.next;
            newNode.previous = n;
            n.next.previous = newNode;
            n.next = newNode;
        }
    }

    public int Size() {
        int x = 0;
        while (first.next != null) {
            x = x + 1;
        }
        return x;

    }

    public boolean isEmpty() {
        return first == null;
    }

    public void preAddNode(Node n, String value) {
        Node newNode = new Node(value);
        if (n == first) {
            addFront(value);
        } else {
            newNode.next = n;
            newNode.previous = n.previous;
            n.previous.next = newNode;
            n.previous = newNode;
        }
    }

    public Node findLast() {
        if (first == null) {
            return null;
        } else if (first.next == null) {
            return first;
        } else {
            Node x = first;
            while (x.next != null) {
                x = x.next;
            }
            return x;
        }
    }

    public Node findItem(String str) {
        Node x = first;
        while (x.next != null) {
            if (x.value == str) {
                break;
            }
            x = x.next;
        }
        return x;
    }

    public void deleteNode(Node n) {
        if (n == first) {
            if (first.next == null) {
                first = null;
            } else {
                first = n.next;
                first.previous = null;
                n = null;
            }
        } else if (n.next == null) {
            n.previous.next = null;
            n = null;
        } else {
            n.previous.next = n.next;
            n.next.previous = n.previous;
            n = null;
        }
    }

    public void deleteList() {
        if (first.next == null) {
            first = null;
        } else {
            Node x = findLast();
            while (x.previous != null) {
                deleteNode(x);
                x = findLast();
                if (x.previous == null) {
                    deleteNode(x);
                }
            }
        }
    }

    public void printReverse() {
        String str = "";
        Node temp = findLast();
        while (temp != null) {
            str = str + "==>[" + temp.value.toString() + "]";
            temp = temp.previous;
        }
        str = str + "==>[" + "NULL" + "]";
        System.out.println(str);

    }

    public static void main(String[] args) {
        try {
            MyStringLinkedList list = new MyStringLinkedList();

            list.addFront("menna");
            list.addFront("men");
            list.addFront("me");
            list.addLast("m");

            list.printReverse();
            
           list.deleteNode(list.findItem("m"));
            list.printReverse();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
