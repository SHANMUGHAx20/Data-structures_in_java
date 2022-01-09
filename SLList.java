package esan;
public class SLList {
         int data;
         SLList next;
         SLList head=null;
    void create(int val) {
    	SLList newNode=new SLList();
    	newNode.data=val;
    	newNode.next=null;
    	if(head==null)
    		head=newNode;
    	else {
    		SLList t=head;
    		while(t.next!=null) 
    			t=t.next;
    		t.next=newNode;
    	}
    }
    void inFirst(int val) {
    	SLList newNode=new SLList();
    	newNode.data=val;
    	newNode.next=null;
    	if(head==null)
    		head=newNode;
    	else {
    		newNode.next=head;
    		head=newNode;
    	}
    }
    void inLast(int val) {
    	SLList newNode=new SLList();
    	newNode.data=val;
    	newNode.next=null;
    	if(head==null)
    		head=newNode;
    	else {
    		SLList t=head;
    		while(t.next!=null)
    			t=t.next;
    		t.next=newNode;
    	}
    }
    void inMiddle(int val,int p) {
    	SLList newNode=new SLList();
    	newNode.data=val;
    	newNode.next=null;
    	SLList fd=head;
    	SLList fw=head;
    	for(int i=1;i<p;i++) {
    		fw=fd;
    		fd=fd.next;
    	}
    	fw.next=newNode;
    	newNode.next=fd;
    }
    void delFirst() {
    	if(head==null)
    		System.out.println("List is Empty");
    	else
    		head=head.next;
    }
    void delLast() {
    	if(head==null)
    		System.out.println("List is Empty");
    	else if(head.next==null)
    		head=null;
    	else {
    		SLList fd=head;
    		SLList fw=head;
    		while(fd.next!=null) {
    			fw=fd;
    			fd=fd.next;
    		}
    		fw.next=null;
    	}
    }
    void delMiddle(int p) {
    	if(head==null)
    		System.out.println("List is Empty");
    	else {
    	     SLList fd=head;
    	     SLList fw=head;
    	     for(int i=1;i<p;i++) {
    	    	 fw=fd;
    	    	 fd=fd.next;
    	     }
    	     fw.next=fd.next;
    	}
    }
    boolean searchNode(int key) {
    	if(head==null)
    		return false;
    	else {
    		SLList t=head;
    		while(t!=null) {
    			if(t.data==key)
    				return true;
    			t=t.next;
    		}
    		return false;
    	}
    }
    void display() {
    	if(head==null)
    		System.out.println("List is Empty");
    	else {
    		SLList t=head; 
    		while(t!=null) {
    			System.out.print(t.data+"-->");
    			t=t.next;                      
    		}
    		System.out.println("null");
    	}
    }
}

