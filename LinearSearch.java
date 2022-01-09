package esan;
import java.util.Scanner;
public class LinearSearch {
	static boolean  linearSearch(int a[],int n,int key) {
		for(int i=0;i<n;i++)
			if(a[i]==key)
		      return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter n no of array Elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter search key");
		int key=sc.nextInt();
		if(linearSearch(a,n,key))
			System.out.println("Key is Found");
		else
			System.out.println("Key is not Found");	
		sc.close();
	}
}
