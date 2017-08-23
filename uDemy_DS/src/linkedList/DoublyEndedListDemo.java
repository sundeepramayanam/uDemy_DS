package linkedList;

public class DoublyEndedListDemo {

	public static void main(String[] args) {
		DoublyEndedList dlist = new DoublyEndedList();

		dlist.insertAtTail(5);
		dlist.insertAtTail(10);
		dlist.insertAtTail(15);
		dlist.insertAtTail(20);
		dlist.insertAtTail(25);
		dlist.insertAtTail(30);

		System.out.println(dlist);
//			list.deleteFromHead();

//			System.out.println(list);
//			System.out.println("Length: " + list.length());
//			System.out.println("Found: "+list.find(4));

	}

}
