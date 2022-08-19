import java.util.*;
class nop
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        if(a>0)
        {
            System.out.print("Positive Number");
        }
        else
        {
            System.out.print("Negative Number");
        }
    }
}