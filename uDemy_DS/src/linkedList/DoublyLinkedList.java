package linkedList;

public class DoublyLinkedList {
	public DoublyLinkedNode head;

	public void insertAtHead(int data) {
		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		newNode.setNextNode(this.head);
		if (this.head != null) {
			this.head.setPreviousNode(newNode);
		}
		this.head = newNode;
	}

	public String toString() {
		String result = "[ null <-> ";
		DoublyLinkedNode current = this.head;

		while (current != null) {
			result += current.toString() + " <-> ";
			current = current.getNextNode();
		}
		result += " null ]";

		return result;
	}
}
