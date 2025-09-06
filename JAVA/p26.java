class p26
{
    public static void main(String []agrs)
    {
        int esum=0 , osum=0 ;
      for(int i=1;i<=20;i++)
      {
        if(i%2==0)
        {
          esum+=i;
        }
        else
        {
            osum+=i;
        }
      }
      System.out.print(esum +" is the sum of even no");
      System.out.print(osum +" is the sum of odd no");
    }
}
        
