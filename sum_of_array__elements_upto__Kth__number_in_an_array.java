import java.util.*;
class sum
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=scan.nextInt();
        }
        int b = scan.nextInt();
        scan.close();
        int c=0;
        for(int i=0;i<a;i++)
        {
            c+=arr[i];
            if(arr[i]==b)
            {
                break;
            }
        }
        System.out.print(c);
    }
}