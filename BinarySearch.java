package esan;
import java.util.Scanner;
public class BinarySearch {
   static boolean binarySearch(int a[],int n,int key) {
	   int first=0,last=n-1;
	   while(first<=last) {
		   int mid=(first+last)/2;
		   if(a[mid]==key)
			   return true;
		   else if(a[mid]<key)
			   first=mid+1;
		   else 
			   last=mid-1;
	   }
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
		if(binarySearch(a,n,key))
			System.out.println("Key is Found");
		else
			System.out.println("Key is not Found");	
		sc.close();
	}
}
