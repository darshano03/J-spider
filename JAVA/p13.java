class p13
{
    public static void main(String []agrs)
    {
      int num = 645;
      int temp = num;
      int lastdigit = 0;
      int revers = 0;
      while(temp!=0)
      {
        lastdigit=temp % 10;
        revers=revers*10+lastdigit;
        temp=temp/10;
      }
    if(revers==num)
        System.out.print(num + " is a palindrome");
    else
        System.out.print(num + " is not a palindrome");

    }
        
}