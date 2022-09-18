import java.util.*;
class java
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a<0)
        {
            a=a*-1;
            int s=0;
            while(a!=0)
            {
                int i=a%10;
                s=s*10+i;
                a=a/10;
            }
            System.out.println(s*-1);
        }
        else
        {
            int s=0;
            while(a!=0)
            {
                int i=a%10;
                s=s*10+i;
                a=a/10;
            }
            System.out.println(s);
        }
    }
}