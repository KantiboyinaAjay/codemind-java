import java.util.*;
class solutions
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i=0;i<a;i++)
        {
            int b = scan.nextInt();
            int c=1;
            if(b==0)
            {
                System.out.println("1");
            }
            else
            {
                for(int j=1;j<=b;j++)
                {
                    c*=j;
                }
                System.out.println(c);
            }
        }
        
    }
}