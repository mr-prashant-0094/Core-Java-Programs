  import java.util.*;
 class Leap
  {
    public static void main(String[] args)
    {
          int y;
          System.out.println("Enter a Year ");
          Scanner scan=new Scanner(System.in);
          y=scan.nextInt();
    
            if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
              {
                System.out.println(y+"this is leap year " );
              }
            else
              {
                System.out.println(y + " this is not leap year ");
              }
                
    }
  }

