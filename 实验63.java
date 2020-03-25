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
    public static boolean sushupanding(double n){
        boolean flg;
        flg=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flg=false;
            }
         }
         return flg;
    }
    public static void main(String[] args){
        int counnt=0,a;
        double m, y, z,x;
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入想得到的完全数的个数");
        a=scan.nextInt();
       for(int n=2;;n++){
           boolean flg1;
           boolean flg2;
           flg1=sushupanding(n);
           m=(double)n;  
           x=Math.pow(2, m)-1;
           flg2=sushupanding(x);
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



