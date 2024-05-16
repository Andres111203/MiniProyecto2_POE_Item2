import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {
    private Container contenedor;
    private JPanel panel1;
    private JButton boton1, boton2, boton3;
    private Lienzo lienzo;
    private Poligono poligono;

    Color miColor = new Color(216, 225, 230);
    Color mi_Otro_Color = new Color(110, 135, 146);

    public Ventana() {
        setTitle("Figuras en Lienzo");
        setSize(200, 280);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());

        panel1 = new JPanel();
        panel1.setBackground(miColor);

        contenedor.add(panel1);

        boton1 = new JButton("Lineas");
        boton2 = new JButton("Poligonos");
        boton3 = new JButton("lineas coloridas");

        panel1.add(boton1);
        panel1.add(boton2);
        panel1.add(boton3);

        Dimension buttonSize = new Dimension(160, 75);
        boton1.setPreferredSize(buttonSize);
        boton2.setPreferredSize(buttonSize);
        boton3.setPreferredSize(buttonSize);

        contenedor.add(panel1, BorderLayout.CENTER);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contenedor.removeAll();
                contenedor.add(new Lienzo());
                contenedor.revalidate();
                contenedor.repaint();
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame poligonoFrame = new JFrame("Polígono Irregular");
                poligonoFrame.setSize(500, 600);
                poligonoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                poligonoFrame.add(new Poligono());
                poligonoFrame.setVisible(true);
            }
        });

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /* */
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /* */
    }

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
    }
}
