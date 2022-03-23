package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaAdmin extends JFrame implements ActionListener{
	
	
	private JPanel pnlPrincipal;
	private JButton btnSalir;
	private JButton btnAgregarEmpleado;
	private JButton btnCambiarContraseña;
	private JButton btnCerrarSesion;

	public VentanaAdmin() {
		
		setSize(700, 700);
		setTitle("Admin");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		iniciarComponentes();

		
		
	}
	
	private void iniciarComponentes() {
		
		crearPanelPrincipal();
		crearPanelBotones();
		
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

		//pnlPrincipal.add(btnSalir);
		
		
		btnCerrarSesion = new JButton();
		btnCerrarSesion.setBounds(250, 580, 168, 49);
		btnCerrarSesion.addActionListener(this);
		btnCerrarSesion.setContentAreaFilled(false);
		ImageIcon imagenCerrarSesion = new ImageIcon("./img/imgBtnCerrarSesion.png");
		btnCerrarSesion.setIcon(new ImageIcon(imagenCerrarSesion.getImage().getScaledInstance(btnCerrarSesion.getWidth(),
				btnCerrarSesion.getHeight(), Image.SCALE_SMOOTH)));
		

		pnlPrincipal.add(btnCerrarSesion);
		
		
		
		
	}
	
	private void crearPanelBotones() {
		
		btnAgregarEmpleado = new JButton();
		btnAgregarEmpleado.setBounds(110,  170 , 186, 49);
		btnAgregarEmpleado.addActionListener(this);
		btnAgregarEmpleado.setContentAreaFilled(false);
		ImageIcon imagenAgregarEmpleado = new ImageIcon("./img/imgBtnAgregarUsuario.png");
		btnAgregarEmpleado.setIcon(new ImageIcon(imagenAgregarEmpleado.getImage().getScaledInstance(btnAgregarEmpleado.getWidth(),
				btnAgregarEmpleado.getHeight(), Image.SCALE_SMOOTH)));
		
		
		pnlPrincipal.add(btnAgregarEmpleado);
		
		
		btnCambiarContraseña = new JButton();
		btnCambiarContraseña.setBounds(400,  170 , 186, 49);
		btnCambiarContraseña.addActionListener(this);
		btnCambiarContraseña.setContentAreaFilled(false);
		ImageIcon imagenCambiarContraseña = new ImageIcon("./img/imgBtnCambiarContraseña.png");
		btnCambiarContraseña.setIcon(new ImageIcon(imagenCambiarContraseña.getImage().getScaledInstance(btnCambiarContraseña.getWidth(),
				btnCambiarContraseña.getHeight(), Image.SCALE_SMOOTH)));
		
		
		pnlPrincipal.add(btnCambiarContraseña);
		
		
	}

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnAgregarEmpleado) {
			
			VentanaRegistroUsuario vru = new VentanaRegistroUsuario();
			this.setVisible(false);
			vru.setVisible(true);
			
		}else if(e.getSource()==btnCerrarSesion) {
			
			VentanaInicio vi = new VentanaInicio();
			this.dispose();
			vi.setVisible(true);
			
			
		}else if(e.getSource()==btnCambiarContraseña) {
			
			VentanaEstablecerContraseña vec = new VentanaEstablecerContraseña();
			this.setVisible(false);
			vec.setVisible(true);

			
		}
		
	}
	
}
