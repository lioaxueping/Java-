/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 实验5.pkg1;

/**
 *
 * @author 86176
 */
public class 实验51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int ge,shi,bai;
    for(int i=101;i<=999;i++){
        ge=i%10;
        shi=(i%100)/10;
        bai=i/100;
        if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
           System.out.println("最小的水仙花数是"+i);
           break;
        }
    }   
        
    
    
    
}}
