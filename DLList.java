package esan;
public class DLList {
	int data;
	DLList next;
	DLList prev;
	DLList head=null;
	void create(int val) {
		DLList newNode=new DLList();
		newNode.data=val;
		newNode.prev=null;
		newNode.next=null;
		if(head==null)
			head=newNode;
		else {
			DLList t=head;
			while(t.next!=null)
					t=t.next;
			t.next=newNode;
			newNode.prev=t;
		}
	}
	void inFirst(int val) {
		DLList newNode=new DLList();
		newNode.data=val;
		newNode.next=null;
		newNode.prev=null;
		if(head==null)
			head=newNode;
		else {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
	}
	void inLast(int val) {
		DLList newNode=new DLList();
		newNode.data=val;
		newNode.prev=null;
		newNode.next=null;
		if(head==null)
			head=newNode;
		else {
			DLList t=head;
			while(t.next!=null)
					t=t.next;
			t.next=newNode;
			newNode.prev=t;
		}
	}
	void inMiddle(int val,int p) {
		DLList newNode=new DLList();
		newNode.data=val;
		newNode.next=null;
		newNode.prev=null;
		DLList ft=head;
		for(int i=1;i<p;i++)
			ft=ft.next;
		DLList bk=ft.prev;
		bk.next=newNode;
		newNode.prev=bk;
		ft.prev=newNode;
		newNode.next=ft;
	}
	void delFirst() {
		if(head==null)
			System.out.println("DLL is Empty");
		else if(head.next==null)
			head=null;
		else {
			head=head.next;
			head.prev=null;
		}
	}
	void delLast() {
		if(head==null)
			System.out.println("DLL is Empty");
		else if(head.next==null)
			head=null;
		else{
			DLList ft=head;
			while(ft.next!=null)
					ft=ft.next;
			DLList bk=ft.prev;
			bk.next=null;
		}
	}
	void delMiddle(int p) {
		DLList ft=head;
		for(int i=1;i<p;i++)
			ft=ft.next;
		DLList bk=ft.prev;
		ft=ft.next;
		bk.next=ft;
		ft.prev=bk;			
	}
	void display() {
		if(head==null)
			System.out.println("DLL is Empty");
		else
		{
			DLList t=head;
			System.out.print("null<-->");
			while(t!=null) {
				System.out.print(t.data+"<-->");
				t=t.next;
			}
			System.out.println("null");
		}
	}
}
