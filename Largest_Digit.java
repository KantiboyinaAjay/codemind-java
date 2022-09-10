import java.util.*;
class java
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int c=0;
        while(a!=0)
        {
            int b = a%10;
            if(b>c)
            {
                c=b;
            }
            a=a/10;
        }
        System.out.print(c);
    }
}