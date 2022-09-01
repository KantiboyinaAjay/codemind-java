import java.util.*;
class solutions
{
    static int is_prime(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    return 0;
                }
            }
            return 1;
        }
    }
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int i=1,c=0,m=0;
        int v = a+b;
        while(i!=0)
        {
            int n=v+i;
            if(is_prime(n)==1)
            {
                m=n;
                break;
            }
            i++;
        }
        System.out.print(Math.abs((a+b)-m));
    }
}