import java.util.*;
class Snap
  {
      public static void main(String[] args)
    {
      Scanner scan=new Scanner(System.in);
      int temp;
      System.out.println("Enter a first number ");
       int a = scan.nextInt();
      System.out.println("Enter a second number ");
      int b=scan.nextInt();

      temp=a;
      a=b;
      b=temp;
      System.out.println("first number "+ a );
      System.out.println("Second number "+ b );   
    }
    
  }
