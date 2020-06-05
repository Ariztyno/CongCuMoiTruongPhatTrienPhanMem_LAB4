/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class Lab3 extends JFrame{
    
    private static final long serialVersionUID = 1L;
    
    public Lab3(String title){
        setTitle(title);
        JPanel pnFlow = new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.BLUE);
        JButton btn1 = new JButton("FlowLayout");
        JButton btn2 = new JButton("Add cac control");
        JButton btn3 = new JButton("Tren 1 dong");
        JButton btn4 = new JButton("Het cho chua");
        JButton btn5 = new JButton("Thi xuong dong");
        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);
        Container con = getContentPane();
        con.add(pnFlow);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lab3 lab3 = new Lab3("Demo FlowLayout");
        lab3.setSize(600,100);
        lab3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab3.setLocationRelativeTo(null);
        lab3.setVisible(true);
    }
    
}
