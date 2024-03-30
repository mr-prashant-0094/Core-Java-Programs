package array_09_12;

import java.util.Arrays;
import java.util.Scanner;

public class ascendingarr {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.print("enter a array size");
      int size=scan.nextInt();
	  System.out.println("input "+size+" element in the array");

      int arr[]=new int[size];
      for(int i=0;i<arr.length;i++)
      {
    	  System.out.print("element  "+i+":");
    	  arr[i]=scan.nextInt();
      }
      int temp;
      for(int i=0;i<arr.length;i++)
      {
    	  for(int j=0;j<arr.length;j++)
    	  {
    		  if(arr[i]<arr[j])
    		  {
    			  temp=arr[i];
    			  arr[i]=arr[j];
    			  arr[j]=temp;
    		  }
    	  }
      }
      for(int i=0;i<arr.length;i++)
      {
      System.out.print(arr[i]+" ");
      }
	}

}
