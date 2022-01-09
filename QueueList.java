package esan;
public class QueueList {
   int data;
   QueueList next;
   QueueList front=null;
   QueueList rear=null;
   void enQueue(int val) {
	   QueueList newNode=new QueueList();
	   newNode.data=val;
	   newNode.next=null;
	   if(front==null) {
		   front=newNode;
		   rear=newNode;
	   }
	   else
	   {
		 rear.next=newNode;
		 rear=newNode;
	   }	   
   }
   void deQueue() {
	   if(front==null)
		   System.out.println("Queue is Empty");
	   else if(front.next==null) {
		   front=null;
		   rear=null;
	   }
	   else
		   front=front.next;
   }
   void diplay() {
	   if(front==null)
		   System.out.println("Queue is Empty");
	   else
	   {
		   QueueList t=front;
		   while(t!=null) {
			   System.out.print(t.data+"-->");
			   t=t.next;
		   }
		   System.out.println("null");
	   }
   }
}
