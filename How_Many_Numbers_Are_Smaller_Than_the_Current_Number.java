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
        for(int i=0;i<a;i++)
        {
            int c=0;
            for(int j=0;j<a;j++)
            {
                if(arr[j]<arr[i])
                {
                    c++;
                }
            }
            System.out.print(c+" ");
        }
    }
}