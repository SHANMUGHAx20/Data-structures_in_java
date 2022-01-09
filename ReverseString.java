package esan;
import java.util.Scanner;
import java.util.StringTokenizer;
public class ReverseString {
	final static int SIZE=50;
	static String s[]=new String[SIZE];
	static int top=-1;
	static void push(String sg){
		s[++top]=sg;
	}
	static String pop() {
		return s[top--];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input String");
		StringTokenizer st=new StringTokenizer(sc.nextLine());
		String rev="";
		while(st.hasMoreTokens())
			push(st.nextToken());
		while(top!=-1)
			rev=rev+pop()+" ";
		System.out.println("Reverse String="+rev);
        sc.close();
	}

}
