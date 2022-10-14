import java.util.*;
class java
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int s=0,c=1;
        while(a!=0)
        {
            int i = a%10;
            a=a/10;
            s+=i;
            c=c*i;
        }
        if(s==c)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}