import java.util.*;
class java
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = a;
        int c = Integer.toString(a).length();
        int s=0;
        while(b!=0)
        {
            int v = b%10;
            s+=Math.pow(v,c);
            b = b/10;
            c--;
        }
        if(s==a)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}