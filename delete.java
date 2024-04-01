
package arrayprogram;

import java.util.Scanner;

public class deletearray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter array size  ");
		int size=scan.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("element "+i+" :");
			  arr[i]=scan.nextInt();
		}
		
		System.out.print(" delate the element in array  ");
		int ele=scan.nextInt();
		for(int i=ele;i<size-1;i++)
		{
			  arr[i]=arr[i+1];			
		}	
 		size--;
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}
		scan.close();
		}

	}
	


