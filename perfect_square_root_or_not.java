import java.util.*;
class dk
{
    public static void main(String sad[])
    {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int i=0;
        while(s!=0)
        {
            if(Math.pow(i,2)==s)
            {
                System.out.println("True");
                break;
            }
            else if(Math.pow(i,2)>s)
            {
                System.out.println("False");
                break;
            }
            i++;
        }
    }
}