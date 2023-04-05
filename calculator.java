import java.awt.*;
import java.awt.event.*;
public class calculator{
    public static void main(String[] args) {
        Frame f = new Frame("Calculator");
        f.setSize(500,500);

        Label l1 = new Label("Enter your First Number:");
        l1.setBounds(10,110,150,20);
        f.add(l1);
        
        Label l2 = new Label("Enter your Second Number:");
        l2.setBounds(10,140,150,20);
        f.add(l2);

        Label l3 = new Label("Result");
        l3.setBounds(10,180,150,20);
        f.add(l3);


        TextField t1 = new TextField();
        t1.setBounds(170,110,100,20);
        f.add(t1);

        TextField t2 = new TextField();
        t2.setBounds(170,140,100,20);
        f.add(t2);

        // Showing result
        TextField t3 = new TextField();
        t3.setBounds(170,180,100,20);
        f.add(t3);


        Button b1 = new Button("Addition");
        b1.setBounds(40,240,50,20);
        f.add(b1);

        Button b2 = new Button("Substraction");
        b2.setBounds(140,240,70,20);
        f.add(b2);

        Button b3 = new Button("Multiply");
        b3.setBounds(220,240,50,20);
        f.add(b3);

        Button b4 = new Button("Divide");
        b4.setBounds(300,240,50,20);
        f.add(b4);

        // Adding two number
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String n1 = t1.getText();
                String n2 = t2.getText();
                int a = Integer.parseInt(n1);
                int b = Integer.parseInt(n2);
                int c =0;
                // showing result 
                if(e.getSource() == b1){
                    c= a+b;
                }
                String res = String.valueOf(c);
                t3.setText(res);

            }
        });

        // Substraction
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String n1 = t1.getText();
                String n2 = t2.getText();
                int a = Integer.parseInt(n1);
                int b = Integer.parseInt(n2);
                int c =0;
                // showing result 
                if(e.getSource() == b2){
                    c= a-b;
                }
                String res = String.valueOf(c);
                t3.setText(res);

            }
        });
       
        // Multiply
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String n1 = t1.getText();
                String n2 = t2.getText();
                int a = Integer.parseInt(n1);
                int b = Integer.parseInt(n2);
                int c =0;
                // showing result 
                if(e.getSource() == b3){
                    c= a*b;
                }
                String res = String.valueOf(c);
                t3.setText(res);

            }
        });
       
        // Divide
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String n1 = t1.getText();
                String n2 = t2.getText();
                int a = Integer.parseInt(n1);
                int b = Integer.parseInt(n2);
                int c =0;
                // showing result 
                if(e.getSource() == b4){
                    c= a/b;
                }
                String res = String.valueOf(c);
                t3.setText(res);

            }
        });

        // closing the Window
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });


        f.setLayout(null);
        f.setVisible(true);
    }
}