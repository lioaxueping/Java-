
package 实验15;
import java.awt.*;
import java.awt.event.*;
public class 实验15 {
 static Frame f1,f2,f3;
 static Button b;
 static TextField tf1,tf2;
 static List li;
 static Panel p1,p2;
 static String store="";
 static boolean isPrime(int n){
      for(int i=2;i<=n-1;i++){
         if(n%i==0) 
             return false;  
      }
      return true;     
   }
 static class ButtonWork implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            int count=0;
            String actionCommand =ae.getActionCommand();
            switch (actionCommand) {
                case "+":
                case "-":
                case "*":
                case "/":
                    store+=" "+actionCommand+" ";
                    break;
                case"CE":
                    store="";
                    break;
                case"start":
                    int m;
                    m=Integer.valueOf(tf2.getText());
                    for(int n=2;n<=m;n++){
                        if(isPrime(n))
                            li.add(String.valueOf(n));
                    }
                    break;
                case "=":
                    store="="+compute(store);
                    tf1.setText(store);
                    count=1;
                    break;
                default:
                    store+=actionCommand;
                    break;
            }
            if(count==0)
                tf1.setText(store);
        }     
    }
 static String compute(String a){
    String[] str;
    str=store.split(" ");
    double m=Double.parseDouble(str[0]);
    for(int i=1;i<=str.length-1;i++){
        if(i%2==1){
            if(str[i].compareTo("+")==0){
                m+=Double.parseDouble(str[i+1]);
            }
            if(str[i].compareTo("-")==0){
                m-=Double.parseDouble(str[i+1]);
            }
            if(str[i].compareTo("*")==0){
                m*=Double.parseDouble(str[i+1]);
            }
            if(str[i].compareTo("/")==0){      
               m*=Double.parseDouble(str[i+1]);
            }   
        }            
    }
    return String.valueOf(m);
}     
 static class W extends WindowAdapter{

        @Override
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
 }
    public static void main(String[] args) {
        
        f2=new Frame("某整数范围内的所以素数");
        f2.setLocation(600,0);
        b=new Button("start");
        tf2=new TextField("100");
        li=new List();
        f2.add(tf2,"North");
        f2.add(b,"East");
        f2.add(li,"Center");
        b.addActionListener(new ButtonWork());
        
        f1 =new Frame("Calculator");
        f1.setLocation(0, 0);
        p1 = new Panel();
        p2 = new Panel();
        f1.add("North", p1);
        f1.add("Center", p2);
        tf1 = new TextField();
        b= new Button("CE");
        p1.setLayout(new BorderLayout());
        p1.add("Center", tf1);
        p1.add("East", b);
        p2.setLayout(new GridLayout(4, 4));
        String a[]={"7","8","9","/","4","5","6","*","1","2","3","-",".","0","=","+"};
        Button[] btn=new Button[a.length];
        for(int i=0;i<=15;i++){
            btn[i]=new Button(a[i]);
            p2.add(btn[i]);
            btn[i].setFont(new Font("黑体",Font.PLAIN,20));
            btn[i].addActionListener(new ButtonWork());
        }
        b.addActionListener(new ButtonWork());

        
        
        f3=new Frame("记事本");
        f3.setLocation(1200, 0);
          MenuBar mb=new MenuBar();
          f3.setMenuBar(mb);
          Menu m1=new Menu("文件(F)");
          Menu m2=new Menu("编辑(E)");
          Menu m3=new Menu("查看(V)");
          Menu m4=new Menu("格式(O)");
          Menu m5=new Menu("帮助(H)");
          MenuItem mi1=new MenuItem("新建(N)      Ctrl+N");
          MenuItem mi2=new MenuItem("打开(O)...   Ctrl+O");
          MenuItem mi3=new MenuItem("保存(S)      Ctrl+S");
          MenuItem mi4=new MenuItem("另存为(A)...       ");
          MenuItem mi5=new MenuItem("页面设置(U)...     ");
          MenuItem mi6=new MenuItem("打印(P)...   Ctrl+P");
          MenuItem mi7=new MenuItem("退出(X)           ");
          m1.add(mi1);m1.add(mi2);m1.add(mi3);m1.add(mi4);
          m1.addSeparator();
          m1.add(mi5);m1.add(mi6);
          m1.addSeparator();
          m1.add(mi7);
          mb.add(m1);mb.add(m2);mb.add(m3);mb.add(m4);mb.add(m5);
        
        f1.setSize(600,400);
        f1.setVisible(true);
        f2.setSize(600,400);
        f2.setVisible(true);
        f3.setSize(600,400);
        f3.setVisible(true);
        f1.addWindowListener(new W());
        f2.addWindowListener(new W());
        f3.addWindowListener(new W());
    }
}

    

