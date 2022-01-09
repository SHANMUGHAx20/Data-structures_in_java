package esan;
public class LinearProbe {
  final int SIZE=6;
  int h[]=new int[SIZE];
  LinearProbe() {
	  for(int i=0;i<SIZE;i++)
		  h[i]=-1;
  }
  void insert(int key) {
	  int i,ind=key%SIZE;
	  if(h[ind]==-1)
		  h[ind]=key;
	  else {
		  for(i=1;i<SIZE;i++) {
			  int newind=(ind+i)%SIZE;
			  if(h[newind]==-1) {
				  h[newind]=key;
				  break;
			  }
		  }
		  if(i==SIZE)
			  System.out.println("Hash table is Overflow");
	  }
  }
  boolean search(int key) {
	  int ind=key%SIZE;
	  if(h[ind]==key)
		  return true;
	  else {
		  for(int i=1;i<SIZE;i++) {
			  int newind=(ind+i)%SIZE;
			  if(h[newind]==key) 
				  return true;
		  }
		  return false;
	  }
  }
  void display() {
	  for(int i=0;i<SIZE;i++)
		  System.out.println("Index "+i+"="+h[i]);
  }
}
