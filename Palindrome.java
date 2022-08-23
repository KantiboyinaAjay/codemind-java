import java.util.*;
class palindrome
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        int b = a,s=0;
        while(a!=0)
        {
            int v = a%10;
            s=s*10+v;
            a=a/10;
        }
        if(b==s)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}