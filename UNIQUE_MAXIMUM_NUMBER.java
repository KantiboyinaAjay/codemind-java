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
        int c=0;
        for(int i=0;i<a;i++)
        {
            int d=0;
            for(int j=0;j<a;j++)
            {
                if(arr[i]==arr[j])
                {
                    d++;
                }
            }
            if(d==1)
            {
                if(arr[i]>=c)
                {
                    c=arr[i];
                }
            }
        }
        if(c==0)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println(c);
        }
    }
}