package esan;
public class CSLList {
     int data;
     CSLList next;
     CSLList head=null;
     void create(int val) {
    	 CSLList newNode=new CSLList();
    	 newNode.data=val;
    	 newNode.next=null;
    	 if(head==null) {
    		 head=newNode;
    		 head.next=head;
    	 }
    	 else {
    		 CSLList t=head;
    		 while(t.next!=head)
    			 t=t.next;
    		 t.next=newNode;
    		 newNode.next=head;
    	 }
     }
     void inFirst(int val) {
    	 CSLList newNode=new CSLList();
    	 newNode.data=val;
    	 newNode.next=null;
    	 if(head==null) {
    		 head=newNode;
    		 head.next=head;
    	 }
    	 else {
    		 CSLList t=head;
    		 while(t.next!=head)
    			 t=t.next;
    		 newNode.next=head;
    		 head=newNode;
    		 t.next=head;
    	 }
     }
     void inLast(int val) {
    	 CSLList newNode=new CSLList();
    	 newNode.data=val;
    	 newNode.next=null;
    	 if(head==null) {
    		 head=newNode;
    		 head.next=head;
    	 }
    	 else {
    		 CSLList t=head;
    		 while(t.next!=head)
    			 t=t.next;
    		 t.next=newNode;
    		 newNode.next=head;
    	 }
     }
     void inMiddle(int val,int p) {
    	CSLList newNode=new CSLList();
     	newNode.data=val;
     	newNode.next=null;
     	CSLList fd=head;
     	CSLList fw=head;
     	for(int i=1;i<p;i++) {
     		fw=fd;
     		fd=fd.next;
     	}
     	fw.next=newNode;
     	newNode.next=fd;
     }
     void delFirst() {
    	 if(head==null)
    		 System.out.println("CLL is Empty");
    	 else if(head.next==head)
    		 head=null;
    	 else {
    		 CSLList t=head;
    		 while(t.next!=head)
    			t=t.next; 
    		 head=head.next;
    		 t.next=head;
    	 }
     }
     void delLast() {
    	 if(head==null)
    		 System.out.println("CLL is Empty");
    	 else if(head.next==head)
    		 head=null;
    	 else {
    		 CSLList fd=head;
    		 CSLList fw=head;
    		 while(fd.next!=head) {
    			 fw=fd;
    			 fd=fd.next;
    		 }
    		 fw.next=head;
    	 }
     }
     void delMiddle(int p) {
    	 if(head==null)
     		System.out.println("CLL is Empty");
     	else {
     	     CSLList fd=head;
     	     CSLList fw=head;
     	     for(int i=1;i<p;i++) {
     	    	 fw=fd;
     	    	 fd=fd.next;
     	     }
     	     fw.next=fd.next;
     	}
     }
     void display() {
    	 if(head==null)
    		 System.out.println("CLL is Empty");
    	 else {
    		 CSLList t=head;
    		 while(t.next!=head) {
    			 System.out.print(t.data+"-->");
    			 t=t.next; 
    		 }
    		 System.out.println(t.data+"-->head");
    		 t=t.next;
    		 System.out.println(t.data+"=head");
    	 }
     }
}
