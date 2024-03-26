class Armstrong
  {
    public static void main(Sring[] args)
    {
      System.out.println("Enter a number ");
      Scanner scan=new Scanner(System.in)
       int num=scan.nextInt();
      int rem, arm=0,number;
      number=num;
      while(num !=0)
        {
          rem=num%10;
          arm=(rem*rem*rem)+arm;
          num=num/10;
        }
      if(c==arm)
      {
        System.out.println("Armstrong number ");   
      }
      else
      {
        System.out.println("not Armstrong number");
    }
  }

