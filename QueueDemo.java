package esan;
import java.util.Scanner;
public class QueueDemo {
	final static int SIZE=5;
	static int q[]=new int[SIZE];
	static int front=-1;
	static int rear=-1;
	static void enQueue(int v) {
		if(rear==SIZE-1)
			System.out.println("Queue is Overflow");
		else {
			if(front==-1&&rear==-1)
				front=0;
			q[++rear]=v;
		}
	}
	static int deQueue() {
		if(front==-1) {
			System.out.println("Queue is Underflow");
			return 0;
		}
		int v=q[front];
		front++;
		if(front>rear)
		{
			front=-1;
			rear=-1;
		}
		return v;	
	}
	static void display() {
		if(front==-1)
			System.out.println("Queue is Empty");
		else {
			for(int i=front;i<=rear;i++)
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
				  System.out.println("Dequeued Value="+deQueue());
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
