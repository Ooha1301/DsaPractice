public class solution {
    public static void cone(int n)
    {
        int k=1;
        for(int i=0;i<n;i++)
        {
            
            for(int j=n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int p=k;p>0;p--)
            {
                System.out.print("*");
            }
            System.out.println("");
            k=k+2;
        }
    }
    public static void random(int n)
        {
            int k=0;
            for(int i=1;i<=n;i++)
            {
                if(i%2==0)
                {
                    k=i;
                }
                else
                {
                    k=i+1;
                }
                for(int j=k;k>0;k--)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        cone(5);
        random(6);
    }
}
