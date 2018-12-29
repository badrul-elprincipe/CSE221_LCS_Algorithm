/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BADRUL
 */
public class LCS {
    String []a;
    String []b;
    String [][]s;
    int [][] x;
    int t=0;
    int c=-1;
      String []r;
    public LCS(String []g,String[]h)
    {
        a=g;
        b=h;
        if(a.length>b.length)
        {
          r=new String[a.length];
        }
        else
        {
            r=new String[b.length];
        }
        x=new int[a.length][b.length];
        s=new String[a.length][b.length];
        for(int i=0;i<a.length;i++)
        {
            x[i][0]=0;
        }
        for(int i=0;i<b.length;i++)
        {
            x[0][i]=0;
        }
        for(int i=1;i<a.length;i++)
        {
            for(int j=1;j<b.length;j++)
            {
                if(a[i].equals(b[j]))
                {
                    x[i][j]=x[i-1][j-1]+1;
                    s[i][j]="q";
                    
                }
                else if(x[i-1][j]>=x[i][j-1])
                {
                    x[i][j]=x[i-1][j];
                    s[i][j]="w";
                }
                else
                {
                    x[i][j]=x[i][j-1];
                    s[i][j]="e";
                }
            }
            
        }
        
        
    }
   
    public void printlcs(int i,int j)
    {
        
        if(i==0||j==0)
        {
           x[i][j]=0;
        }
        else
        {
            if(s[i][j].equals("q"))
            {
                c++;
                r[c]=a[i];
                         
                printlcs(i-1,j-1);
            }
            else if(s[i][j].equals("w"))
            {
                 printlcs(i-1,j);
            }
            else
            {
                printlcs(i,j-1);
            }
        }
            
            
            
    }
    public void print()
    {
        for(int n=c;n>=0;n--)
        {
            System.out.print(r[n]+" ");    
        }
        
    }
}
