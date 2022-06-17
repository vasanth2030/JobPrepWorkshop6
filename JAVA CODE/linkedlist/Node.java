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
	
	public static Node insertAtPos(Node head,int data, int pos)
	{
		Node newNode = new Node(data);
		if(pos==1) {
			newNode.next=head;
			return newNode;
		}
		else
		{
			Node curr=head;
			for(int i=1;i<pos-1;i++)
			{
				curr=curr.next;
			}
			Node tempNode=curr.next;
			curr.next=newNode;
			newNode.next=tempNode;
			return head;
		}
	}
	
	public static Node deleteNode(Node head, int pos)
	{
		if(pos==1)
			return head.next;
		else {
			Node curr=head;
			for(int i=1;i<pos-1;i++)
			{
				if(curr.next==null)
					return head;
				curr=curr.next;
			}
			curr.next=curr.next.next;
			return head;
		}
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
