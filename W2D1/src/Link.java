/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mena
 */
public class Link {

    public long dData;                 // data item
    public Link next;                  // next link in list
//-------------------------------------------------------------

    public Link(long d) // constructor
    {
        this.dData = d;
     	this.next = null;
    }
//-------------------------------------------------------------

    Link() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void displayLink() // display this link
    {
        System.out.print(dData + " ");
    }
//-------------------------------------------------------------

    void insertFirst(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}  // end class Link
////////////////////////////////////////////////////////////////

