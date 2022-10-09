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
        for(int i=0;i<a;i++)
        {
            if(i==a-1)
            {
                System.out.print(-1);
            }
            else
            {
                for(int j=i+1;j<a;j++)
                {
                    l.add(arr[j]);
                }
                System.out.print(Collections.max(l)+" ");
                l.clear();
            }
        }
    }
}