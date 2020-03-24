/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 实验6.pkg3;
import java.util.Scanner;
/**
 *
 * @author 86176
 */
public class 实验63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int sum,counnt=1,a;
        double m,x,y,z;
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入想得到的完全数个数")；
        a=scan.nextint();
       for(int n=2;;n++){
           boolean flg1=true;
           boolean flg2=true;
           for(int i=2;i<n;i++){
               if(n%i==0){
                   flg1=false;
                   break;
               }
            }
           m=(double)n;  
           x=Math.pow(2, m)-1;
            for(int j=2;j<x;j++){
               if((int)x%j==0){
                   flg1=false;
                   break;
               }
            }
            
            if(flg1&&flg2){
                z=Math.pow(2, (double)n-1);
                y=x*z;
                System.out.println((long)y);
                counnt++;
            }
            if(counnt==a){
               break; 
            }
       }  
    }
}



