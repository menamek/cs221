/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d2;

/**
 *
 * @author mena
 */
public class Employee {

    int id;
    String name;
    Employee leftChild, rightChild;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayEmployee() {
        System.out.println(id + ", " + name);
    }

    public String toString() {
        return name + " " + id;
    }
}
