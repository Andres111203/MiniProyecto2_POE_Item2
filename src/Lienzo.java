import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

class Lienzo extends JPanel implements MouseListener, MouseMotionListener {
    private int x1, y1, x2, y2;
    private Color lineColor = Color.BLACK; // Establece el color de la línea

    public Lienzo() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // No implementation needed
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // No implementation needed
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(lineColor);
        g.drawLine(x1, y1, x2, y2);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // No implementation needed
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // No implementation needed
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // No implementation needed
    }
}