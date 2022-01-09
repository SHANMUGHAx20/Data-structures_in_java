package esan;
import java.util.Scanner;
public class InfixToPostFix {
	final static int SIZE=50;
	static char s[]=new char[SIZE];
	static int top=-1;
	static void push(char ch) {
		s[++top]=ch;
	}
	static char pop() {
		return s[top--];
	}
	static int priority(char ch) {
		if(ch=='+'||ch=='-')
			return 1;
		else if(ch=='*'||ch=='/'||ch=='%')
			return 2;
		else if(ch=='^')
			return 3;
		else
			return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Infix Expression");
		String inf=sc.next();
		String pfx="";
		for(int i=0;i<inf.length();i++) {
			if(inf.charAt(i)=='(')
				push(inf.charAt(i));
			else if(inf.charAt(i)>='a'&&inf.charAt(i)<='z')
				pfx=pfx+inf.charAt(i);
			else if(inf.charAt(i)==')') {
				while(s[top]!='(')
					pfx=pfx+pop();
				pop();
			}
			else {
				if(top==-1)
					push(inf.charAt(i));
				else {
					while(top!=-1&&(priority(s[top])>=priority(inf.charAt(i))))
						pfx=pfx+pop();
					push(inf.charAt(i));
				}
			}
		}
		while(top!=-1)
			pfx=pfx+pop();
		System.out.println("PostFix Expression="+pfx);
     sc.close();
	}

}
