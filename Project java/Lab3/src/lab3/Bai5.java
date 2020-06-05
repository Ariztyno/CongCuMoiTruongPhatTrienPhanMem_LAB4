/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class Bai5 extends JFrame{
    
    public Bai5(String title){
        setTitle(title);
        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());
        
        Font font = new Font("Arial",Font.BOLD/Font.ITALIC,25);
        
        JLabel lbNorth = new JLabel("North");
        lbNorth.setForeground(Color.white);
        JLabel lbSourth = new JLabel("Sourth");
        lbSourth.setForeground(Color.white);
        JLabel lbWest = new JLabel("West");
        lbWest.setForeground(Color.white);
        JLabel lbEast = new JLabel("East");
        lbEast.setForeground(Color.white);
        JLabel lbCenter = new JLabel("Center");
        lbCenter.setForeground(Color.BLACK);
        
        lbNorth.setFont(font);
        lbSourth.setFont(font);
        lbEast.setFont(font);
        lbWest.setFont(font);
        lbCenter.setFont(font);
        
        JPanel pnNorth = new JPanel();
        pnNorth.setBackground(Color.red);
        pnBorder.add(pnNorth,BorderLayout.NORTH);
        
        JPanel pnSouth = new JPanel();
        pnSouth.setBackground(Color.red);
        pnBorder.add(pnSouth,BorderLayout.SOUTH);
        
        JPanel pnWest = new JPanel();
        pnWest.setBackground(Color.BLUE);
        pnBorder.add(pnWest,BorderLayout.WEST);
        
        JPanel pnEast = new JPanel();
        pnEast.setBackground(Color.BLUE);
        pnBorder.add(pnEast,BorderLayout.EAST);
        
        JPanel pnCenter = new JPanel();
        pnCenter.setBackground(Color.YELLOW);
        pnBorder.add(pnCenter,BorderLayout.CENTER);
        
        pnCenter.add(lbCenter);
        pnNorth.add(lbNorth);
        pnSouth.add(lbSourth);
        pnWest.add(lbWest);
        pnEast.add(lbEast);
        
        getContentPane().add(pnBorder);
    }
    
    public static void main(String[] args) {
        Bai5 bai5 = new Bai5("Demo");
        bai5.setSize(400,400);
        bai5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bai5.setLocationRelativeTo(null);
        bai5.setVisible(true);
    }
}
