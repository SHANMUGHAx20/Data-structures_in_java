package esan;
import java.util.Scanner;
public class CircularQueueDemo {
	final static int SIZE=4;
	static int q[]=new int[SIZE];
	static int front=-1;
	static int rear=-1;
	static void enQueue(int v) {
		if((front==0&&rear==SIZE-1)||front==rear+1)
			System.out.println("Queue is Overflow");
		else 
			{
			if(front==-1) {
			front=0;
			rear=0;
		    }
		   else if(rear==SIZE-1)
			 rear=0;
		   else
			   rear++;
		   q[rear]=v;
	    }
	}
	static int deQueue() {
		if(front==-1)
		{
			System.out.println("Queue is underflow");
			return 0;
		}
		int v=q[front];
		if(front==rear) {
			front=-1;
			rear=-1;
		}
		else if(front==SIZE-1)
			front=0;
		else
			front++;
		return v;
	}
	static void display() {
		int i;
		if(front==-1)
			System.out.println("Queue is Empty");
		if(front>rear) {
			for(i=front;i<=SIZE-1;i++)
				System.out.println(q[i]);
			for(i=0;i<=rear;i++)
				System.out.println(q[i]);
		}
		else
		{
			for(i=front;i<=rear;i++)
				System.out.println(q[i]);
		}
	}
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  boolean repeat=true;
	  while(repeat) {
		  System.out.println("1.enQueue\n2.deQueue\n3.display\nothers exit");
		  switch(sc.nextInt()) {
		  case 1:
			  System.out.println("Enter Value");
			  enQueue(sc.nextInt());
			  break;
		  case 2:
			  System.out.println("deQueued Element="+deQueue());
			  break;
		  case 3:
			  display();
			  break;
		default:
				repeat=false;
		  }
	  }
      sc.close();
	}
}
