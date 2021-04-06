/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DELL
 */
public class Conject {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        int N;
        for(int i=0;i<T;i++)
        {
        int N1=Integer.parseInt(br.readLine());
         N=N1;
        while(N>1)
        {
        if(N%2==0)
            N=N/2;
        else
            N=3*N+1;
        }
        
        if(N==1)
         System.out.println("YES");
        else
          System.out.println("NO");
            }    
        
        // TODO code application logic here
    }
    
}
