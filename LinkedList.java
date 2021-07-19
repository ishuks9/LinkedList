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
