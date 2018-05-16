//Construccion de un sistema de control vacacional de coca-cola
//Términos y condiciones

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;

public class Licencia extends JFrame implements ActionListener, 
ChangeListener {

	//componentes
	private JLabel label1, label2;
	private JCheckBox check1;
	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	private JButton boton1, boton2;
	String nombre = "";
	
	//constructor
	public Licencia() {
			
			//diseño
			setLayout(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE); //cierra el programa
			setTitle("Licencia de uso");
			
			//imagen 
			setIconImage(new ImageIcon(getClass().getResource("images/icon.png")
			).getImage());
			
			//solicitar valor de la clase Bienvenida
			Bienvenida ventanaBienvenida = new Bienvenida();
			nombre = ventanaBienvenida.texto;
			
			//etiquetas
			label1 = new JLabel("TÉRMINOS Y CONDICIONES");
			label1.setBounds(215, 5, 200, 30);
			label1.setFont(new Font("Andale Mono", 1, 14));
			label1.setForeground(new Color(0, 0, 0));
			add(label1);
			 
			//campo de texto
			textarea1 = new JTextArea();
			textarea1.setEditable(false);
			textarea1.setFont(new Font("Andale Mono", 0, 9));
			textarea1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
				"\n\n          A. PROHIBIDA SU VENTA O DISTRIBUCIÓN" +
				" SIN AUTORIZACIÓN DE SU DUEÑO GABRIEL MARTÍNEZ" +
				"\n          B. PROHIBIDA LA ALTERACIÓN DEL CODIGO" +
				" FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
				"\n          C. AGATECH NO SE HACE RESPONSABLE DEL " +
				"USO DE ESTE SOFTWARE." + "\n\n          LOS " +
				"ACUERDOS LEGALES EXPUESTOS A CONTINUACIÓN RIGEN DEL " +
				"USO QUE USTED HAGA DE ESTE SOFTWARE" +
				"\n\n          (AGATECH Y EL AUTOR GABRIEL), NO SE " +
				"RESPONSABILIZAN DEL USO QUE USTED" + 
				"\n          HAGA DE ESTE SOFTWARE Y SUS SERVICIOS. " +
				"PARA ACEPTAR ESTOS TÉRMINOS HAGA CLICK EN (ACEPTO)" +
				"\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA " +
				"CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +
				"\n\n         PARA MAYOR INFORMACIÓN SOBRE NUESTROS " +
				"PRODUCTOS Y SERVICIOS, POR FAVOR VISITE" + 
				"\n         http://www.agatech.com/gabrielmartinezm");
			scrollpane1 = new JScrollPane(textarea1);
			scrollpane1.setBounds(10, 40, 575, 200);
			add(scrollpane1);
			
			//checkbox
			check1 = new JCheckBox("Yo " + nombre + " Acepto");
			check1.setBounds(10, 250, 300, 30);
			check1.addChangeListener(this); //accion
			add(check1);
			
			//botones
			boton1 = new JButton("Continuar");
			boton1.setBounds(10, 290, 100, 30);
			boton1.addActionListener(this);
			boton1.setEnabled(false);
			add(boton1);
			
			boton2 = new JButton("No Acepto");
			boton2.setBounds(120, 290, 100, 30);
			boton2.addActionListener(this); //accion
			boton2.setEnabled(true);
			add(boton2);
			
			//imagen
			ImageIcon imagen = new ImageIcon("images/coca-cola.png");
			label2 = new JLabel(imagen);
			label2.setBounds(315, 135, 300, 300);
			add(label2);
			
		}
		
	public void stateChanged(ChangeEvent e) {
			
			//activa los botones	
			if (check1.isSelected() == true) {
					
					boton1.setEnabled(true);
					boton2.setEnabled(false);
				}
			
			else {
					boton1.setEnabled(false);
					boton2.setEnabled(true);
				}		
		}
	
	public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == boton1) {
					
					Principal ventanaPrincipal = new Principal();
					ventanaPrincipal.setBounds(0, 0, 640, 535);
					ventanaPrincipal.setVisible(true);
					ventanaPrincipal.setResizable(false);
					ventanaPrincipal.setLocationRelativeTo(null);
					this.setVisible(false);
				}
				
			else if (e.getSource() == boton2) {
					
					Bienvenida ventanaBienvenida = new Bienvenida();
					ventanaBienvenida.setBounds(0, 0, 350, 450);
					ventanaBienvenida.setVisible(true);
					ventanaBienvenida.setResizable(false);
					ventanaBienvenida.setLocationRelativeTo(null);
					this.setVisible(false);
				}
		}
		
	//arranca el programa
	public static void main(String args[]) {
		
			Licencia ventanaLicencia = new Licencia();
			ventanaLicencia.setBounds(0, 0, 600, 360);
			ventanaLicencia.setVisible(true);
			ventanaLicencia.setResizable(false);
			ventanaLicencia.setLocationRelativeTo(null);
			
		}
}
