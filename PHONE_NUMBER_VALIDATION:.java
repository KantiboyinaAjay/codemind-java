import java.util.*;
class java
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        int c=0;
        while(a!=0)
        {
            long i = a%10;
            a=a/10;
            c++;
        }
        if(c==10)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}