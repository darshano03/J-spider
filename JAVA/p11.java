class p11
{
    public static void main(String []agrs)
    {
        int i = 0;
        while(i<=3)
        {
            int  j = 0 ;
            while(j<=3)
            {
                if(i==2&&j==2){
                    break;
                }
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

    }
        
}