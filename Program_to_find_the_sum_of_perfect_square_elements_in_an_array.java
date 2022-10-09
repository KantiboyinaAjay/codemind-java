import java.util.*;
class java
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
        int s=0;
        for(int i=0;i<a;i++)
        {
            int c = (int)Math.sqrt(arr[i]);
            int d = c*c;
            if(arr[i]==d)
            {
                s+=arr[i];
            }
        }
        System.out.println(s);
    }
}