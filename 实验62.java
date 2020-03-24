/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 实验6.pkg2;

/**
 *
 * @author 86176
 */
public class 实验62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x,m,sum;
       for(int n=1;n<=1000;n++){
           sum=0;
           m=n;
           do{
               x=m%10;
               sum+=x;
               m=m/10;
            }while(m!=0);
           if(sum%17==0){
               System.out.println(n);
           }
       }
    }
    
}
