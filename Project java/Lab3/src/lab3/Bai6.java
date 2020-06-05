/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class Bai6 extends JFrame implements ActionListener{
    static JButton btnAdd,btnSub,btnMul,btnDiv;
    static JTextField tfNum1,tfNum2,tfResult;
    public Bai6(){
        setTitle("Caculator");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        Container con=getContentPane();
        JLabel lbnum1=new JLabel("First num:");
        lbnum1.setBounds(30, 30, 100, 30);
        con.add(lbnum1);
        
        tfNum1=new JTextField();
        tfNum1.setBounds(150, 30, 200, 30);
        con.add(tfNum1);
        
        JLabel lbnum2=new JLabel("Second num:");
        lbnum2.setBounds(30, 90, 100, 30);
        con.add(lbnum2);
        
        tfNum2=new JTextField();
        tfNum2.setBounds(150, 90, 200, 30);
        con.add(tfNum2);
        
        JLabel lbResult=new JLabel("Result:");
        lbResult.setBounds(30, 150, 100, 30);
        con.add(lbResult);
        
        tfResult=new JTextField();
        tfResult.setBounds(150, 150, 200, 30);
        tfResult.setEditable(false);
        con.add(tfResult);
        
        int x=60;
        Font font=new Font("Times New Roman",Font.BOLD,20);
        btnAdd=new JButton("+");
        btnAdd.setFont(font);
        btnAdd.setBounds(x, 210, 50, 50);
        btnAdd.addActionListener(this);
        con.add(btnAdd);
        
        btnSub=new JButton("-");
        btnSub.setFont(font);
        btnSub.setBounds(x+70, 210, 50, 50);
        btnSub.addActionListener(this);
        con.add(btnSub);
        
        btnMul=new JButton("*");
        btnMul.setFont(font);
        btnMul.setBounds(x+140, 210, 50, 50);
        btnMul.addActionListener(this);
        con.add(btnMul);
        
        btnDiv=new JButton("/");
        btnDiv.setFont(font);
        btnDiv.setBounds(x+210, 210, 50, 50);
        btnDiv.addActionListener(this);
        con.add(btnDiv);
        
        
        
    }
    
    public static void main(String[] args) {
        Bai6 bai6 = new Bai6();
        bai6.setBounds(200, 200, 400, 350);
        bai6.setVisible(true);
    }

    boolean CheckInputIsNumber(String t){
        try{
            int x=Integer.parseInt(t);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        float a=0,b=0,c=0;
        
        if(!CheckInputIsNumber(new String(tfNum1.getText()))||!CheckInputIsNumber(new String(tfNum2.getText()))){
            this.tfNum2.setText("");
            this.tfNum1.setText("");
            this.tfNum1.requestFocus();
            JOptionPane.showMessageDialog(this,"Nhập sai giá trị! phải nhập số mới tính được","Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        if(e.getSource()==btnAdd){
            a=Integer.parseInt(tfNum1.getText());
            b=Integer.parseInt(tfNum2.getText());
            c=a+b;
            this.tfResult.setText(String.valueOf(c));
        }
        if(e.getSource()==btnSub){
            a=Integer.parseInt(tfNum1.getText());
            b=Integer.parseInt(tfNum2.getText());
            c=a-b;
            this.tfResult.setText(String.valueOf(c));
        }
        if(e.getSource()==btnMul){
            a=Integer.parseInt(tfNum1.getText());
            b=Integer.parseInt(tfNum2.getText());
            c=a*b;
            this.tfResult.setText(String.valueOf(c));
        }
        if(e.getSource()==btnDiv){
            a=Integer.parseInt(tfNum1.getText());
            b=Integer.parseInt(tfNum2.getText());
            if(b==0){
                this.tfNum2.setText("");
                this.tfNum1.setText("");
                this.tfNum1.requestFocus();
                JOptionPane.showMessageDialog(this,"Số bị chia không được bằng 0 (second num=0). Nhập lại đê bạn ơi!","Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            c=a/b;
            this.tfResult.setText(String.valueOf(c));
        }
    }
    
}
