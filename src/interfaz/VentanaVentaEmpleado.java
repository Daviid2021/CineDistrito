package interfaz;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaVentaEmpleado extends JFrame {

	private JPanel pnlPrincipal;

	public VentanaVentaEmpleado() {

		setSize(700, 800);
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
		pnlPrincipal.setBackground(Color.RED);
		pnlPrincipal.setLayout(null);
		this.getContentPane().add(pnlPrincipal);

	}

}
