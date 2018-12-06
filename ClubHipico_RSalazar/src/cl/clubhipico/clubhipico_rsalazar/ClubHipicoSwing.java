package cl.clubhipico.clubhipico_rsalazar;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 * Clase ClubHipicoSwing
 * Ejemplo de clase swing
 */

public class ClubHipicoSwing extends JFrame implements ActionListener {

    private JLabel nombreLabel;           // etiqueta o texto no editable
    private JLabel accionLabel;           // accion
    private JTextField nombreText;        // caja de texto, para insertar datos
    private JTextField accionText;        // caja de texto, para insertar datos
    private JButton boton;          // boton con una determinada accion
    private JTextArea consola;       //texto area de salida - simil consola
    
    public ClubHipicoSwing() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }

    private void configurarVentana() {
        this.setTitle("Esta Es Una Ventana");                   // colocamos titulo a la ventana
        this.setSize(600, 500);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }

    private void inicializarComponentes() {
        // creamos los componentes
        nombreLabel = new JLabel();
        nombreText = new JTextField();
        accionLabel = new JLabel();
        accionText = new JTextField();
        boton = new JButton();
        consola = new JTextArea();
        // configuramos los componentes
        nombreLabel.setText("Inserte Nombre");    // colocamos un texto a la etiqueta
        accionLabel.setText("Inserte Accion");    // colocamos un texto a la etiqueta
        nombreLabel.setBounds(50, 50, 100, 25);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        nombreText.setBounds(150, 50, 100, 25);   // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        accionLabel.setBounds(50, 50+30, 100, 25);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        accionText.setBounds(150, 50+30, 100, 25);   // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        accionText.setText("Caminar");
        boton.setText("Crear threads");   // colocamos un texto al boton
        boton.setBounds(50, 130, 200, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        boton.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
        // adicionamos los componentes a la ventana
        this.add(nombreLabel);
        this.add(nombreText);
        this.add(accionLabel);
        this.add(accionText);
        this.add(boton);
        this.add(consola);
        
        consola.setBounds(50, 180, 450, 270);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = nombreText.getText();                                 // obtenemos el contenido de la caja de texto
        JOptionPane.showMessageDialog(this, "Se ejcutaran los threads");    // mostramos un mensaje (frame, mensaje)
        
        Thread ejemplo1Thread = new Thread(new ClubHipicoThread("Ejemplo1Thread","comer"));
		ejemplo1Thread.start(); //llama al run() de ClubHipicoThread
		ejemplo1Thread.setName("Ejemplo1Thread");
		
		Thread ejemplo2Thread = new Thread(new ClubHipicoThread("Ejemplo2Thread","dormir"));
		ejemplo2Thread.start(); //llama al run() de ClubHipicoThread
		ejemplo2Thread.setName("Ejemplo2Thread");

		Thread ejemplo3Thread = new Thread(new ClubHipicoThread("Ejemplo3Thread","caminar"));
		ejemplo3Thread.start(); //llama al run() de ClubHipicoThread
		ejemplo3Thread.setName("Ejemplo3Thread");

		Thread ejemplo4Thread = new Thread(new ClubHipicoThread("Ejemplo4Thread","saltar"));
		ejemplo4Thread.start(); //llama al run() de ClubHipicoThread
		ejemplo4Thread.setName("Ejemplo4Thread");

		Thread ejemplo5Thread = new Thread(new ClubHipicoThread("Ejemplo5Thread","beber"));
		ejemplo5Thread.start(); //llama al run() de ClubHipicoThread
		ejemplo5Thread.setName("Ejemplo5Thread");

		consola.append("Thread 1:"+ejemplo1Thread.getName()+"\n");
		consola.append("Thread 2:"+ejemplo2Thread.getName()+"\n");
		consola.append("Thread 3:"+ejemplo3Thread.getName()+"\n");
		consola.append("Thread 4:"+ejemplo4Thread.getName()+"\n");
		consola.append("Thread 5:"+ejemplo5Thread.getName()+"\n");
    }

    public static void main(String[] args) {
    	ClubHipicoSwing swing = new ClubHipicoSwing();      // creamos una ventana
    	swing.setVisible(true);             // hacemos visible la ventana creada
    }
}