class p12
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
    System.out.println(revers);
    }
        
}