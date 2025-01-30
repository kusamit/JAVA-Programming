package keylistner;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author shinu
 */
public class KeyListener extends JFrame implements java.awt.event.KeyListener{

    JLabel info,content;
    JTextField txt_listenKey;
    public KeyListener(){
        setTitle("Key Listener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        setBackground(Color.BLACK);
        
        info = new JLabel("Enter Keys");
        txt_listenKey = new JTextField();
        
        txt_listenKey.addKeyListener(this);
        info.addKeyListener(this);
        
        setLayout(new GridLayout(2,2));
        add(info);
        add(txt_listenKey);
        
        setVisible(true);
        
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
      
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
         String Key = txt_listenKey.getText();
        System.out.println(Key);
       
           info.setText(Key);
           
       
       
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(KeyListener::new);
    }
}