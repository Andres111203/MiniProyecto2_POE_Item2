import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;


import javax.swing.JFrame;

class Lienzo extends JFrame implements MouseListener, MouseMotionListener{
    
    private int x1, y1, x2, y2 ;
    Container contenedor;

    public Lienzo(){

        contenedor = getContentPane();
        addMouseListener(this);
        addMouseMotionListener(this);
        setBounds(50, 50, 600,500);
        setTitle("Dibujo Canvas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    
    @Override
    public void mouseMoved(MouseEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }
    public void paint(Graphics g){

        Random random = new Random();
        int red = random.nextInt(250);
        int green = random.nextInt(250);
        int blue = random.nextInt(250);
        g.setColor(new Color(red, green, blue));
        g.drawLine(x1, y1, x2, y2);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

        x1 = e.getX();
        y1 = e.getY();
    
    }
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub

        x2 = e.getX();
        y2 = e.getY();
       
    }


    @Override
    public void mouseReleased(MouseEvent e) {
       
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    

}




public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Lienzo lienzo = new Lienzo();

    }
}
