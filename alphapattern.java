public class alphapattern {
   
    public static void second(int n)
    {   int k=0;
        for(int i=0;i<n;i++)
        {
            char  ch='A';
            for(int j=0;j<n-i;j++)
            {
                System.out.print(ch++);
            }
            for(int j=1;j<k ;j++)
            {
                System.out.print("*");        
            }
            k=k+2;
            
            if(i==0)
            {
                ch-=2;
                 for (int j = 0; j < n - i-1; j++) {
            System.out.print(ch--);
        }
            }
            else{
                ch--;
                 for (int j = 0; j < n - i; j++) {
            System.out.print(ch--);
        }
            }
           
          
            // ch= (char)(ch+n-1-i);
            System.out.println();

        }

    }
    public static void first(int n)
    {
        
        for(int i=0;i<n;i++)
        {
            char ch=(char)('A'+n-1-i);
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        // second(n);
        first(n);
    }
}
