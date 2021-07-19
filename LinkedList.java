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
	
	public void removeAt(int pos){
		int tempPos=0;
		Node<T> tempPrev=root; 
		Node<T> tempCurrent=root;
		if(pos==0){
			root=root.next;
			
		}else if(pos==(this.size()-1)){
			while(tempCurrent.next!=null){
				tempPrev=tempCurrent;
				tempCurrent=tempCurrent.next;
			}
			tempPrev.next = tempPrev.next.next;
			end=tempPrev;
		}else if(pos<this.size()){
			while(tempCurrent.next!=null){
				if(pos==tempPos){	
					tempPrev.next=tempPrev.next.next;
					break;
				}
				tempPrev=tempCurrent;
				tempCurrent=tempCurrent.next;
				tempPos++;
			}
		}else{
			System.out.println("Given index does not exist");
		}
		
	}
	//Delete first element
	public T pop(){
		T data=end.data;
		removeAt(this.size()-1);
		return data;
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
