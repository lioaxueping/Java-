/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 实验5.pkg2;

/**
 *
 * @author 86176
 */
public class 实验52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fenmu=1,n=1;
        double sum=1.0,term;
        do{
            term=1.0/fenmu;
            sum+=term;
            n++;
            fenmu*=n;
            }while(Math.abs(term)>=1e-5);
             System.out.println("e的估计值是"+sum);
     
    }
}
    

