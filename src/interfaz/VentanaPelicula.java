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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class VentanaPelicula extends JFrame implements ActionListener{

	JPanel pnlPrincipal;
	String nombrePelicula;
	JButton btnSalir;
	JLabel imgPelicula;
	
	public VentanaPelicula(String nombrePelicula) {
		
		this.nombrePelicula = nombrePelicula;
		setSize(700, 700);
		setTitle("Cartelera");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		iniciarComponentes();
		
	}
	
	
	
	private void iniciarComponentes() {
		crearPanelPrincipal();
		crearPanelPelicula();
		
	}
	
	private void crearPanelPrincipal() {
		
		pnlPrincipal = new JPanel();
		pnlPrincipal.setBackground(Color.GRAY);
		pnlPrincipal.setLayout(null);
		this.getContentPane().add(pnlPrincipal);
		
		btnSalir = new JButton();
		btnSalir.setBounds(20, 20, 60, 40);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		btnSalir.addActionListener(this);
		ImageIcon imagenSalir = new ImageIcon("./img/exitArrow.png");

		btnSalir.setIcon(new ImageIcon(imagenSalir.getImage().getScaledInstance(btnSalir.getWidth(),
				btnSalir.getHeight(), Image.SCALE_SMOOTH)));

		pnlPrincipal.add(btnSalir);
		
		
		
		

		
		
	}
	
	private void crearPanelPelicula() {
		
		imgPelicula = new JLabel();
		imgPelicula.setBounds(70, 100, 260, 410);
		imgPelicula.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4, true));
		
		JLabel lblTitulo = new JLabel();
		lblTitulo.setBounds(400, 100, 200, 50);
		lblTitulo.setFont(new Font("Comic Sans MS", 3, 50));
		
		JTextArea txaDescripcion = new JTextArea();
		txaDescripcion.setBounds(340, 180, 340, 200);
		txaDescripcion.setEditable(false);
		txaDescripcion.setOpaque(false);
		txaDescripcion.setLineWrap(true);
		txaDescripcion.setFont(new Font("Comic Sans MS", 0, 15));
		
		
		
		switch (nombrePelicula){
		
		case "Encanto": 
			
			ImageIcon imagenEncanto = new ImageIcon("./img/Encanto.jpg");
			imgPelicula.setIcon(new ImageIcon(imagenEncanto.getImage().getScaledInstance(imgPelicula.getWidth(),
			imgPelicula.getHeight(), Image.SCALE_SMOOTH)));
			
			lblTitulo.setText("Encanto");
			txaDescripcion.setText("cuenta la historia de los Madrigal, una familia ex-traordinaria que vive escondida "
					+ "en las montañas de Colombia, en una casa mágica, en un pueblo vi- brante, en un lugar maravilloso "
					+ "conocido como un Encanto.");
			
			
			break;
		
		}
		
		pnlPrincipal.add(lblTitulo);
		pnlPrincipal.add(imgPelicula);
		pnlPrincipal.add(txaDescripcion);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSalir) {
			this.dispose();
			System.out.println("Ha regresado a la ventana de Cartelera");

			VentanaCartelera v2 = new VentanaCartelera();
			v2.setVisible(true);
			
			this.dispose();
		}
		
	}
	

	
	
	
	
}
