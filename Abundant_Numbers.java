import java.util.*;
class numbers
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int s=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                s+=i;
            }
        }
        if(s>a)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}