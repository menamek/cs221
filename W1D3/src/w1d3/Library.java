/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d3;

import java.util.ArrayList;

/**
 *
 * @author mena
 */
public class Library {
    int bookID;
    String ISBN;
    String bookName;
    double price;
// Create a constructor to initialize the values

    public Library(int bookID, String ISBN, String bookName, double price) {
        this.bookID = bookID;
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.price = price;
    }
public static void main(String args[]) {
    ArrayList<Library> l = new ArrayList<Library>();
    l.add(new Library(123,"bjhb","khk",12.00));
    l.add(new Library(124,"bjhb","khk",12.00));
    System.out.println("size befor remove is " +l.size());
    l.get(0);
    l.remove(1);
    l.isEmpty();
    System.out.println("size after remove is "+ l.size());
    
    
    
}
    
}


size befor remove is 2
size after remove is 1
