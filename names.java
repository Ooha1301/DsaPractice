import java.util.*;
public class names {
    int cols=5;
    
    public static void upright(int i,int j,int endi,int endj, char[][] arr)
    {
        
        while (i >= endi && j <= endj) {
        arr[i][j] = '*';
        i--;
        j++;
        }
    }
    public static void downright(int i,int j,int endi,int endj,char[][] arr)
    {
        
       while (i <= endi && j <= endj) {
        arr[i][j] = '*';
        i++;
        j++;
    }
    }
     public static void downleft(int i,int j,int endi,int endj, char[][] arr)
    {
        while(i>endi & j>endj)
        {
             arr[i][j]='*';
             i++;
             j--;
        }
    }
     public static void upleft(int i,int j,int endi,int endj, char[][] arr)
    {
        while(i>endi & j<endj)
        {
            arr[i][j]='*';
            i--;
            j++;
        }
       
    }
     public static void left(int i,int j,int endi,int endj, char[][] arr)
    {
        
        for(;i<endi;i++)
        {
                arr[i][j]='*';
        }
    }
     public static void right(int i,int j,int endi,int endj, char[][] arr)
    {
        
        for(;i<endi;i++)
        {
                arr[i][j]='*';
        }
    }
     public static void up(int i,int j,int endi,int endj, char[][] arr)
    {
        
        
            for(;j<endj;j++)
            {
                arr[i][j]='*';
            }
    }
     public static void down(int i,int j,int endi,int endj, char[][] arr)
    {
        
            for(;j<endj;j++)
            {
                arr[i][j]='*';
            }
    }
    public static void alpha(char ch,int pointer,char[][] arr)
    {
        int rows=7;
        int cols=5;
        if(ch=='a')
        {
            // left(0,pointer,rows,pointer+cols-1,arr[][]);
            right(0,pointer+cols-1,rows,pointer+cols-1,arr);
            left(0,pointer,rows,pointer,arr);
            up(0,pointer,0,pointer+cols-1,arr);
            up(rows/2,pointer,rows/2,pointer+cols-1,arr);
        }
        if(ch=='b')
        {
            
            right(0,pointer+cols-1,rows,pointer+cols-1,arr);
            left(0,pointer,rows,pointer,arr);
            up(0,pointer,0,pointer+cols-1,arr);
            up(rows/2,pointer,rows/2,pointer+cols-1,arr);
             up(rows-1,pointer,rows-1,pointer+cols-1,arr);
        }
        if(ch=='c')
        {
            
            // right(0,pointer+cols-1,rows,pointer+cols-1,arr);
            left(0,pointer,rows,pointer,arr);
            up(0,pointer,0,pointer+cols-1,arr);
            // up(rows/2,pointer,rows/2,pointer+cols-1,arr);
             up(rows-1,pointer,rows-1,pointer+cols-1,arr);
        }
        if(ch=='d')
        {
            
            right(0,pointer+cols-1,rows,pointer+cols-1,arr);
            left(0,pointer,rows,pointer,arr);
            up(0,pointer,0,pointer+cols-1,arr);
            // up(rows/2,pointer,rows/2,pointer+cols-1,arr);
             up(rows-1,pointer,rows-1,pointer+cols-1,arr);
        }
        if(ch=='e')
        {
            
            // right(0,pointer+cols-1,rows,pointer+cols-1,arr);
            left(0,pointer,rows,pointer,arr);
            up(0,pointer,0,pointer+cols-1,arr);
            up(rows/2,pointer,rows/2,pointer+cols-1,arr);
             up(rows-1,pointer,rows-1,pointer+cols-1,arr);
        }
        if(ch=='f')
        {
            
            // right(0,pointer+cols-1,rows,pointer+cols-1,arr);
            left(0,pointer,rows,pointer,arr);
            up(0,pointer,0,pointer+cols-1,arr);
            up(rows/2,pointer,rows/2,pointer+cols-1,arr);
            //  up(rows-1,pointer,rows-1,pointer+cols-1,arr);
        }
        if(ch=='g')
        {
            
            right(rows/2,pointer+cols-1,rows,pointer+cols-1,arr);
            left(0,pointer,rows,pointer,arr);
            up(0,pointer,0,pointer+cols-1,arr);
            up(rows/2,pointer,rows/2,pointer+cols-1,arr);
             up(rows-1,pointer,rows-1,pointer+cols-1,arr);
        }
        if(ch=='h')
        {
            
            right(0,pointer+cols-1,rows,pointer+cols-1,arr);
            left(0,pointer,rows,pointer,arr);
            // up(0,pointer,0,pointer+cols-1,arr);
            up(rows/2,pointer,rows/2,pointer+cols-1,arr);
            //  up(rows-1,pointer,rows-1,pointer+cols-1,arr);
        }
        if(ch=='i')
        {
            
            // right(0,pointer+cols-1,rows,pointer+cols-1,arr);
            left(0,pointer+cols/2,rows,pointer,arr);
            up(0,pointer,0,pointer+cols,arr);
            // up(rows/2,pointer,rows/2,pointer+cols-1,arr);
             up(rows-1,pointer,rows-1,pointer+cols,arr);
        }
        if(ch=='j')
        {
            
            right(0,pointer+cols-1,rows,pointer+cols-1,arr);
            left(rows/2,pointer,rows,pointer,arr);
            up(0,pointer,0,pointer+cols-1,arr);
            // up(rows/2,pointer,rows/2,pointer+cols-1,arr);
             up(rows-1,pointer,rows-1,pointer+cols-1,arr);
        }
        if(ch=='l')
        {
            
            // right(0,pointer+cols-1,rows,pointer+cols-1,arr);
            left(0,pointer,rows,pointer,arr);
            // up(0,pointer,0,pointer+cols-1,arr);
            // up(rows/2,pointer,rows/2,pointer+cols-1,arr);
             up(rows-1,pointer,rows-1,pointer+cols-1,arr);
        }
        if(ch=='o')
        {
            
            right(0,pointer+cols-1,rows,pointer+cols-1,arr);
            left(0,pointer,rows,pointer,arr);
            up(0,pointer,0,pointer+cols-1,arr);
            // up(rows/2,pointer,rows/2,pointer+cols-1,arr);
             up(rows-1,pointer,rows-1,pointer+cols-1,arr);
        }
         if(ch=='q')
        {
            
            right(0,pointer+cols/2+1,rows,pointer+cols/2+1,arr);
            left(0,pointer,rows,pointer,arr);
            up(0,pointer,0,pointer+cols/2+1,arr);
            // up(rows/2,pointer,rows/2,pointer+cols-1,arr);
             up(rows-1,pointer,rows-1,pointer+cols/2+1,arr);
             downright(rows/2,pointer+cols/2,rows,pointer+cols-1,arr);
        }
        if(ch=='p')
        {
            
            right(0,pointer+cols-1,rows/2,pointer+cols-1,arr);
            left(0,pointer,rows,pointer,arr);
            up(0,pointer,0,pointer+cols-1,arr);
            up(rows/2,pointer,rows/2,pointer+cols-1,arr);
            //  up(rows-1,pointer,rows-1,pointer+cols-1,arr);
        }
         if(ch=='r')
        {
            
            right(0,pointer+cols-1,rows/2,pointer+cols-1,arr);
            left(0,pointer,rows,pointer,arr);
            up(0,pointer,0,pointer+cols-1,arr);
            up(rows/2,pointer,rows/2,pointer+cols-1,arr);
            downright(rows/2,pointer+1,rows-1,pointer+cols-1,arr);
                         //  up(rows-1,pointer,rows-1,pointer+cols-1,arr);
        }
        if(ch=='s')
        {
            
            right(rows/2,pointer+cols-1,rows,pointer+cols-1,arr);
            left(0,pointer,rows/2,pointer,arr);
            up(0,pointer,0,pointer+cols-1,arr);
            up(rows/2,pointer,rows/2,pointer+cols-1,arr);
             up(rows-1,pointer,rows-1,pointer+cols-1,arr);
        }
        if(ch=='t')
        {
            
            // right(0,pointer+cols-1,rows,pointer+cols-1,arr);
            left(0,pointer+cols/2,rows,pointer,arr);
            up(0,pointer,0,pointer+cols,arr);
            // up(rows/2,pointer,rows/2,pointer+cols-1,arr);
            //  up(rows-1,pointer,rows-1,pointer+cols-1,arr);
        }
        if(ch=='u')
        {
            
            right(0,pointer+cols-1,rows,pointer+cols-1,arr);
            left(0,pointer,rows,pointer,arr);
            // up(0,pointer,0,pointer+cols-1,arr);
            // up(rows/2,pointer,rows/2,pointer+cols-1,arr);
             up(rows-1,pointer,rows-1,pointer+cols-1,arr);
        }
        if(ch=='k')
        {
            
            // right(0,pointer+cols-1,rows,pointer+cols-1,arr);
            left(0,pointer,rows,pointer,arr);
            upright(rows/2,pointer+1,0,pointer+cols-1,arr);
            downright(rows/2,pointer+1,rows-1,pointer+cols-1,arr);
        }
        if(ch=='m')
        {
            
            right(0,pointer+cols-1,rows,pointer+cols-1,arr);
            left(0,pointer,rows,pointer,arr);
            upright(rows/2-1,pointer+cols/2,0,pointer+cols-1,arr);
            downright(0,pointer,rows,pointer+cols/2,arr);
        }
         if(ch=='n')
        {
            
            right(0,pointer+cols-1,rows,pointer+cols-1,arr);
            left(0,pointer,rows,pointer,arr);
            // upright(rows/2,pointer+1,0,pointer+cols-1,arr);
            downright(0,pointer,rows-1,pointer+cols-1,arr);
        }
         if(ch=='v')
        {
            
            // right(0,pointer+cols-1,rows,pointer+cols-1,arr);
            // left(0,pointer,rows,pointer,arr);
            upright(rows/2-1,pointer+cols/2,0,pointer+cols-1,arr);
            downright(0,pointer,rows,pointer+cols/2,arr);
        }
         if(ch=='w')
        {
            
            right(0,pointer+cols-1,rows,pointer+cols-1,arr);
            left(0,pointer,rows,pointer,arr);
            upright(rows-1,pointer,rows/2,pointer+cols/2,arr);
            downright(rows/2+1,pointer+cols/2,rows,pointer+cols-1,arr);
        }
        if(ch=='x')
        {
             upright(rows/2-1,pointer+cols/2,0,pointer+cols-1,arr);
            downright(0,pointer,rows,pointer+cols/2,arr);
            upright(rows-1,pointer,rows/2,pointer+cols/2,arr);
            downright(rows/2+1,pointer+cols/2,rows,pointer+cols-1,arr);
           
        }
         if(ch=='y')
        {
            
            right(rows/2,pointer+cols/2,rows,pointer+cols/2,arr);
            // left(0,pointer,rows,pointer,arr);
            upright(rows/2-1,pointer+cols/2,0,pointer+cols-1,arr);
            downright(0,pointer,rows,pointer+cols/2,arr);

        }
         if(ch=='z')
        {
            up(0,pointer,0,pointer+cols-1,arr);
            // up(rows/2,pointer,rows/2,pointer+cols-1,arr);
            up(rows-1,pointer,rows-1,pointer+cols-1,arr);
            upright(rows-1,pointer,0,pointer+cols-1,arr);
        }

    }
    public static void print(char[][] arr)
    {
        int rows=7;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char arr[][]=new char[7][str.length()*5];
        for(int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j <arr[i].length; j++)
                {
                  arr[i][j] = ' '; // Assigns a space character to each element
                }
        }
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            alpha(ch, i*5, arr);
        }
        print(arr);

    }
}
