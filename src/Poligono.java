import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

class Poligono extends JPanel {
    private List<Point> puntos;

    public Poligono() {
        puntos = new ArrayList<>();
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                puntos.add(e.getPoint());
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (puntos.size() > 1) {
            int[] xPoints = new int[puntos.size()];
            int[] yPoints = new int[puntos.size()];
            for (int i = 0; i < puntos.size(); i++) {
                Point punto = puntos.get(i);
                xPoints[i] = punto.x;
                yPoints[i] = punto.y;
            }
            g.drawPolygon(xPoints, yPoints, puntos.size());
        }
    }
}