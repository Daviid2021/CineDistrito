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
		lblTitulo.setBounds(400, 100, 210, 50);
		lblTitulo.setFont(new Font("Comic Sans MS", 3, 50));
		
		JTextArea txaDescripcion = new JTextArea();
		txaDescripcion.setBounds(340, 180, 340, 200);
		txaDescripcion.setEditable(false);
		txaDescripcion.setOpaque(false);
		txaDescripcion.setLineWrap(true);
		txaDescripcion.setFont(new Font("Comic Sans MS", 0, 15));
		
		JLabel lblLimiteEdad = new JLabel();
		lblLimiteEdad.setBounds(80, 520, 60, 90);
		
		JLabel lblGeneros = new JLabel();
		lblGeneros.setBounds(170, 540, 140, 65);
		lblGeneros.setFont(new Font("Andale Mono", 2, 18));
		lblGeneros.setForeground(Color.BLACK);
		
		
		
		switch (nombrePelicula){
		
		case "Encanto": 
			
			ImageIcon imagenEncanto = new ImageIcon("./img/Encanto.jpg");
			imgPelicula.setIcon(new ImageIcon(imagenEncanto.getImage().getScaledInstance(imgPelicula.getWidth(),
			imgPelicula.getHeight(), Image.SCALE_SMOOTH)));
			
			
			lblTitulo.setText("Encanto");
			txaDescripcion.setText("cuenta la historia de los Madrigal, una familia ex-traordinaria que vive escondida "
					+ "en las montañas de Colombia, en una casa mágica, en un pueblo vi- brante, en un lugar maravilloso "
					+ "conocido como un Encanto.");
			
			
			ImageIcon imgEdadEncanto = new ImageIcon("./img/imgEdadTodos.png");
			lblLimiteEdad.setIcon(new ImageIcon(imgEdadEncanto.getImage().getScaledInstance(lblLimiteEdad.getWidth(),
			lblLimiteEdad.getHeight(), Image.SCALE_SMOOTH)));
			
			lblGeneros.setText("<html>• Animación <br>• Aventura <br>• Comedia</html>");
			
			
			
			
			break;
			
		case "Moonfall":
			ImageIcon imagenMoonfall = new ImageIcon("./img/Moonfall.jpg");
			imgPelicula.setIcon(new ImageIcon(imagenMoonfall.getImage().getScaledInstance(imgPelicula.getWidth(),
			imgPelicula.getHeight(), Image.SCALE_SMOOTH)));
			
			lblTitulo.setText("Moonfall");
			lblTitulo.setFont(new Font("Comic Sans MS", 3, 49));
			txaDescripcion.setText("una fuerza misteriosa saca a la Luna de su órbitaalrededor de la "
					+ "Tierra y la envía a toda \nvelocidad en un curso de colisión con la vida tal   como la conocemos.");
			
			ImageIcon imgEdadMoonfall = new ImageIcon("./img/imgEdad10.png");
			lblLimiteEdad.setIcon(new ImageIcon(imgEdadMoonfall.getImage().getScaledInstance(lblLimiteEdad.getWidth(),
			lblLimiteEdad.getHeight(), Image.SCALE_SMOOTH)));
			
			break;
			
		case "Paseo6":
			
			ImageIcon imagenPaseo6 = new ImageIcon("./img/Paseo6.jpg");
			imgPelicula.setIcon(new ImageIcon(imagenPaseo6.getImage().getScaledInstance(imgPelicula.getWidth(),
			imgPelicula.getHeight(), Image.SCALE_SMOOTH)));
			
			lblTitulo.setText("Paseo 6");
			lblTitulo.setFont(new Font("Comic Sans MS", 3, 49));
			txaDescripcion.setText("La Excursión de 11 es el paseo donde todo puede pasar, pero excursión de 11 "
					+ "con los papás, eso sí es el colmo. Y como Álvaro Castaño sabe que es mejor la seguridad "
					+ "que la policía, decide viajar con su familia para vigilar a su hija Sarita, sin embargo, "
					+ "su suegra, Raquel, no está dispuesta a permitirlo y también se embarca en el plan.");
			
			ImageIcon imgEdadPaseo6 = new ImageIcon("./img/imgEdadTeen.png");
			lblLimiteEdad.setIcon(new ImageIcon(imgEdadPaseo6.getImage().getScaledInstance(lblLimiteEdad.getWidth(),
			lblLimiteEdad.getHeight(), Image.SCALE_SMOOTH)));
			
			
			
			break;
			
		
		case "Scream":
			
			ImageIcon imagenScream = new ImageIcon("./img/Scream.jpg");
			imgPelicula.setIcon(new ImageIcon(imagenScream.getImage().getScaledInstance(imgPelicula.getWidth(),
			imgPelicula.getHeight(), Image.SCALE_SMOOTH)));
			
			lblTitulo.setText("Scream");
			lblTitulo.setFont(new Font("Comic Sans MS", 3, 49));
			txaDescripcion.setText("Una nueva entrega de la franquicia de terror 'Scream' seguirá a "
					+ "una mujer que regresa a su ciudad natal para tratar de averiguar quién ha estado "
					+ "cometiendo una serie de crímenes viciosos.");
			
			ImageIcon imgEdadScream = new ImageIcon("./img/imgEdad17.png");
			lblLimiteEdad.setIcon(new ImageIcon(imgEdadScream.getImage().getScaledInstance(lblLimiteEdad.getWidth(),
			lblLimiteEdad.getHeight(), Image.SCALE_SMOOTH)));
			
			
			
			break;
			
		case "Spiderman":
			
			ImageIcon imagenSpiderman = new ImageIcon("./img/Spiderman.jpg");
			imgPelicula.setIcon(new ImageIcon(imagenSpiderman.getImage().getScaledInstance(imgPelicula.getWidth(),
			imgPelicula.getHeight(), Image.SCALE_SMOOTH)));
			
			lblTitulo.setText("Spiderman");
			lblTitulo.setBounds(380, 100, 250, 70);
			lblTitulo.setFont(new Font("Comic Sans MS", 3, 45));
			txaDescripcion.setText("Por primera vez en la historia cinematográfica de Spider- Man, "
					+ "nuestro amistoso héroe y vecino es desenmascarado, y ya no puede separar su vida "
					+ "normal de los altos riesgos de ser un súper héroe. ");
			
			
			ImageIcon imgEdadSpiderman = new ImageIcon("./img/imgEdad10.png");
			lblLimiteEdad.setIcon(new ImageIcon(imgEdadSpiderman.getImage().getScaledInstance(lblLimiteEdad.getWidth(),
			lblLimiteEdad.getHeight(), Image.SCALE_SMOOTH)));
			
			
			
			break;
			
		
		
		}
	
		pnlPrincipal.add(lblGeneros);
		pnlPrincipal.add(lblTitulo);
		pnlPrincipal.add(imgPelicula);
		pnlPrincipal.add(lblLimiteEdad);
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
