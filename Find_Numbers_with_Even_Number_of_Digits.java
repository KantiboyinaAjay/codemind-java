import java.util.*;
class java
{
    public static int digit(int n)
    {
        int j=0;
        while(n!=0)
        {
            int i=n%10;
            n=n/10;
            j++;
        }
        return j;
    }
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=scan.nextInt();
        }
        int c=0;
        for(int i=0;i<a;i++)
        {
            int n=digit(arr[i]);
            if(n%2==0)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}