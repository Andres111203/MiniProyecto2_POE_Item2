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
    private LineasColoridas lineasColoridas;

    public Ventana() {
        setTitle("Figuras en Lienzo");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());

        panel1 = new JPanel();
        panel1.setBackground(new Color(216, 225, 230));

        boton1 = new JButton("Líneas");
        boton2 = new JButton("Polígonos");
        boton3 = new JButton("Líneas Coloridas");

        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);

        panel1.add(boton1);
        panel1.add(boton2);
        panel1.add(boton3);

        contenedor.add(panel1, BorderLayout.NORTH);

        // Inicializar los componentes una vez
        lienzo = new Lienzo();
        lineasColoridas = new LineasColoridas();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        contenedor.removeAll();
        contenedor.add(panel1, BorderLayout.NORTH);
        if (e.getSource() == boton1) {
            contenedor.add(lienzo, BorderLayout.CENTER);
        } else if (e.getSource() == boton2) {
            // Inicializamos el polígono solo cuando se necesita
            if (poligono == null) {
                poligono = new Poligono();
            }
            contenedor.add(poligono, BorderLayout.CENTER);
        } else if (e.getSource() == boton3) {
            contenedor.add(lineasColoridas, BorderLayout.CENTER);
        }
        contenedor.revalidate();
        contenedor.repaint();
    }
}