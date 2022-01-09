package esan;
public class SChain {
	final int SIZE=6;
  SChain ht[]=new SChain[SIZE];
  int data;
  SChain next;
  SChain() {
	  for(int i=0;i<SIZE;i++)
		  ht[i]=null;
  }
  void insert(int key) {
	  SChain newNode=new SChain();
	  newNode.data=key;
	  newNode.next=null;
	  int ind=key%SIZE;
	  if(ht[ind]==null)
		  ht[ind]=newNode;
	  else {
		  SChain t=ht[ind];
		  while(t.next!=null)
			  t=t.next;
		  t.next=newNode;
	  }
  }
  boolean search(int key) {
	  SChain t=ht[key%SIZE];
	  while(t!=null) {
		  if(t.data==key)
			  return true;
		  t=t.next;
	  }
	  return false;
  }
  void display() {
	  for(int i=0;i<SIZE;i++) {
		  System.out.print("Index "+i+" ");
		  SChain t=ht[i];
		  while(t!=null) {
			  System.out.print(t.data+"-->");
			  t=t.next;
		  }
		  System.out.println("null");
	  }
  }
}
