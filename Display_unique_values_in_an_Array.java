import java.util.*;
class count
{
    public static void main(String asd[])
    {
        int g=0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c==1)
            {
                g=1;
                System.out.print(arr[i]+" ");
            }
            
        }
        if(g==0)
        {
            System.out.print("-1");
        }
        scan.close();
    }
}