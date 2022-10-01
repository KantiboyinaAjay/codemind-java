import java.util.*;
class java
{
    public static void main(String ak[])
    {
        HashMap<Integer,Boolean> se = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i] = scan.nextInt();
        }
        int s=0;
        for(int i=0;i<a;i++)
        {
            if(se.get(arr[i])==null)
            {
                int n=0;
                for(int j=0;j<a;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        n++;
                    }
                }
                s+=(n/2);
                se.put(arr[i],true);
            }
        }
        System.out.print(s);
    }
}