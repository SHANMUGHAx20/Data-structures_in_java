package esan;
import java.util.Scanner;
public class LSQueue {
    final static int SIZE=100;
    static int q[]=new int[SIZE];
    static int front=-1;
    static int rear=-1;
   static void enQueue(int val) {
    	if(front==-1)
    		front=0;
    	q[++rear]=val;
    }
   static int findMax() {
	   int max=Integer.MIN_VALUE;
	   for(int i=front;i<=rear;i++)
		   if(max<q[i])
			   max=q[i];
	   return max;
   }
   static int findMin() {
	   int min=Integer.MAX_VALUE;
	   for(int i=front;i<=rear;i++)
		   if(min>q[i])
			   min=q[i];
	   return min;
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		System.out.println("Enter n no of value");
		for(int i=0;i<n;i++)
			enQueue(sc.nextInt());
		System.out.println("Max="+findMax());
		System.out.println("Min="+findMin());
		sc.close();

	}

}
