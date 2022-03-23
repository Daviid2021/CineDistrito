
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
	import javax.swing.JTextField;

import lógica.Verificar;

	public class VentanaEstablecerContraseña extends JFrame implements ActionListener{

		private JPanel pnlPrincipal;
		private JTextField txtContraseña;
		private JTextField txtCodigo;
		private JButton btnIngreso;
		private JButton btnSalir;
		private String Cine;
		private String Pelicula;
		private JLabel lblContraseña;
		private JLabel lblCodigo;
		
		
		public VentanaEstablecerContraseña() {
			
			setSize(700, 700);
			setTitle("Establecer Contraseña");
			setLocationRelativeTo(null);
			setResizable(false);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			iniciarComponentes();

			
			
		}
		
		
		

		private void iniciarComponentes() {
			
			crearPanelPrincipal();
			crearPanelCodigo();
			crearPanelContraseña();
			
		}
		
		private void crearPanelPrincipal() {
			
			pnlPrincipal = new JPanel();
			pnlPrincipal.setBackground(Color.GRAY);
			pnlPrincipal.setLayout(null);
			this.getContentPane().add(pnlPrincipal);
			
			
			btnIngreso = new JButton();
			btnIngreso.setBounds(280, 520, 134, 54);
			btnIngreso.addActionListener(this);
			btnIngreso.setContentAreaFilled(false);
			ImageIcon imagenIngreso = new ImageIcon("./img/imgBtnIngreso.png");
			btnIngreso.setIcon(new ImageIcon(imagenIngreso.getImage().getScaledInstance(btnIngreso.getWidth(),
					btnIngreso.getHeight(), Image.SCALE_SMOOTH)));
			

			pnlPrincipal.add(btnIngreso);
			
			
			btnSalir = new JButton();
			btnSalir.setBounds(20, 20, 60, 40);
			btnSalir.setContentAreaFilled(false);
			btnSalir.setBorder(BorderFactory.createLineBorder(Color.GREEN, 0, true));
			btnSalir.addActionListener(this);
			ImageIcon imagenSalir = new ImageIcon("./img/exitArrow.png");

			btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
					btnSalir.getHeight(), Image.SCALE_SMOOTH)));

			pnlPrincipal.add(btnSalir);
			
			
			lblContraseña = new JLabel();
			lblContraseña.setText("Establecer Contraseña");
			lblContraseña.setBounds(130, 40, 500, 100);
			lblContraseña.setFont(new Font("Comic Sans MS", Font.BOLD, 44));
			
			pnlPrincipal.add(lblContraseña);
			
			
		}
		
		
		private void crearPanelCodigo() {

			JPanel pnlCodigo = new JPanel();
			// pnlNombre.setBackground(Color.DARK_GRAY);
			pnlCodigo.setLayout(null);
			pnlCodigo.setBounds(150, 190, 400, 130); // Estaba en (50, 350, 600,130)
			pnlCodigo.setOpaque(false);
			pnlCodigo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

			lblCodigo = new JLabel();
			lblCodigo.setBounds(120, 20, 280, 30);
			lblCodigo.setText("Código Empleado");
			lblCodigo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

			pnlCodigo.add(lblCodigo);

			
			
			txtCodigo = new JTextField();
			txtCodigo.setBounds(100, 75, 200, 30);
			txtCodigo.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
			
			
			
			

			pnlCodigo.add(txtCodigo);

			pnlPrincipal.add(pnlCodigo);

		}

		private void crearPanelContraseña() {

			JPanel pnlContraseña = new JPanel();
			// pnlContraseña.setBackground(Color.GRAY);
			pnlContraseña.setLayout(null);
			pnlContraseña.setBounds(150, 350, 400, 130);
			pnlContraseña.setOpaque(false);
			pnlContraseña.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, true));

			lblContraseña = new JLabel();
			lblContraseña.setBounds(110, 20, 200, 30);
			lblContraseña.setText("Nueva Contraseña");
			lblContraseña.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

			pnlContraseña.add(lblContraseña);

			txtContraseña = new JTextField();
			txtContraseña.setBounds(100, 75, 200, 30);
			txtContraseña.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

			pnlContraseña.add(txtContraseña);
			
			

			pnlPrincipal.add(pnlContraseña);

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==btnIngreso) {
				
				
				if(txtCodigo.getText().isEmpty() || txtContraseña.getText().isEmpty()) {
					
					JOptionPane.showMessageDialog(null, "Porfavor ingrese todos los campos");
					
					
				}else {
						System.out.println("Verificando en Base de datos...");
						Verificar.estaEnBaseDeDatos();
				}
				
				
						//deberia estar la comparacion de si existe en la base de Datos
//					}else {
//					
//						JOptionPane.showMessageDialog(null, "Formato inválido, ingrese los datos nuevamente", "Error de Formato", JOptionPane.WARNING_MESSAGE);
//						txtCodigo.setText("");
//						txtContraseña.setText("");
//					}
				
				
			
				

				
			}
			else if(e.getSource()==btnSalir) {
				
		
			
					
					VentanaAdmin va = new VentanaAdmin();
					this.setVisible(false);
					va.setVisible(true);
					
				
				
				
			}
			
		}

		


		
		
		
	
}
