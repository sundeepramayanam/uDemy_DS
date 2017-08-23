package linkedList;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		DoublyLinkedList hello = new DoublyLinkedList();
		
		hello.insertAtHead(5);
		hello.insertAtHead(15);
		hello.insertAtHead(25);
		hello.insertAtHead(35);
		hello.insertAtHead(45);
		hello.insertAtHead(55);
		
		System.out.println(hello);
	}

}
