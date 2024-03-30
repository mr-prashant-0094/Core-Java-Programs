class DescendingOrder
  {
     public static void main (String[] args)
    {
      Scanner sc=new Scanner(system.in);
      System.out.println("Enter a size ");
      int size=sc.nextInt();
      System.out.println("Input " + size +"element in the array ");
       int arr[] = new   int[size];
      for(int i=0;i<arr.length;i++)
        {
          System.out.println(" Element  "+i+ " : ");
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
                      a[j]=temp;
                   }    
    }
  }
      for(int i=0;i<arr.length;i++)
        {
          System.out.println(arr[i]+ " ");
    }
  }
      
