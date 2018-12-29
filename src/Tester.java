/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;
/**
 *
 * @author BADRUL
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            String filelink= "LCS.txt";
            File file=new File(filelink);   
            Scanner B=new Scanner(file);
            String read=B.nextLine();
            StringTokenizer st=new StringTokenizer(read," ");
            String []a=new String[read.length()-5];
            for(int i=1;i<a.length;i++)
            {
                a[i]=st.nextToken();
           
            }
            read=B.nextLine();
            st=new StringTokenizer(read," ");
            String []b=new String[read.length()-3];
            for(int i=1;i<b.length;i++)
            {
                b[i]=st.nextToken();
            
            }
            LCS l=new LCS(a,b);
            l.printlcs(a.length-1,b.length-1);
            l.print();
        }
        catch(IOException e)
        {
            System.out.println("File not found");
        }


    }
}
    

