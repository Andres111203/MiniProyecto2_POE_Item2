import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

class Poligono extends JPanel {
    private List<Point> lineas;

    public Poligono() {
        lineas = new ArrayList<>();
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lineas.add(e.getPoint());
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (lineas.size() > 1) {
            int[] xPoints = new int[lineas.size()];
            int[] yPoints = new int[lineas.size()];
            for (int i = 0; i < lineas.size(); i++) {
                Point punto = lineas.get(i);
                xPoints[i] = punto.x;
                yPoints[i] = punto.y;
            }
            g.drawPolygon(xPoints, yPoints, lineas.size());
        }
    }
}