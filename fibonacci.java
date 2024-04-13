public class fibonacci
{
    public static void main(String args[])
    {
        int n = 8;
        int f=0,s=1,t;
        System.out.println(f);
        System.out.println(s);
        for(int i=3;i<=n;i++)
        {
            t=f+s;
            System.out.println(t);
            f=s;
            s=t;
        }
    }
}