
package mousemotioneventexample;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class MouseMotionEventExample extends JFrame implements MouseMotionListener {
    JLabel info,content;
    public MouseMotionEventExample()
    {
    setTitle("Mouse Motion Example");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500,500);
    setLocationRelativeTo(null);
    setBackground(Color.gray);
    info= new JLabel ("move or Drag the mouse inside the frame");
    info.setVerticalAlignment(SwingConstants.TOP);
    
    content =new JLabel ("I amd Constant");
    content.setHorizontalAlignment(SwingConstants.CENTER);
    
    content.addMouseMotionListener(this);
    
    add(info);
    add(content);
    setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MouseMotionEventExample::new);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        content.setText("Mouse Dragged at position, x:" + e.getX() + "Y" + e.getY());  
    }

    @Override
    public void mouseMoved(MouseEvent e) {
          content.setText("i am moved. my position, x:" + e.getX() + "Y" + e.getY());
          if(e.getX() <=200 && e.getY()<=200)
          {
              JOptionPane.showMessageDialog(rootPane, "Opps! you found me");
          }
    }

}
