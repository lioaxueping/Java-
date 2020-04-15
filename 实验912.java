/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 实验9.pkg1;
import java.util.Scanner;
   class MyMath{
        double myPi(double x){   
           int flg=1,fenmu=1;
           double sum=0,item=1;
           do{
               item=flg*(1.0/fenmu);
               sum+=item;
               fenmu+=2;
               flg=-flg;
            }while(Math.abs(item)>=x);  
           return 4*sum;
        }
    }

   class MyLine{
      double x1,x2,y1,y2;
      void create(){ 
         x1=Math.random()*20-10;
         y2=Math.random()*20-10;
         x1=Math.random()*20-10;
         y2=Math.random()*20-10;
        }
      boolean check(){
          if(x1>=0&&x2>=0&&y1>=0&y2>=0)
              return true;
          else
              return false;
      }
      double length(){
          return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
      }
   }

public class 实验912 {
    public static void main(String[] args) {
        System.out.println("实验9.1");
        MyLine line=new MyLine();
        line.create();
        System.out.println("线段从点（"+line.x1+","+line.y1+")到点("+line.x2+","+line.y2+")");  
        if(line.check())
            System.out.println("线段在第一象限");
        else
            System.out.println("线段不在第一象限");
        System.out.println("线段长度为："+line.length());
        System.out.println();
        System.out.println("实验9.2");
        MyMath math=new MyMath();
        double pi,x;
        Scanner s=new Scanner(System.in);
        System.out.println("请输入x的值：");
        x=s.nextDouble();
        pi=math.myPi(x);
        System.out.println("Pi的值为："+pi);
                
    }
}