package esan;
import java.util.Scanner;
public class DLListDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DLList d=new DLList();
		boolean repeat=true;
		while(repeat) {
			System.out.println("1.create\n2.inFirst\n3.inLast\n4.inMiddle\n5.delFirst\n6.delLast\n7.delMiddle\n8.display\nothers exit");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter value");
				d.create(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter value");
				d.inFirst(sc.nextInt());
				break;
			case 3:
				System.out.println("Enter value");
				d.inLast(sc.nextInt());
				break;
			case 4:
				System.out.println("Enter value and position");
				d.inMiddle(sc.nextInt(),sc.nextInt());
				break;
			case 5:
				d.delFirst();
				break;
			case 6:
				d.delLast();
				break;
			case 7:
				System.out.println("Enter position");
				d.delMiddle(sc.nextInt());
				break;
			case 8:
				d.display();
				break;
			default:
				repeat=false;
			}
		}
       sc.close();
	}
}
