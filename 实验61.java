                                /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 实验6.pkg1;

/**
 *
 * @author 86176
 */
public class 实验61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean flg;
       for(int n=2;n<=1000;n++){
           flg=true;
           for(int i=2;i<=n-1;i++){
               if(n%i==0){
                   flg=false;
                   break;
               }
           }
           if(flg){
               System.out.println(n);
           }
       }
    }
    
}
