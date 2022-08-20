import java.util.*;
class VIBGYOR
{
    public static void main(String A[])
    {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        scan.close();
        if(s==4||s==5||s==6)
        {
            System.out.print("Summer");
        }
        else if(s==7||s==8||s==9||s==10)
        {
             System.out.print("Rainy");
        }
        else if(s==11||s==12||s==1)
        {
             System.out.print("Winter");
        }
        else if(s==2||s==3)
        {
             System.out.print("Spring");
        }
        else
        {
             System.out.print("-1");
        }
    }
}