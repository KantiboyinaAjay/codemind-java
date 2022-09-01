import java.util.*;
class PRIMES
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
    public static void main(String A[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        int c=0;
        for(int i=a;i<=b;i++)
        {
            if(is_prime(i)==1)
            {
                System.out.println(i);
            }
        }
    }
}