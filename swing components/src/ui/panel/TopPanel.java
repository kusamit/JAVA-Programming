/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.panel;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 *
 * @author Amit Mahato
 */
public class TopPanel extends JPanel{
    JMenuBar jmb;
    JMenuBar user, setting, JmenuItem,user_list,user_add,profile,logout;
    public TopPanel()
    {
        jmb=new JMenuBar();
        user = new JMenu("User",true);
        setting = new JMenu ("Setting",true);
        
        user_list=new JMenuItem("Show User");
        user_add = new JMenuItem("Add User");
        profile = new JMenuItem("Profile");
        logout = new JMenuItem("Logout");
        
        user.add(user_list,0);
        user.add(user_add,0);
        user.add(profile,0);
        user.add(logout ,1);
        
        jmb.add(user);
        jmb.add(setting);
        add(jmb,new BorderLayout().NORTH);
    }
}
