//Construccion de un sistema de control vacacional de coca-cola
//Pantalla principal

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {
	
	//componentes
	private JMenuBar mb;
	private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
	private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador,
					  miSalir, miNuevo;
	private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre,
				   labelAPaterno, labelAMaterno, labelDepartamento,
				   labelAntiguedad, labelResultado, labelFooter;
	private JTextField txtNombreTrabajador, txtAPaternoTrabajador,
					   txtAMaternoTrabajador;
	private JComboBox comboDepartamento, comboAntiguedad;
	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	String nombreAdministrador = "";
	
	public Principal() {
		
			//diseño
			setLayout(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE); //cierra el programa
			setTitle("Pantalla Principal");
			getContentPane().setBackground(new Color(255, 0, 0));
			
			//imagen 
			setIconImage(new ImageIcon(getClass().getResource("images/icon.png")
			).getImage());
			
			//Barra principal
			mb = new JMenuBar();
			mb.setBackground(new Color(255, 0, 0));
			setJMenuBar(mb);
			
			//solicitar valor de la clase Bienvenida
			Bienvenida ventanaBienvenida = new Bienvenida();
			nombreAdministrador = ventanaBienvenida.texto;
			
			//menu opciones
			menuOpciones = new JMenu("Opciones");
			menuOpciones.setBackground(new Color(255, 0, 0));
			menuOpciones.setFont(new Font("Andale Mono", 1, 14));
			menuOpciones.setForeground(new Color(255, 255, 255));
			mb.add(menuOpciones);
			
			//menu caluclar
			menuCalcular = new JMenu("Calcular");
			menuCalcular.setBackground(new Color(255, 0, 0));
			menuCalcular.setFont(new Font("Andale Mono", 1, 14));
			menuCalcular.setForeground(new Color(255, 255, 255));
			mb.add(menuCalcular);
			
			//menu acerca de
			menuAcercaDe = new JMenu("Acerca de");
			menuAcercaDe.setBackground(new Color(255, 0, 0));
			menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
			menuAcercaDe.setForeground(new Color(255, 255, 255));
			mb.add(menuAcercaDe);
			
			//submenu color fondo (opciones)
			menuColorFondo = new JMenu("Color de Fondo");
			menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
			menuColorFondo.setForeground(new Color(255, 0, 0));
			menuOpciones.add(menuColorFondo);
			
			//menu item vacaciones
			miCalculo = new JMenuItem("Vacaciones");
			miCalculo.setFont(new Font("Andale Mono", 1, 14));
			miCalculo.setForeground(new Color(255, 0, 0));
			menuCalcular.add(miCalculo);
			miCalculo.addActionListener(this);
			
			//menu item colores rojo
			miRojo = new JMenuItem("Rojo");
			miRojo.setFont(new Font("Andale Mono", 1, 14));
			miRojo.setForeground(new Color(255, 0, 0));
			menuColorFondo.add(miRojo);
			miRojo.addActionListener(this);
			
			//negro
			miNegro = new JMenuItem("Negro");
			miNegro.setFont(new Font("Andale Mono", 1, 14));
			miNegro.setForeground(new Color(255, 0, 0));
			menuColorFondo.add(miNegro);
			miNegro.addActionListener(this);
			
			//morado
			miMorado = new JMenuItem("Morado");
			miMorado.setFont(new Font("Andale Mono", 1, 14));
			miMorado.setForeground(new Color(255, 0, 0));
			menuColorFondo.add(miMorado);
			miMorado.addActionListener(this);
			
			//nuevo
			miNuevo = new JMenuItem("Nuevo");
			miNuevo.setFont(new Font("Andale Mono", 1, 14));
			miNuevo.setForeground(new Color(255, 0, 0));
			menuOpciones.add(miNuevo);
			miNuevo.addActionListener(this);
			
			//el creador
			miElCreador = new JMenuItem("El Creador");
			miElCreador.setFont(new Font("Andale Mono", 1, 14));
			miElCreador.setForeground(new Color(255, 0, 0));
			menuAcercaDe.add(miElCreador);
			miElCreador.addActionListener(this);
			
			//salir
			miSalir = new JMenuItem("Salir");
			miSalir.setFont(new Font("Andale Mono", 1, 14));
			miSalir.setForeground(new Color(255, 0, 0));
			menuOpciones.add(miSalir);
			miSalir.addActionListener(this);
			
			//logo
			ImageIcon imagen = new ImageIcon("images/logo-coca.png");
			labelLogo = new JLabel(imagen);
			labelLogo.setBounds(5, 5, 250, 100);
			add(labelLogo);
			
			//bienvenida
			labelBienvenido = new JLabel("Bienvenido "
										+ nombreAdministrador);
			labelBienvenido.setBounds(280, 30, 300, 50);
			labelBienvenido.setFont(new Font("Anadale Mono", 1, 32));
			labelBienvenido.setForeground(new Color(255, 255, 255));
			add(labelBienvenido);
			
			//titulo
			labelTitle = new JLabel("Datos del trabajador para el "
									+ "cálculo de vacaciones.");
			labelTitle.setBounds(45, 140, 900, 25);
			labelTitle.setFont(new Font("Anadale Mono", 0, 24));
			labelTitle.setForeground(new Color(255, 255, 255));
			add(labelTitle);
			
			//nombre
			labelNombre = new JLabel("Nombre Completo:");
			labelNombre.setBounds(25, 188, 180, 25);
			labelNombre.setFont(new Font("Andale Mono", 1, 12));
			labelNombre.setForeground(new Color(255, 255, 255));
			add(labelNombre);
			
			//campo nombre
			txtNombreTrabajador = new JTextField();
			txtNombreTrabajador.setBounds(25, 213, 150, 25);
			txtNombreTrabajador.setBackground(new Color(224, 224, 224));
			txtNombreTrabajador.setFont(new Font("Andale Mono", 1, 14));
			txtNombreTrabajador.setForeground(new Color(255, 0, 0));
			add(txtNombreTrabajador);
			
			//apellido paterno
			labelAPaterno = new JLabel("Apellido Paterno:");
			labelAPaterno.setBounds(25, 248, 180, 25);
			labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
			labelAPaterno.setForeground(new Color(255, 255, 255));
			add(labelAPaterno);
			
			//campo apellido parterno
			txtAPaternoTrabajador = new JTextField();
			txtAPaternoTrabajador.setBounds(25, 273, 150, 25);
			txtAPaternoTrabajador.setBackground(new Color(224, 224, 224));
			txtAPaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
			txtAPaternoTrabajador.setForeground(new Color(255, 0, 0));
			add(txtAPaternoTrabajador);
			
			//apellido materno
			labelAMaterno = new JLabel("Apellido materno:");
			labelAMaterno.setBounds(25, 308, 180, 25);
			labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
			labelAMaterno.setForeground(new Color(255, 255, 255));
			add(labelAMaterno);
			
			//campo apellido materno
			txtAMaternoTrabajador = new JTextField();
			txtAMaternoTrabajador.setBounds(25, 334, 150, 25);
			txtAMaternoTrabajador.setBackground(new Color(224, 224, 224));
			txtAMaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
			txtAMaternoTrabajador.setForeground(new Color(255, 0, 0));
			add(txtAMaternoTrabajador);
			
			//departamento
			labelDepartamento = new JLabel("Selecciona el departamento");
			labelDepartamento.setBounds(220, 188, 180, 25);
			labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
			labelDepartamento.setForeground(new Color(255, 255, 255));
			add(labelDepartamento);
			
			//combo departamento
			comboDepartamento = new JComboBox();
			comboDepartamento.setBounds(220, 213, 220, 25);
			comboDepartamento.setBackground(new Color(224, 224, 224));
			comboDepartamento.setFont(new Font("Andale Mono", 1, 14));
			comboDepartamento.setForeground(new Color(255, 0, 0));
			add(comboDepartamento);
			comboDepartamento.addItem("");
			comboDepartamento.addItem("Atención al cliente");
			comboDepartamento.addItem("Departamento de logística");
			comboDepartamento.addItem("Departamento de gerencia");
			
			//antiguedad
			labelAntiguedad = new JLabel("Selecciona la antiguedad");
			labelAntiguedad.setBounds(220, 248, 180, 25);
			labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
			labelAntiguedad.setForeground(new Color(255, 255, 255));
			add(labelAntiguedad);
			
			//combo antiguedad
			comboAntiguedad = new JComboBox();
			comboAntiguedad.setBounds(220, 273, 220, 25);
			comboAntiguedad.setBackground(new Color(224, 224, 224));
			comboAntiguedad.setFont(new Font("Andale Mono", 1, 14));
			comboAntiguedad.setForeground(new Color(255, 0, 0));
			add(comboAntiguedad);
			comboAntiguedad.addItem("");
			comboAntiguedad.addItem("1 año de servicio");
			comboAntiguedad.addItem("2 a 6 años de servicio");
			comboAntiguedad.addItem("7 o más años de servicio");
			
			//resultado
			labelResultado = new JLabel("Resultado del cálculo:");
			labelResultado.setBounds(220, 307, 180, 25);
			labelResultado.setFont(new Font("Andale Mono", 1, 12));
			labelResultado.setForeground(new Color(255, 255, 255));
			add(labelResultado);
			
			//textarea resultado
			textarea1 = new JTextArea();
			textarea1.setEditable(false);
			textarea1.setBackground(new Color(224, 224, 224));
			textarea1.setFont(new Font("Andale Mono", 1, 11));
			textarea1.setText("\n   Aquí aparece el resultado del "
							  + "cálculo de las vacaciones");
			textarea1.setForeground(new Color(255, 0, 0));
			scrollpane1 = new JScrollPane(textarea1);
			scrollpane1.setBounds(220, 333, 385, 90);
			add(scrollpane1);
			
			//footer
			labelFooter = new JLabel("@2018 The Coca-Cola Company " +
								"| Todos los derechos reservados");
			labelFooter.setBounds(135, 445, 500, 30);
			labelFooter.setFont(new Font("Andale Mono", 1, 12));
			labelFooter.setForeground(new Color(255, 255, 255));
			add(labelFooter);
		}
		
	public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == miCalculo) {
					
					//obtiene los elementos del formulario
					
					String nombreTrabajador = txtNombreTrabajador.getText();
					String AP = txtAPaternoTrabajador.getText();
					String AM = txtAMaternoTrabajador.getText();
					String Departamento = comboDepartamento.getSelectedItem()
										  .toString();
					String Antiguedad = comboAntiguedad.getSelectedItem()
										.toString();
										
										
				    if (nombreTrabajador.equals("") || AP.equals("")
						|| AM.equals("") || Departamento.equals("")
						|| Antiguedad.equals("")) {
							
								//muestra el mensaje
								JOptionPane.showMessageDialog(null,
								"Debes llenar todos los campos");
							}
				    
				    else {
						
							if (Departamento.equals("Atención al cliente")) {
									
									if (Antiguedad.equals("1 año de servicio")) {
											
											textarea1.setText("\n   El trabajdor " + nombreTrabajador + " " + AP + " " + AM 
															 + "\n   quien labora en: " + Departamento + " con " + Antiguedad 
															 + "\n   recibe 6 días de vacaciones");
										}
										
									else if (Antiguedad.equals("2 a 6 años de servicio")) {
											
											textarea1.setText("\n   El trabajdor " + nombreTrabajador + " " + AP + " " + AM 
															 + "\n   quien labora en: " + Departamento + " con " + Antiguedad 
															 + "\n   recibe 14 días de vacaciones");
										}
										
									else if (Antiguedad.equals("7 o más años de servicio")) {
											
											textarea1.setText("\n   El trabajdor " + nombreTrabajador + " " + AP + " " + AM 
															 + "\n   quien labora en: " + Departamento + " con " + Antiguedad 
															 + "\n   recibe 20 días de vacaciones");
										}
								}
								
								
							if (Departamento.equals("Departamento de logística")) {
									
									if (Antiguedad.equals("1 año de servicio")) {
											
											textarea1.setText("\n   El trabajdor " + nombreTrabajador + " " + AP + " " + AM 
															 + "\n   quien labora en: " + Departamento + " con " + Antiguedad 
															 + "\n   recibe 6 días de vacaciones");
										}
										
									else if (Antiguedad.equals("2 a 6 años de servicio")) {
											
											textarea1.setText("\n   El trabajdor " + nombreTrabajador + " " + AP + " " + AM 
															 + "\n   quien labora en: " + Departamento + " con " + Antiguedad 
															 + "\n   recibe 14 días de vacaciones");
										}
										
									else if (Antiguedad.equals("7 o más años de servicio")) {
											
											textarea1.setText("\n   El trabajdor " + nombreTrabajador + " " + AP + " " + AM 
															 + "\n   quien labora en: " + Departamento + " con " + Antiguedad 
															 + "\n   recibe 20 días de vacaciones");
										}
								}
								
							if (Departamento.equals("Departamento de gerencia")) {
									
									if (Antiguedad.equals("1 año de servicio")) {
											
											textarea1.setText("\n   El trabajdor " + nombreTrabajador + " " + AP + " " + AM 
															 + "\n   quien labora en: " + Departamento + " con " + Antiguedad 
															 + "\n   recibe 6 días de vacaciones");
										}
										
									else if (Antiguedad.equals("2 a 6 años de servicio")) {
											
											textarea1.setText("\n   El trabajdor " + nombreTrabajador + " " + AP + " " + AM 
															 + "\n   quien labora en: " + Departamento + " con " + Antiguedad 
															 + "\n   recibe 15 días de vacaciones");
										}
										
									else if (Antiguedad.equals("7 o más años de servicio")) {
											
											textarea1.setText("\n   El trabajdor " + nombreTrabajador + " " + AP + " " + AM 
															 + "\n   quien labora en: " + Departamento + " con " + Antiguedad 
															 + "\n   recibe 21 días de vacaciones");
										}
								}
						}
				}
				
			if (e.getSource() == miRojo) {
					
					getContentPane().setBackground(new Color(255, 0, 0));
				}
				
			if (e.getSource() == miMorado) {
					
					getContentPane().setBackground(new Color(51, 0, 51));
				}
				
			if (e.getSource() == miNegro) {
					
					getContentPane().setBackground(new Color(0, 0, 0));
				}
				
			if (e.getSource() == miNuevo) {
					
					//limpia lsos campos de texto
					txtNombreTrabajador.setText("");
					txtAMaternoTrabajador.setText("");
					txtAPaternoTrabajador.setText("");
					comboDepartamento.setSelectedIndex(0);
					comboAntiguedad.setSelectedIndex(0);
					
					textarea1.setText("\n   Aquí aparece el resultado "
									 + "del cálculo de las vacaciones.");
				}
			
			if (e.getSource() == miSalir) {
					
					Bienvenida ventanaBienvenida = new Bienvenida();
					ventanaBienvenida.setBounds(0, 0, 350, 450);
					ventanaBienvenida.setVisible(true);
					ventanaBienvenida.setResizable(false);
					ventanaBienvenida.setLocationRelativeTo(null);
					this.setVisible(false);
				}
			
			if (e.getSource() == miElCreador) {
					
					JOptionPane.showMessageDialog(null, 
						"Desarrollado Agata Tecnologies\n" 
						+ "www.agatech.com/GabrielMartinezM");
				}
		}
	
	//arranca la aplicacion	
	public static void main(String args[]) {
		
			Principal ventanaPrincipal = new Principal();
			ventanaPrincipal.setBounds(0, 0, 640, 535);
			ventanaPrincipal.setVisible(true);
			ventanaPrincipal.setResizable(false);
			ventanaPrincipal.setLocationRelativeTo(null);
			
		}
			
}
