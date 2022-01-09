package esan;
import java.util.Scanner;
public class QueueListDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		QueueList ql=new QueueList();
		boolean repeat=true;
		while(repeat) {
			System.out.println("1.enQueue\n2.deQueue\n3.display\nothers exit");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter value");
				ql.enQueue(sc.nextInt());
				break;
			case 2:
				ql.deQueue();
				break;
			case 3:
				ql.diplay();
				break;
			default:
				repeat=false;
			}
		}
		sc.close();
	}
}
