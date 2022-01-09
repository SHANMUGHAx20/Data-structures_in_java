package esan;
import java.util.Scanner;
public class LShSLLDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LShSLL s=new LShSLL();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		System.out.println("Enter n no of value");
		for(int i=0;i<n;i++)
			s.create(sc.nextInt());
		System.out.println("Max="+s.findMax());
		System.out.println("Min="+s.findMin());
		sc.close();
	}

}
