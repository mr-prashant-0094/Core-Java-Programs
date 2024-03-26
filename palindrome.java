import java.util.*;
class palindrome
  {
    public static void main(String[] args)
    {
      System.out.println("Enter a number ");
      Scanner scan=new Scanner(System.in);
      int num=scan.nextInt();
      int i,rev,sum=0,number;
      number=num;
      while(num !=0)
        {
          rev=num%10;
          sum=(sum*10)+rev;
          num=num/10;
        }
           if(number==sum)
           {
             System.out.println(" Palindrome number ");
           }
         else
           {
             System.out.println("not palindrome number ");
           }
      
    }
  }
