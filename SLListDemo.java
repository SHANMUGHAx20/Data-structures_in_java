package esan;
import java.util.Scanner;
public class SLListDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SLList l=new SLList();
		boolean repeat=true;
		while(repeat) {
			System.out.println("1.create\n2.inFirst\n3.inLast\n4.inMiddle\n5.delFirst\n6.delLast\n7.delMiddle\n8.display\n9.search\nothers exit");
			switch(sc.nextInt()) {
			case 1:
				 System.out.println("Enter value");
				 l.create(sc.nextInt());
				 break;
			case 2:
				System.out.println("Enter value");
				l.inFirst(sc.nextInt());
				break;
			case 3:
				System.out.println("Enter value");
				l.inLast(sc.nextInt());
				break;
			case 4:
				System.out.println("Enter value and position");
				l.inMiddle(sc.nextInt(),sc.nextInt());
				break;
			case 5:
				l.delFirst();
				break;
			case 6:
				l.delLast();
				break;
			case 7:
				System.out.println("Enter position");
				l.delMiddle(sc.nextInt());
				break;
			case 8:
			   l.display();
			   break;
			case 9:
				System.out.println("Enter Key");
				if(l.searchNode(sc.nextInt()))
					System.out.println("Key Found");
				else
					System.out.println("Key not Found");
				break;
			   default:
				   repeat=false;
			}
		}
        sc.close();
	}
}
