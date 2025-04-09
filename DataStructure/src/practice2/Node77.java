package practice2;

public class Node77 extends Object  {
	private int data;
	 private Node77 next;

	public Node77(int data, Node77 next) {
		super();
		this.setData(data);
		this.setNext(next);
	}

	public Node77() {
		super();
		
	}

	public Node77(int data) {
		super();
		this.setData(data);
	}

	public Node77 getNext() {
		return next;
	}

	public void setNext(Node77 next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	

}
