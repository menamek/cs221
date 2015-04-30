/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d3;

/**
 *
 * @author mena
 */
public class TestStu {
    public static void main(String[] args) {
        // Create an object for StudentArray and invoke all the methods      
        // Find the student who got Maximum and Minimum Mark

        StudentArray s = new StudentArray(15);
            s.insert(12,"m",12);
            s.insert(14,"men",19);
            s.insert(13,"me",17);
            s.insert(15,"menn",20);
            s.find(13).displayStudent();
            s.find(14).displayStudent();
            s.maxmark();
            s.minmark();
       
    }  //
    
}
