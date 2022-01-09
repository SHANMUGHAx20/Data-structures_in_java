package esan;
public class StackList {
   int data;
   StackList next;
   StackList top=null;
   void push(int val) {
	   StackList newNode=new StackList();
	   newNode.data=val;
	   newNode.next=null;
	   if(top==null)
		   top=newNode;
	   else {
		   newNode.next=top;
		   top=newNode;
	   }	   
   }
   int pop() {
	   if(top==null)
	   {
		   System.out.println("Stack is underflow");
		   return 0;
	   }
	   else {
		   int v=top.data;
		   top=top.next;
		   return v;
	   }
   }
   int peek() {
	   if(top==null)
	   {
		   System.out.println("Stack is Empty");
		   return 0;
	   }
	   else
		   return top.data;
   }
}
