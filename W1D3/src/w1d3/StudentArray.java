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
public class StudentArray {

        private Student[] a;               // reference to array
        private int nElems;

        public StudentArray(int max) // constructor
        {
            a = new Student[max];
            nElems = 0;

        }
//--------------------------------------------------------------

        public Student find(int id) {
            int j;
            for (j = 0; j < nElems; j++) // for each element,
            if (a[j].getId()==id) {
                    break;
                }else if(j==nElems){
                   return null; 
                }
        
        return a[j];
}
        public void insert(int id, String name, int mark) // Duplicates of id not allowed. Make a check before inserting values
        {
            if (find(id) == null) 
                a[nElems] = new Student(id, name, mark);
                nElems++;
            
        }

        //--------------------------------------------------------------
        public boolean delete(int id) {     // delete student from array
            int j;
            for (j = 0; j < a.length; j++) // look for it
            {
                if (a[j].getId() == id) {
                    break;
                }
            }
            if (j == nElems) // can't find it
            {
                return false;
            } else // found it
            {
                for (int k = j; k < nElems; k++) // shift down
                {
                    a[k] = a[k + 1];
                }
                nElems--;                       // decrement size
                return true;
            }
        }  //--------------------------------------------------------------

        public void displayAll() // displays array contents
        {
            for (int j = 0; j < a.length; j++) // for each element,
            {
                System.out.print(a[j] + " ");
            }
        }
        
        public void maxmark(){
            int max=a[0].getmark();
            for (int j = 0; j < nElems; j++) // for each element,
            {
            if(a[j].getmark()>max)
                max=a[j].getmark();
               
            }System.out.println( "the max mark is"+ max);
        }
        public void minmark(){
            int min =a[0].getmark();
            for (int j = 0; j < nElems; j++) // for each element,
            {
            if(a[j].getmark()<min){
                min=a[j].getmark();
                
            }
        }System.out.println( "the min mark is"+min);
    }
}
