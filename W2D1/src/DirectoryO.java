/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mena
 */
public class DirectoryO {
    private Directory head; 
	private Directory tail; 
	private int size;
	
	public DirectoryO(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public void insertFirst(String name, long number){
		Directory newDirectory = new Directory(name, number);
		
		if(head == null){
			head = tail = newDirectory;
		} else {
			newDirectory.next = head;
			head = newDirectory;
		}

		size++;
	}
	
	public void insertLast(String name, long number){
		Directory newDirectory = new Directory(name, number);
		
		if(tail == null){
			tail = head = newDirectory;
		} else {
			tail.next = newDirectory;
			tail = newDirectory;
		}
		
		size++;
	}
	
	public Directory deleteFirst(){
		Directory first = head;
		if(head == tail){
			head = tail = null;
		} else {
			head = head.next;
		}
		size--;
		return first;
	}
	
	public int size(){
		return size;
	}
	
	public void displayList(){
		for(Directory directory = head; directory != null; directory = directory.next){
			System.out.println(directory);
		}
	}
	
	public Directory find(String name){
		for(Directory directory = head; directory != null; directory = directory.next){
			if(directory.name.equals(name))
				return directory;
		}
		
		return null;
	}

}
