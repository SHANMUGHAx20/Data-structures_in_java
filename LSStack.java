package esan;
import java.util.Scanner;
public class LSStack {
	final static int SIZE=100;
	static int s[]=new int[SIZE];
	static int top=-1;
	static void push(int val) {
		s[++top]=val;
	}
	static int findMax() {
		int max=Integer.MIN_VALUE;
		for(int i=top;i>=0;i--)
			if(max<s[i])
				max=s[i];
		return max;
	}
	static int findMin() {
		int min=Integer.MAX_VALUE;
		for(int i=top;i>=0;i--)
			if(min>s[i])
				min=s[i];
		return min;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		System.out.println("Enter n no of value");
		for(int i=0;i<n;i++)
			push(sc.nextInt());
		System.out.println("Max="+findMax());
		System.out.println("Min="+findMin());
		sc.close();
	}
}
