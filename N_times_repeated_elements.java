import java.util.*;
class learning
{
    public static void main(String asd[])
    {
        HashMap<Integer,Boolean>set = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        scan.close();
        int c=0;
        for(int i=0;i<a;i++)
        {
            int d=0;
            if(set.get(arr[i])==null)
            {
                for(int j=0;j<a;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        d++;
                    }
                }
                if(d==k)
                {
                    System.out.print(arr[i]+" ");
                    c=1;
                }
                set.put(arr[i],true);
            }
        }
        if(c==0)
        {
            System.out.print("-1");
        }
    }
}