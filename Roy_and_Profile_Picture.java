import java.util.*;
class SOLUTIONS
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int a = scan.nextInt();
        for(int i=0;i<a;i++)
        {
            int w = scan.nextInt();
            int h = scan.nextInt();
            if(w<b || h<b)
            {
                System.out.print("UPLOAD ANOTHER"+"
");
            }
            else if(b<=w && b<=h)
            {
                if(w==h)
                {
                    System.out.print("ACCEPTED"+"
");
                }
                else
                {
                    System.out.print("CROP IT"+"
");
                }
            }
        }
        scan.close();
    }
}