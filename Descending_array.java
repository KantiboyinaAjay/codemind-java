import java.util.Scanner;
class solution {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=scan.nextInt();
        }
        int d=0;
        scan.close();
        for(int i=1;i<a;i++)
        {
            if(arr[i-1]>arr[i])
            {
                d++;
            }
        }
        if(d==a-1)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}