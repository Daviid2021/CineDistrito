package interfaz;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VentanaInicio extends JFrame implements ActionListener {

	private JPanel pnlPrincipal;
	private JPanel pnlUsuario;
	private JComboBox<String> cmbUsuario;
	private JTextField txtNombre;
	private JPasswordField pwdContraseña;
	private JButton btnSalir;
	private JButton btnIngreso;

	public VentanaInicio() {

		setSize(700, 700);
		setTitle("Ingreso Multiplex");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		iniciarComponentes();

	}

	private void iniciarComponentes() {

		crearPaneles();

	}

	private void crearPaneles() {
		crearPanelPrincipal();
	}

	private void crearPanelPrincipal() {

		pnlPrincipal = new JPanel();
		pnlPrincipal.setBackground(Color.GRAY);
		pnlPrincipal.setLayout(null);
		this.getContentPane().add(pnlPrincipal);
		// crearPanelUsuario();
		crearPanelNombre();
		crearPanelContraseña();

		JLabel lblImgUsuario = new JLabel();
		lblImgUsuario.setBounds(270, 20, 150, 150);
		ImageIcon imagenUsuario = new ImageIcon("./img/imgUser.png");

		lblImgUsuario.setIcon(new ImageIcon(imagenUsuario.getImage().getScaledInstance(lblImgUsuario.getWidth(),
				lblImgUsuario.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(lblImgUsuario);

		btnIngreso = new JButton();
		btnIngreso.setBounds(240, 550, 220, 50);
		btnIngreso.setText("Ingresar");
		btnIngreso.addActionListener(this);
		btnIngreso.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlPrincipal.add(btnIngreso);

		btnSalir = new JButton();
		btnSalir.setBounds(20, 20, 60, 60);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorder(BorderFactory.createLineBorder(Color.GREEN, 0, true));
		btnSalir.addActionListener(this);
		ImageIcon imagenSalir = new ImageIcon("./img/Exit.png");

		btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
				btnSalir.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnSalir);

	}

	public void crearPanelUsuario() {

		pnlUsuario = new JPanel();
		// pnlUsuario.setBackground(Color.LIGHT_GRAY);
		pnlUsuario.setBounds(50, 190, 600, 130);
		pnlUsuario.setLayout(null);
		pnlUsuario.setOpaque(false);
		pnlUsuario.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));

		JLabel lblUsuario = new JLabel();
		lblUsuario.setText("Usuario");
		lblUsuario.setBounds(250, 30, 80, 30);
		lblUsuario.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		pnlUsuario.add(lblUsuario);

		String[] Cines = { "Seleccione", "Titan Plaza", "Unicentro", "Plaza Central", "Gran Estación", "Embajador",
				"Plaza Americas" };
		cmbUsuario = new JComboBox(Cines);
		// cmbUsuario.addItem("Multipelx");
		cmbUsuario.setSelectedItem("Seleccione");
		cmbUsuario.setBounds(200, 90, 200, 30);
		cmbUsuario.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		cmbUsuario.addActionListener(this);

		pnlUsuario.add(cmbUsuario);

		pnlPrincipal.add(pnlUsuario);

	}

	private void crearPanelNombre() {

		JPanel pnlNombre = new JPanel();
		// pnlNombre.setBackground(Color.DARK_GRAY);
		pnlNombre.setLayout(null);
		pnlNombre.setBounds(50, 190, 600, 130); // Estaba en (50, 350, 600,130)
		pnlNombre.setOpaque(false);
		pnlNombre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		JLabel lblNombre = new JLabel();
		lblNombre.setBounds(250, 20, 80, 30);
		lblNombre.setText("Nombre");
		lblNombre.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlNombre.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(200, 75, 200, 30);
		txtNombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		pnlNombre.add(txtNombre);

		pnlPrincipal.add(pnlNombre);

	}

	private void crearPanelContraseña() {

		JPanel pnlContraseña = new JPanel();
		// pnlContraseña.setBackground(Color.GRAY);
		pnlContraseña.setLayout(null);
		pnlContraseña.setBounds(50, 350, 600, 130);
		pnlContraseña.setOpaque(false);
		pnlContraseña.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

		JLabel lblContraseña = new JLabel();
		lblContraseña.setBounds(250, 20, 150, 30);
		lblContraseña.setText("Contraseña");
		lblContraseña.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

		pnlContraseña.add(lblContraseña);

		pwdContraseña = new JPasswordField();
		pwdContraseña.setBounds(200, 75, 200, 30);
		pwdContraseña.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		pnlContraseña.add(pwdContraseña);

		pnlPrincipal.add(pnlContraseña);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnSalir) {
			this.dispose();
			System.out.println("\n\nHa salido del sistema!!!");
		}

		else if (e.getSource() == btnIngreso) {

			String myPass = String.valueOf(pwdContraseña.getPassword());
			;

			if (txtNombre.getText().isEmpty() || myPass.isEmpty()) {

				JOptionPane.showMessageDialog(pnlPrincipal, "Porfavor, rellene todos los campos");

			} else {

				System.out.println("Ingresó: " + "\n" + txtNombre.getText() + "\n" + myPass);

				VentanaCartelera v2 = new VentanaCartelera();
				v2.setVisible(true);
				
				this.dispose();
			}

		}
	}

}
