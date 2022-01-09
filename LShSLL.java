package esan;
public class LShSLL { 
      int data;
      LShSLL next;
      LShSLL head=null;
      void create(int val) {
    	  LShSLL newNode=new LShSLL();
    	  newNode.data=val;
    	  newNode.next=null;
    	  if(head==null)
    		  head=newNode;
    	  else {
    		  LShSLL t=head;
    		  while(t.next!=null)
    			  t=t.next;
    		  t.next=newNode;
    	  }
      }
      int findMax() {
    	  int max=Integer.MIN_VALUE;
    	  for(LShSLL t=head;t!=null;t=t.next)
    		  if(max<t.data)
    			  max=t.data;
    	  return max;
      }
      int findMin() {
    	  int min=Integer.MAX_VALUE;
    	  for(LShSLL t=head;t!=null;t=t.next)
    		  if(min>t.data)
    			  min=t.data;
    	  return min;
      }
}
