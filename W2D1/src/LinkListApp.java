/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mena
 */
public class LinkListApp {
    public static void main(String[] args) {
		
		try{
		LinkList List = new LinkList();

		List.insertFirst(20);
		List.insertFirst(40);
		List.insertFirst(60);
		List.insertFirst(80);
		
		System.out.println("The List size is: " + List.size());
		System.out.println("find exsiting number: " + List.find(60));
		System.out.println("find none exsiting number: " + List.find(111));
		
		System.out.println("The maximum element is: "+ List.max());
		System.out.println("The minumem element is: " + List.min());

		List.displayList();

		while (!List.isEmpty()) {
			long xLink = List.deleteFirst();
			System.out.print("Deleted " + xLink);
			System.out.println("");
		}
		List.displayList();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

run:
The List size is: 4
find exsiting number: true
find none exsiting number: false
The maximum element is: 80
The minumem element is: 20
List (first-->last): 80 60 40 20 
Deleted 80
Deleted 60
Deleted 40
Deleted 20
List (first-->last): 
BUILD SUCCESSFUL (total time: 0 seconds)

