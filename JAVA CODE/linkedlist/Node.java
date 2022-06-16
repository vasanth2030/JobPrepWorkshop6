package linkedlist;

public class Node {
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		next=null;
	}

	public static void insertNodeAtEnd(Node head,int data)
	{
		Node newNode= new Node(data);
		
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		
		curr.next=newNode;
	}
	
	public static void printLinkedList(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" --> ");
			curr=curr.next;
		}
		System.out.println();
	}
}
