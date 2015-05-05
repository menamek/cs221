/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mena
 */
public class LinkList {

    private Link head;
    private int size;

    public LinkList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void insertFirst(int data) {
        Link newLink = new Link(data);
        newLink.next = head;
        head = newLink;
        size++;
    }

    public long deleteFirst() {
        Link temp = head;
        head = head.next;
        size--;
        return temp.dData;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = head;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public int size() {
        return size;
    }

    public boolean find(int data) {
        for (Link link = head; link != null; link = link.next) {
            if (link.dData == data) {
                return true;
            }
        }
        return false;
    }

    public long max() throws Exception {
        if (isEmpty()) {
            throw new Exception("List is empty");
        }
        long max = head.dData;
        for (Link link = head.next; link != null; link = link.next) {
            if (link.dData > max) {
                max = link.dData;
            }
        }
        return max;

    }

    public long min() throws Exception {
        if (isEmpty()) {
            throw new Exception("List is empty");
        }
        long min = head.dData;
        for (Link link = head.next; link != null; link = link.next) {
            if (link.dData < min) {
                min = link.dData;
            }
        }
        return min;

    }

}
