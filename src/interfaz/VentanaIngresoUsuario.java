package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VentanaIngresoUsuario extends JFrame implements ActionListener{
	private String cineSeleccionado;
	private String peliculaSeleccionada;
	//VentanaPelicula v4 = new VentanaPelicula(peliculaSeleccionada);

	
	private JPanel pnlPrincipal;
	private JPasswordField pwdContraseña;
	private JTextField txtCorreo;
	private JButton btnIngreso;
	private JButton btnSalir;

	public VentanaIngresoUsuario(String cineSeleccionado, String peliculaSeleccionada) {

		this.cineSeleccionado = cineSeleccionado;
		this.peliculaSeleccionada = peliculaSeleccionada;

		setSize(700, 700);
		setTitle("Ingreso Cliente");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		iniciarComponentes();

	}
	
	private void iniciarComponentes() {
		
		crearPanelPrincipal();
		crearPanelNombre();
		crearPanelContraseña();
		
		
		
	}
	
	private void crearPanelPrincipal() {
		
		pnlPrincipal = new JPanel();
		pnlPrincipal.setBackground(Color.GRAY);
		pnlPrincipal.setLayout(null);
		this.getContentPane().add(pnlPrincipal);
		
		
		btnIngreso = new JButton();
		btnIngreso.setBounds(280, 550, 134, 54);
		btnIngreso.addActionListener(this);
		btnIngreso.setContentAreaFilled(false);
		ImageIcon imagenIngreso = new ImageIcon("./img/imgBtnIngreso.png");
		btnIngreso.setIcon(new ImageIcon(imagenIngreso.getImage().getScaledInstance(btnIngreso.getWidth(),
				btnIngreso.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnIngreso);
		
		
		btnSalir = new JButton();
		btnSalir.setBounds(20, 20, 60, 60);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorder(BorderFactory.createLineBorder(Color.GREEN, 0, true));
		btnSalir.addActionListener(this);
		ImageIcon imagenSalir = new ImageIcon("./img/exitArrow.png");

		btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
				btnSalir.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnSalir);


		
	}
	
	private void crearPanelNombre() {

		JPanel pnlNombre = new JPanel();
		// pnlNombre.setBackground(Color.DARK_GRAY);
		pnlNombre.setLayout(null);
		pnlNombre.setBounds(150, 190, 400, 130); // Estaba en (50, 350, 600,130)
		pnlNombre.setOpaque(false);
		pnlNombre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		JLabel lblCorreo = new JLabel();
		lblCorreo.setBounds(105, 20, 180, 30);
		lblCorreo.setText("Correo Electrónico");
		lblCorreo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlNombre.add(lblCorreo);

		txtCorreo = new JTextField();
		txtCorreo.setBounds(100, 75, 200, 30);
		txtCorreo.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		

		pnlNombre.add(txtCorreo);

		pnlPrincipal.add(pnlNombre);

	}

	private void crearPanelContraseña() {

		JPanel pnlContraseña = new JPanel();
		// pnlContraseña.setBackground(Color.GRAY);
		pnlContraseña.setLayout(null);
		pnlContraseña.setBounds(150, 350, 400, 130);
		pnlContraseña.setOpaque(false);
		pnlContraseña.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		JLabel lblContraseña = new JLabel();
		lblContraseña.setBounds(140, 20, 150, 30);
		lblContraseña.setText("Contraseña");
		lblContraseña.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlContraseña.add(lblContraseña);

		pwdContraseña = new JPasswordField();
		pwdContraseña.setBounds(100, 75, 200, 30);
		pwdContraseña.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		pnlContraseña.add(pwdContraseña);
		
		

		pnlPrincipal.add(pnlContraseña);

	}


	
	public boolean esCorreo(String Correo) {
		Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher comparar=patron.matcher(Correo);
        return comparar.find();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnIngreso) {
			
			if(esCorreo(txtCorreo.getText())) {
				
				System.out.println(cineSeleccionado);
				
				System.out.println("\nValidando información de Correo....");
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Correo electrónico no valido", "Correo invalido", JOptionPane.ERROR_MESSAGE);
				txtCorreo.setText("");
				pwdContraseña.setText("");
				
			}
			
			
		}
		else if(e.getSource()==btnSalir) {
			
			this.dispose();
			System.out.println("Ha regresado a la ventana de Pelicula: "+peliculaSeleccionada);

			VentanaPelicula miVentanaPelicula= new VentanaPelicula(peliculaSeleccionada);
			miVentanaPelicula.setVisible(true);
//			
			
			
		}
		
	}
	

}
