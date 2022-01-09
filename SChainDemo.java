package esan;
import java.util.Scanner;
public class SChainDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SChain s=new SChain();
		boolean repeat=true;
		while(repeat) {
			System.out.println("1.insert\n2.search\n3.display\nothers exit");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter value");
				s.insert(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter value");
				if(s.search(sc.nextInt()))
					System.out.println("Key Found");
				else
					System.out.println("Key not Found");
				break;
			case 3:
				s.display();
				break;
			default:
				repeat=false;
			}
		}
		sc.close();
	}
}
