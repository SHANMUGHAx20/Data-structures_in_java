package esan;
import java.util.Scanner;
public class PriorityQueueDemo {
	final static int SIZE=5;
	 int val;
	 int pty;
	static PriorityQueueDemo pq[]=new PriorityQueueDemo[SIZE];
	static int rear=-1;
	static void enQueue(int v,int p) {
		if(rear==SIZE-1)
			System.out.println("Queue is overflow");
		else {
			rear++; 
			pq[rear]=new PriorityQueueDemo();
			pq[rear].val=v;
			pq[rear].pty=p;
		}
	}
	static int deQueue() {
		int i,j,v=0,p;
		if(rear==-1)
		{
			System.out.println("Queue is underflow");
			return 0;
		}
		else {
			p=getHighPriority();
			for(i=0;i<=rear;i++) {
				if(p==pq[i].pty)
				{
					v=pq[i].val;
					break;
				}
			}
		}
		if(i<rear) {
			for(j=i;j<rear;j++) {
				pq[j].val=pq[j+1].val;
				pq[j].pty=pq[j+1].pty;
			}
		}
		rear--;
		return v;
	}
	static int getHighPriority() {
		if(rear==-1)
			return -1;
		else {
			int i,p=-1;
			for(i=0;i<=rear;i++) {
				if(pq[i].pty>p)
					p=pq[i].pty;
			}
			return p;
		}
	}
	static void display() {
		if(rear==-1)
			System.out.println("Queue is Empty");
		else {
			for(int i=0;i<=rear;i++)
				System.out.println("Val="+pq[i].val+" Priority="+pq[i].pty);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean repeat=true;
		while(repeat) {
			System.out.println("1.enQueue\n2.deQueue\n3.getHighPriority\n4.display\nothers exit");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter Value and Priority");
				enQueue(sc.nextInt(),sc.nextInt());
				break;
			case 2:
				System.out.println("deQueued Value="+deQueue());
				break;
			case 3:
				System.out.println("High Priority="+getHighPriority());
				break;
			case 4:
				display();
				break;
			default:
				repeat=false;
			}
		}
        sc.close();
	}

}
