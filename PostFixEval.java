package esan;
import java.util.Scanner;
public class PostFixEval {
	final static int SIZE=50;
	static int s[]=new int[SIZE];     
	static int top=-1;
	static void push(int val) {
		s[++top]=val;
	}
	static int pop() {
		return s[top--];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter PostFix Expression");
		String pfx=sc.next();
		int ans=0,first,second,i;
		for(i=0;i<pfx.length();i++) {
			if(pfx.charAt(i)>='a'&&pfx.charAt(i)<='z') {
				System.out.println("Enter value="+pfx.charAt(i));
				int val=sc.nextInt();
				push(val);
			}
			else {
				first=pop();
				second=pop();
				switch(pfx.charAt(i)) {
				case '+':
				      ans=second+first;
				      break;
				case '-':
					 ans=second-first;
					 break;
				case '*':
					 ans=second*first;
					 break;
				case '/':
					 ans=second/first;
					 break;
				case '%':
					 ans=second%first;
					 break;
				case '^':
					 ans=(int)Math.pow(second,first);
					 break;
				}
				push(ans);
			}
		}
		System.out.println("Final Solution="+pop());
		sc.close();
	}
}
