package ventana;

import modelo.Trabajador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiTrabajador extends JFrame implements ActionListener {
    private JButton botonEditar;
    private JButton botonLeer;
    private JButton botonSalir;
    private JButton botonLimpiar;
    private JPanel panel;
    private JLabel etiquetaNombre;
    private JTextField campoNombre;
    private JLabel etiquetaRut;
    private JTextField campoRut;
    private JLabel etiquetaAfp;
    private JTextField campoAfp;
    private JLabel etiquetaIsapre;
    private JTextField campoIsapre;
    private JLabel etiquetaNombre2;
    private JLabel etiquetaRut2;
    private JLabel etiquetaAfp2;
    private JLabel etiquetaIsapre2;


    public GuiTrabajador(){
        inicializarVentana();
        setSize(600,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void inicializarVentana(){
        panel = new JPanel();
        botonEditar = new JButton("Editar datos trabajador");
        botonSalir = new JButton("Salir");
        botonLeer = new JButton("Ver datos trabajador");
        botonLimpiar = new JButton("Limpiar datos");
        etiquetaNombre = new JLabel("Nombre: ");
        campoNombre = new JTextField(20);
        etiquetaRut = new JLabel("Rut: ");
        campoRut = new JTextField(25);
        etiquetaAfp = new JLabel("AFP: ");
        campoAfp = new JTextField(15);
        etiquetaIsapre = new JLabel("Isapre: ");
        campoIsapre = new JTextField(15);
        etiquetaNombre2 = new JLabel("Nombre: ");
        etiquetaRut2 = new JLabel("Rut: ");
        etiquetaAfp2 = new JLabel("Afp: ");
        etiquetaIsapre2 = new JLabel("Isapre: ");


        Trabajador trabajador = new Trabajador("Juanito Perez","19.951.349-4","colmena","provida");
        //se instancia un objeto trabajador para que inicialmente se pueda leer datos al apretar el boton
        panel.add(etiquetaNombre);
        panel.add(campoNombre);
        panel.add(etiquetaRut);
        panel.add(campoRut);
        panel.add(etiquetaAfp);
        panel.add(campoAfp);
        panel.add(etiquetaIsapre);
        panel.add(campoIsapre);
        panel.add(botonEditar);
        panel.add(botonLeer);
        panel.add(botonSalir);
        panel.add(botonLimpiar);
        panel.add(etiquetaNombre2);
        panel.add(etiquetaRut2);
        panel.add(etiquetaAfp2);
        panel.add(etiquetaIsapre2);


        this.add(panel);

        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = JOptionPane.showConfirmDialog(panel.getParent(),"Desea salir de la app?"
                        ,"Salir de la app",JOptionPane.YES_NO_OPTION);
                if(n==JOptionPane.YES_OPTION) System.exit(0);

            }
        });

        botonLeer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiquetaNombre2.setText("Nombre: " +trabajador.getNombre());
                etiquetaRut2.setText("Rut: "+trabajador.getRut());
                etiquetaAfp2.setText("AFP: "+trabajador.getAfp());
                etiquetaIsapre2.setText("Isapre: "+trabajador.getIsapre());


            }
        });

        botonEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trabajador.setNombre(campoNombre.getText());
                trabajador.setRut(campoRut.getText());
                trabajador.setAfp(campoAfp.getText());
                trabajador.setIsapre(campoIsapre.getText());
            }
        });

        botonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoNombre.setText("");
                campoRut.setText("");
                campoAfp.setText("");
                campoIsapre.setText("");
            }
        });



    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
