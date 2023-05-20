import java.util.*;
import java.lang.*;
public class qsw
{
    long sum(long q,long w,long p)
    { long sum=0;
        for (long i=q;i<=w;i++)
        {
           sum=sum+(long)Math.pow(i,p);
        }
        return sum;
    }

    public static void main(String[] args)
    {
        qsw ob = new qsw();
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long a=sc.nextLong();
        long b=sc.nextLong();
        long s=0;
        if(a<=n&&b<=n)
        { 
            s=ob.sum(a,b,1);
            
        }
        else if(a>2*n&&b>2*n)
        {
            s=ob.sum((a-2*n),(b-2*n),3);
        }
        else if(a<=n&&b>2*n)
        {
            s=ob.sum(a,n,1)+ob.sum(1,n,2)+ob.sum(1,(b-(2*n)),3);
        }
        else if(a<=n&&b>n&&b<=2*n)
         {
            s=ob.sum(a,n,1)+ob.sum(1,(b-n),2);
         }
         else if(a>n&&a<=(2*n)&&b>(2*n))
         {
            s=ob.sum((a-n),n,2)+ob.sum(1,(b-(2*n)),3);
         }       
         else 
           s=ob.sum((a-n),(b-n),2);
         System.out.println(s%1000000007);
    }
}
