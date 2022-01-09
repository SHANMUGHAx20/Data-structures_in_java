package esan;
import java.util.Scanner;
public class StackDemo {
     final static int SIZE=10;
     static int top=-1;
     static int s[]=new int[SIZE];
    static void push(int v) {
    	if(top==SIZE-1)
    		 System.out.println("Stack Overflow");
    	else
    		s[++top]=v;
    }
    static int pop() {
    	if(top==-1) {
    		System.out.println("Stack is underflow");
    		return 0;
    	}
    	else
    		return s[top--];
    }
    static int peek() {
    	if(top==-1) {
    		System.out.println("Stack is underflow");
    		return 0;
    	}
    	else
    		return s[top];
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean repeat=true;
		while(repeat) {
			System.out.println("1.Push\n2.Pop\n3.Peek\nothers Exit");
			switch(sc.nextInt()) {
			case 1: 
				System.out.println("Enter value");
				push(sc.nextInt());
				break;
			case 2:
				System.out.println("Pop Value="+pop());
				break;
			case 3:
				System.out.println("Peek Value="+peek());
				break;
			default:
				repeat=false;
			}
		}
        sc.close();
	}

}
