/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author mena
 */
public class Student {

    private int id;
    private String name;
    private int mark;

    //--------------------------------------------------------------
    public Student(int id, String name, int mark) // constructor to initialize the values
    {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
//--------------------------------------------------------------

    public void displayStudent() {
        System.out.println(id + " " + name + " " + mark + " ");
    }
//--------------------------------------------------------------

    public int getId() // get the Id
    {
        return id;
    }  // end class Student
    
    public int getmark() // get the Id
    {
        return mark;
    }  // end class Student

    ////////////////////////////////////////////////////////////////
    

}
