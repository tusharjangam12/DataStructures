package practice2;

public class MainSLL77 {

	public static void main(String[] args) {
		
    SinglyLL77 s = new SinglyLL77 ();
    s.addFirst(24);
    s.addFirst(33);
    s.addFirst(44);
    s.addFirst(55);
    s.addFirst(66);
    s.display();
    s.addLast();
    s.display();
    s.addMiddle();
    s.display();
    s.deleteFirst();
    s.display();
    s.deleteLast();
    s.display();
    s.deleteMiddle();
    s.display();
}
	}
