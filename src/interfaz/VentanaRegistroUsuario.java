package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import lógica.Verificar;

public class VentanaRegistroUsuario extends JFrame implements ActionListener, KeyListener {

	private JPanel pnlPrincipal;
	private JButton btnSalir;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCorreo;
	private JTextField txtContraseña;
	private JTextField txtDocumento;
	private JComboBox<String> cmbDocumento;
	private JCheckBox cbxAutorizacion;
	private JButton btnIngreso;
	
	private String Cine;
	private String Pelicula;

	
	
	
	
	public VentanaRegistroUsuario() {

		setSize(700, 700);
		setTitle("Ingreso Cliente");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		iniciarComponentes();

	}
	
	public void enviarDatos(String Pelicula, String Cine) {
		
		this.Cine = Cine;
		this.Pelicula = Pelicula;
		
		
	}

	private void iniciarComponentes() {

		crearPanelPrincipal();
		crearComponentes();

	}

	private void crearPanelPrincipal() {

		pnlPrincipal = new JPanel();
		pnlPrincipal.setBackground(Color.GRAY);
		pnlPrincipal.setLayout(null);
		this.getContentPane().add(pnlPrincipal);
		
		
		btnSalir = new JButton();
		btnSalir.setBounds(20, 20, 60, 40);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorder(BorderFactory.createLineBorder(Color.GREEN, 0, true));
		btnSalir.addActionListener(this);
		ImageIcon imagenSalir = new ImageIcon("./img/exitArrow.png");

		btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
				btnSalir.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnSalir);
		
		
		
		
		JLabel lblIngresoUsuario = new JLabel();
		lblIngresoUsuario.setText("Registro Usuario");
		lblIngresoUsuario.setBounds(230, 0, 500, 100);
		lblIngresoUsuario.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		
		pnlPrincipal.add(lblIngresoUsuario);
		
		btnIngreso = new JButton();
		btnIngreso.setBounds(280, 580, 134, 54);
		btnIngreso.addActionListener(this);
		btnIngreso.setContentAreaFilled(false);
		ImageIcon imagenIngreso = new ImageIcon("./img/imgBtnRegistro.png");
		btnIngreso.setIcon(new ImageIcon(imagenIngreso.getImage().getScaledInstance(btnIngreso.getWidth(),
				btnIngreso.getHeight(), Image.SCALE_SMOOTH)));
		btnIngreso.setEnabled(false);
		

		pnlPrincipal.add(btnIngreso);
		

	}
	
	private void crearComponentes() {
		
		JLabel lblNombre = new JLabel();
		lblNombre.setText("Nombres: ");
		lblNombre.setBounds(120, 110, 150, 30);
		lblNombre.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));
		
		pnlPrincipal.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(120, 140, 200, 30);
		txtNombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtNombre.addKeyListener(this);
		
		pnlPrincipal.add(txtNombre);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JLabel lblApellido = new JLabel();
		lblApellido.setText("Apellidos: ");
		lblApellido.setBounds(400, 110, 150, 30);
		lblApellido.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));
		
		pnlPrincipal.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(400, 140, 200, 30);
		txtApellido.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtApellido.addKeyListener(this);
		
		pnlPrincipal.add(txtApellido);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JLabel lblCorreo = new JLabel();
		lblCorreo.setText("Correo electrónico: ");
		lblCorreo.setBounds(120, 210, 150, 30);
		lblCorreo.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));
		
		pnlPrincipal.add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(120, 240, 200, 30);
		txtCorreo.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		
		pnlPrincipal.add(txtCorreo);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JLabel lblContraseña = new JLabel();
		lblContraseña.setText("Contraseña: ");
		lblContraseña.setBounds(400, 210, 150, 30);
		lblContraseña.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));
		
		pnlPrincipal.add(lblContraseña);
		
		txtContraseña = new JTextField();
		txtContraseña.setBounds(400, 240, 200, 30);
		txtContraseña.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		
		pnlPrincipal.add(txtContraseña);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JLabel lblDocumento1 = new JLabel();
		lblDocumento1.setText("Documento de identidad: ");
		lblDocumento1.setBounds(120, 310, 190, 30);
		lblDocumento1.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));
		
		pnlPrincipal.add(lblDocumento1);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(400, 340, 200, 30);
		txtDocumento.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtDocumento.addKeyListener(this);
		
		pnlPrincipal.add(txtDocumento);
		
		cmbDocumento = new JComboBox<>();
		cmbDocumento.addItem("Cédula de Ciudadania");
		cmbDocumento.setBounds(120, 340, 190, 30);
		cmbDocumento.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		
		
		pnlPrincipal.add(cmbDocumento);
		
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	
		cbxAutorizacion = new JCheckBox();
		cbxAutorizacion.setBounds(120, 350, 400, 260);
		cbxAutorizacion.setContentAreaFilled(false);
		cbxAutorizacion.setText("<html>En cumplimiento del Régimen de Protección Datos Personales, "
				+ "autorizo expresamente a Cine Distrito, de manera directa, o a través de terceros "
				+ "designados, para almacenar, consultar, procesar y en general, para dar tratamiento "
				+ "a la información personal que suministre, y para ser incluido en sus bases de datos, "
				+ "recibir información de la Compañía, de conformidad con las políticas de privacidad "
				+ "y manejo de información.</html>");
		cbxAutorizacion.addActionListener(this);
		pnlPrincipal.add(cbxAutorizacion);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cbxAutorizacion) {
			
			if(!cbxAutorizacion.isSelected()) {
				
				btnIngreso.setEnabled(false);
				
			}else {
				btnIngreso.setEnabled(true);
			}
			
		}else if(e.getSource()==btnIngreso) {
			
			
			if(!Verificar.isNumeric(txtDocumento.getText())) {
				
				JOptionPane.showMessageDialog(null, "Ingrese un número de documento válido");
				txtDocumento.setText("");
				
			}
			
			
			if(!Verificar.esCorreo(txtCorreo.getText())) {
				
				JOptionPane.showMessageDialog(null, "Ingrese un formato de correo válido");
				txtCorreo.setText("");
				
				
			}
			
			if(txtApellido.getText().isEmpty() || txtNombre.getText().isEmpty() || txtContraseña.getText().isEmpty() || txtCorreo.getText().isEmpty() || txtDocumento.getText().isEmpty()){
				
				
				JOptionPane.showMessageDialog(null, "Porfavor no deje espacios en blanco");
				btnIngreso.setEnabled(false);
				cbxAutorizacion.setSelected(false);
				
				
			}else {
				
				btnIngreso.setEnabled(true);
				
			}
			
			
			
			
			
		}else if(e.getSource()==btnSalir) {
			
			VentanaIngresoUsuario viu = new VentanaIngresoUsuario(Cine, Pelicula);
			this.dispose();
			viu.setVisible(true);
			
		}
		
	}

	@Override
	public void keyTyped(KeyEvent evt) {
		if(evt.getSource()==txtDocumento) {
			
			char c = evt.getKeyChar();
			
			if(c<'0' || c>'9') evt.consume();
			
			
		}else if(evt.getSource()==txtNombre) {
			
			char c = evt.getKeyChar();
			
			if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c != ' ')) evt.consume();
			
		}else if(evt.getSource()==txtApellido) {
			
			char c = evt.getKeyChar();
			
			if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c != ' ')) evt.consume();
			
		}
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
