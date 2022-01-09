package esan;
import java.util.Scanner;
public class StackListDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StackList sl=new StackList();
		boolean repeat=true;
		while(repeat) {
			System.out.println("1.Push\n2.Pop\n3.Peek\nothes exit");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter value");
				sl.push(sc.nextInt());
				break;
			case 2:
				System.out.println("poped Value="+sl.pop());
				break;
			case 3:
				System.out.println("Peek Value="+sl.peek());
				break;
			default:
				repeat=false;
			}
		}
		sc.close();
	}

}
