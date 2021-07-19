package com.bridgelabz.linkedlist;

public class LinkedList<T> {
	Node<T> root;
	Node<T> end;
	int size;

	public LinkedList() {
		root = null;
		end = null;
		size = 0;
	}

	public void push(T data) {
		Node<T> node = new Node<T>(data);
		if (this.isEmpty()) {
			root = node;
			end = node;
	
			
		} else {
			end.next = node;
			end = end.next;
		}
		size++;
	}
	
	public T get(int index){
		Node<T> tempCurrent=new Node(null);
		if(index>=0 && index<this.size()){
			tempCurrent=root;
			for(int i=0;i<index;i++){
				tempCurrent=tempCurrent.next;
			}
		}else{
			System.out.println("Invalid index");
		}
		
		return tempCurrent.data;
	}
	
	public int size() {
		Node temp = root;
		int size = 0;
		while (temp != null) {
			temp = temp.next;
			size++;
		}
		return size;
	}
	
	public boolean isEmpty(){
		if(root==null){
			return true;
		}
		return false;
	}
	
	public void printList(){
		Node<T> temp=root;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
}
}
