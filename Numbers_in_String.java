import java.util.*;
class java
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                c+=s.charAt(i)-'0';
            }
        }
        System.out.print(c);
    }
}