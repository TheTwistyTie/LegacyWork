public class LinkedList{

	private Node root = null;
	private Node last = null;
	private Node pointer = null;
	private boolean circularList = false;

	private class Node{
		private Node next = null;
		private Node previous = null;
		private Object data = null;

		public Node(Object data){
			this.data = data;
		}

		public void setNext(Node next){
			this.next = next;
		}

		public void setPrevious(Node previous){
			this.previous = previous;
		}

		public void setData(Object data){
			this.data = data;
		}

		public Node getNext(){
			return next;
		}

		public Node getPrevious(){
			return previous;
		}

		public Object getData(){
			return data;
		}

	}

	public LinkedList(Object data){
		root = new Node(data);
	}

	public void makeCircular(){
		circularList = true;
	}

	public void makeLinear(){
		circularList = false;
	}

	public Object getData(){
		return pointer.getData();
	}

	public void first(){
		pointer = root;
	}

	public void last(){
		pointer = last;
	}

	public void next(){
		if(hasNext()){
			pointer = pointer.getNext();
		}
		else if(circularList){
			pointer = root;
		}
		else{
			throw new LinkedListRuntimeException("End of list has beeen reached");
		}
	}

	public boolean hasNext(){
		if(pointer.getNext() == null){
			return false;
		}
		else{
			return true;
		}
	}

	public void previous(){
		if(hasPrevious()){
			pointer = pointer.getPrevious();
		}
		else if(circularList){
			pointer = last;
		}
		else {
			throw new LinkedListRuntimeException("Begining of list has beeen reached");
		}
	}

	public boolean hasPrevious(){
		if(pointer.getPrevious() == null){
			return false;
		}
		else{
			return true;
		}
	}

	public void addAfter(Object data){
		Node newNode = new Node(data);
		if(isEmpty()){
			add(data);
		}
		else if(hasNext()){
			newNode.setNext(pointer.getNext());
			pointer.setNext(newNode);
			newNode.setPrevious(pointer);
		}
		else{
			pointer.setNext(newNode);
			newNode.setPrevious(pointer);
			last = newNode;
		}
	}

	public void addBefore(Object data){
		Node newNode = new Node(data);
		if(isEmpty()){
			add(data);
		}
		else if(hasPrevious()){
			newNode.setPrevious(pointer.getPrevious());
			pointer.setPrevious(newNode);
			newNode.setNext(pointer);
		}
		else{
			pointer.setPrevious(newNode);
			newNode.setNext(pointer);
			root = newNode;
		}
	}

	public void emptyList(){
		root = null;
		last = null;
		pointer = null;
	}

	public void add(Object data){
		Node newNode = new Node(data);
		if(isEmpty()){
			root = newNode;
			last = newNode;
			pointer = newNode;
		}
		else{
			last.setNext(newNode);
			newNode.setPrevious(last);
			last = newNode;
		}
	}

	public boolean isEmpty(){
		if(root == null){
			return true;
		}
		else{
			return false;
		}
	}
}