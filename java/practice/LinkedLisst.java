package com.java.practice;

import java.util.LinkedList;

public class LinkedLisst {
	
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int dataC){
			data = dataC;
			next = null;
		}
		
	}
	
   public static void main(String args[]) {
		
	   LinkedLisst llist = new LinkedLisst(); 
	   llist.head = new Node(1);
	   Node second = new Node(2);
	   Node third = new Node(3);
	   llist.head.next = second; // Link first node with the second node 
       second.next = third; 
	   Node n = llist.head;
	   while(n!=null) {
		   System.out.println(n.data + " ");
		   n = n.next;
	   }
	   
	   
      
	}

}
