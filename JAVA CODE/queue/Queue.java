package queue;

public class Queue {
	int arr[];
	int capacity;
	int front;
	int rear;
	
	Queue(int capacity)
	{
		this.capacity=capacity;
		arr=new int[capacity];
		front = rear =0;
	}
	
	public void enqueue(int data)
	{
		if(rear==capacity)
			System.out.println("Queue is full.");
		else {
			arr[rear]=data;
			rear++;
		}
	}
	
	public void dequeue()
	{
		if(front == rear)
			System.out.println("Queue is empty.");
		else {
			for(int i=0;i<rear-1;i++)
			{
				arr[i]=arr[i+1];
			}
			rear--;
		}
	}
	
	public void printQueue()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.print(arr[i]+" <-- ");
		}
		System.out.println();
	}

}
