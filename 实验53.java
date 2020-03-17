/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 实验5.pkg3;

/**
 *
 * @author 86176
 */
public class 实验53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
        for(int j=9;j>=i;j--){
            System.out.printf("%3d",i*j);
        }
        System.out.println();
    }
        for(int i=9;i>=1;i--){
        for(int j=9;j>=i;j--){
            System.out.printf("%3d",i*j);
        }
        System.out.println();
    }
        
    }
    
}
