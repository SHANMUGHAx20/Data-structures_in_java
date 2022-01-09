package esan;
import java.util.Scanner;
public class CSLListDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CSLList c=new CSLList();
		boolean repeat=true;
		while(repeat) {
			System.out.println("1.Create\n2.inFirst\n3.inLast\n4.inMiddle\n5.delFirst\n6.delLast\n7.delMiddle\n8.display\nothers exit");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter Value");
				c.create(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter Value");
				c.inFirst(sc.nextInt());
				break;
			case 3:
				System.out.println("Enter Value");
				c.inLast(sc.nextInt());
				break;
			case 4:
				System.out.println("Enter Value and Position");
				c.inMiddle(sc.nextInt(),sc.nextInt());
				break;
			case 5:
				c.delFirst();
				break;
			case 6:
				c.delLast();
				break;
			case 7:
				System.out.println("Enter Position");
				c.delMiddle(sc.nextInt());
				break;
			case 8:
				c.display();
				break;
			default:
				repeat=false;
			}
		}
        sc.close();
	}
}
