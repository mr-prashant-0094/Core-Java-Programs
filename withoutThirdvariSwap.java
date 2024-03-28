 import java.util.*;
 class withoutThirdvariSwap {

   public static void main (String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println(" Enter first swap number ");
     int x=scan.nextInt();
     System.out.println("Enter second swap number ");
     int y=scan.nextInt();

      x=x+y;
     y=x-y;
     x=x-y;
     System.out.println(" first number " + x);
     System.out.println(" second number " + y);
      
     
   }

   
   
 }
