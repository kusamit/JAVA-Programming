/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.frame;
import ui.panel.MainPanel;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import ui.panel.TopPanel;

/**
 *
 * @author Amit Mahato
 */
public class MainFrame extends JFrame{
    MainPanel mp;
    BorderLayout bl;
    TopPanel tp;
    public MainFrame(){
        setSize(600,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Dashboard");
        bl=new BorderLayout();
        mp = new MainPanel();
        tp = new TopPanel();
        setLayout(bl);
        
        add(mp,bl.CENTER);
        
        setVisible(true);
    }
    
}
