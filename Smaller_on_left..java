import java.util.*;
class java
{
    public static void main(String asd[])
    {
        ArrayList<Integer> l = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.print(-1+" ");
        for(int i=1;i<a;i++)
        {
            int j=0;
            for(j=i-1;j>=0;j--)
            {
                if(arr[i]>arr[j])
                {
                    System.out.print(arr[j]+" ");
                    break;
                }
            }
            if(j==-1)
            {
                System.out.print(-1+" ");
            }
        }
    }
}