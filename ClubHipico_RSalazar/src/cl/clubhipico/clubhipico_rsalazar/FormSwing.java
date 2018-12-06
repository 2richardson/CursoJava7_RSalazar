package cl.clubhipico.clubhipico_rsalazar;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;




public class FormSwing extends JFrame{
	public FormSwing() {
		super("Formulario Basico");
		getContentPane().setLayout(new FlowLayout());
	
		JLabel label = new JLabel("Introduce tu nombre:");
		JTextField textfield = new JTextField("nombre",20);
		JButton boton = new JButton("Enviar");
		
		getContentPane().add(label);
		getContentPane().add(textfield);
		getContentPane().add(boton);
		
		setSize(400,300);
		setVisible(true);
	}
}
