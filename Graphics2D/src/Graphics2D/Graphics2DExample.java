
package Graphics2D;
import javax.swing.JFrame;

public class Graphics2DExample extends JFrame{
    MainPanel mainPanel;
    public Graphics2DExample(){
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        mainPanel = new MainPanel();
        add(mainPanel);
        pack(); // will set JPanel width and height same as JFRAME
        
        
    }
    public static void main(String[] args) {
        new Graphics2DExample();
    }
}