package esan;
import java.util.Scanner;
public class BalanceParenthese {
	final static int SIZE=50;
	static char s[]=new char[SIZE];
	static int top=-1;
	static void push(char ch) {
		s[++top]=ch;
	}
	static char pop() {
		return s[top--];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Parenthese");
		String p=sc.next();
		int i;
		for(i=0;i<p.length();i++) {
			if(p.charAt(i)=='('||p.charAt(i)=='['||p.charAt(i)=='{')
				push(p.charAt(i));
			else {
				if(top!=-1) {
					if((s[top]=='('&&p.charAt(i)==')')||(s[top]=='['&&p.charAt(i)==']')||(s[top]=='{'&&p.charAt(i)=='}'))
                       pop();
                    else
                       break;	   
				}
				else
					break;
			}
		}
		if(top==-1&&i==p.length())
			System.out.println("Valid Expression");
		else
			System.out.println("Invalid Expression");
		sc.close();
	}

}
