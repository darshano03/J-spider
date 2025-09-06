class p20
{
    public static void main(String [] args)
    {
      int i = 1, esum = 0, osum = 0;
      do{
        if(i%2==0){
            esum=esum+1;
        }else
        {
            osum=osum+i;
        }
        i++;
        
      }while(i <= 20);
      System.out.println(esum+" is the sum of even no");
      System.out.println(osum+" is the sum of odd no ");
    }
}