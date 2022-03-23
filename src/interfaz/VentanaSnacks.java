package interfaz;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class VentanaSnacks extends JFrame implements ActionListener, KeyListener{

	
	private JPanel pnlPrincipal;
	private JButton btnSalir;
	private JPanel pnlCombos;
	private JPanel pnlSnacks;
	
	private JSpinner spnCombo1;
	private JToggleButton tbtnImgCombo1;
	
	private JSpinner spnCombo2;
	private JToggleButton tbtnImgCombo2;
	
	private JSpinner spnCombo3;
	private JToggleButton tbtnImgCombo3;
	
	private JSpinner spnCombo4;
	private JToggleButton tbtnImgCombo4;
	
	private JButton btnContinuar;
	
	private String Pelicula;
	private String Cine;
	
	
	public VentanaSnacks() {

		setSize(700, 700);
		setTitle("Snacks");
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
		crearPanelSnacks();
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
		
		
		
		JLabel lblSnacksDisponibles = new JLabel();
		lblSnacksDisponibles.setBounds(270, 40, 250, 30);
		lblSnacksDisponibles.setText("SNACKS DISPONIBLES");
		lblSnacksDisponibles.setFont(new Font("Comic Sans MS", 3, 16));

		pnlPrincipal.add(lblSnacksDisponibles);
		
		btnContinuar = new JButton();
		btnContinuar.setBounds(280, 580, 134, 54);
		btnContinuar.addActionListener(this);
		btnContinuar.setContentAreaFilled(false);
		ImageIcon imagenIngreso = new ImageIcon("./img/imgBtnContinue.png");
		btnContinuar.setIcon(new ImageIcon(imagenIngreso.getImage().getScaledInstance(btnContinuar.getWidth(),
				btnContinuar.getHeight(), Image.SCALE_SMOOTH)));
		
		pnlPrincipal.add(btnContinuar);

	}
	
	
	
	private void crearPanelSnacks() {
		
		pnlSnacks = new JPanel();
		pnlSnacks.setBackground(Color.LIGHT_GRAY);
		pnlSnacks.setBounds(50, 90, 600, 470);
		pnlSnacks.setLayout(null);
		pnlSnacks.setOpaque(false);
		pnlSnacks.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));

		 //Se crea el label que dice "Peliculas en cartelera"
		

		pnlCombos = new JPanel();
//
		pnlCombos.setBounds(10, 30, 580, 420);
		pnlCombos.setPreferredSize(new Dimension (370, 1050));
		pnlCombos.setLayout(null);
		pnlCombos.setBackground(Color.GRAY);
		//pnlPeliculas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0, true));
		pnlSnacks.add(pnlCombos);

		JScrollPane Scroll = new JScrollPane(pnlCombos);

		// Es importante que tenga el mismo posicionamiento
		Scroll.setBounds(5, 30, 585, 420);
		Scroll.setViewportView(pnlCombos);
		pnlSnacks.add(Scroll);
		pnlPrincipal.add(pnlSnacks);
	
		JLabel lblCombo1 = new JLabel();
		lblCombo1.setText("Combo N°1");
		lblCombo1.setFont(new Font("Comic Sans MS", 1, 20));
		lblCombo1.setBounds(30, 20, 151, 30);
		pnlCombos.add(lblCombo1);
		
		
		tbtnImgCombo1 = new JToggleButton();
		tbtnImgCombo1.setBounds(30, 50, 151, 150);
		tbtnImgCombo1.addActionListener(this);
		ImageIcon imagenCombo1 = new ImageIcon("./img/combos/imgCombo1bn.png");
		tbtnImgCombo1.setIcon(new ImageIcon(imagenCombo1.getImage().getScaledInstance(tbtnImgCombo1.getWidth(),
				tbtnImgCombo1.getHeight(), Image.SCALE_SMOOTH)));

		pnlCombos.add(tbtnImgCombo1);
		
		SpinnerModel sm = new SpinnerNumberModel(1, 1, 9, 1);
		spnCombo1 = new JSpinner(sm);
		spnCombo1.setBounds(200, 160, 60, 40);
		spnCombo1.addKeyListener(this);
		spnCombo1.setFont((new Font("Comic Sans MS", 0, 18)));
		spnCombo1.setEditor(new JSpinner.DefaultEditor(spnCombo1));
		spnCombo1.setEnabled(false);
		
		pnlCombos.add(spnCombo1);
		
		JLabel DescCombo1 = new JLabel();
		DescCombo1.setFont((new Font("Comic Sans MS", 0, 16)));
		DescCombo1.setText("<html><body>1 Crispeta de sal 120 g + 2 perros calientes <br>+ 2 Gaseosas 640 ml + 1 Kit Kat 41 g + 1 chocolatina Jet 30 g");
		DescCombo1.setOpaque(false);
		DescCombo1.setBounds(200, 50, 350, 50);
		pnlCombos.add(DescCombo1);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////777
		
		JLabel lblCombo2 = new JLabel();
		lblCombo2.setText("Combo N°2");
		lblCombo2.setFont(new Font("Comic Sans MS", 1, 20));
		lblCombo2.setBounds(30, 220, 151, 30);
		pnlCombos.add(lblCombo2);
		
		
		tbtnImgCombo2 = new JToggleButton();
		tbtnImgCombo2.setBounds(30, 250, 151, 150);
		tbtnImgCombo2.addActionListener(this);
		ImageIcon imagenCombo2 = new ImageIcon("./img/combos/imgCombo2bn.png");
		tbtnImgCombo2.setIcon(new ImageIcon(imagenCombo2.getImage().getScaledInstance(tbtnImgCombo2.getWidth(),
				tbtnImgCombo2.getHeight(), Image.SCALE_SMOOTH)));

		pnlCombos.add(tbtnImgCombo2);
		
		SpinnerModel sm1 = new SpinnerNumberModel(1, 1, 9, 1);
		spnCombo2 = new JSpinner(sm1);
		spnCombo2.setBounds(200, 360, 60, 40);
		spnCombo2.setFont((new Font("Comic Sans MS", 0, 18)));
		spnCombo2.addKeyListener(this);
		spnCombo2.setEditor(new JSpinner.DefaultEditor(spnCombo2));
		spnCombo2.setEnabled(false);
		

		
		pnlCombos.add(spnCombo2);
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JLabel lblCombo3 = new JLabel();
		lblCombo3.setText("Combo N°3");
		lblCombo3.setFont(new Font("Comic Sans MS", 1, 20));
		lblCombo3.setBounds(30, 420, 151, 30);
		pnlCombos.add(lblCombo3);
		
		tbtnImgCombo3 = new JToggleButton();
		tbtnImgCombo3.setBounds(30, 450, 151, 150);
		tbtnImgCombo3.addActionListener(this);
		ImageIcon imagenCombo3 = new ImageIcon("./img/combos/imgCombo3bn.png");
		tbtnImgCombo3.setIcon(new ImageIcon(imagenCombo3.getImage().getScaledInstance(tbtnImgCombo3.getWidth(),
				tbtnImgCombo3.getHeight(), Image.SCALE_SMOOTH)));

		pnlCombos.add(tbtnImgCombo3);
		
		SpinnerModel sm3 = new SpinnerNumberModel(1, 1, 9, 1);
		spnCombo3 = new JSpinner(sm3);
		spnCombo3.setBounds(200, 560, 60, 40);
		spnCombo3.setFont((new Font("Comic Sans MS", 0, 18)));
		spnCombo3.addKeyListener(this);
		spnCombo3.setEditor(new JSpinner.DefaultEditor(spnCombo3));
		spnCombo3.setEnabled(false);
		

		
		pnlCombos.add(spnCombo3);
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JLabel lblCombo4 = new JLabel();
		lblCombo4.setText("Combo N°4");
		lblCombo4.setFont(new Font("Comic Sans MS", 1, 20));
		lblCombo4.setBounds(30, 620, 151, 30);
		pnlCombos.add(lblCombo4);
		
		tbtnImgCombo4 = new JToggleButton();
		tbtnImgCombo4.setBounds(30, 650, 151, 150);
		tbtnImgCombo4.addActionListener(this);
		ImageIcon imagenCombo4 = new ImageIcon("./img/combos/imgCombo4bn.png");
		tbtnImgCombo4.setIcon(new ImageIcon(imagenCombo4.getImage().getScaledInstance(tbtnImgCombo4.getWidth(),
				tbtnImgCombo4.getHeight(), Image.SCALE_SMOOTH)));

		pnlCombos.add(tbtnImgCombo4);
		
		SpinnerModel sm4 = new SpinnerNumberModel(1, 1, 9, 1);
		spnCombo4 = new JSpinner(sm4);
		spnCombo4.setBounds(200, 760, 60, 40);
		spnCombo4.setFont((new Font("Comic Sans MS", 0, 18)));
		spnCombo4.addKeyListener(this);
		spnCombo4.setEditor(new JSpinner.DefaultEditor(spnCombo4));
		spnCombo4.setEnabled(false);
		

		
		pnlCombos.add(spnCombo4);
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


		
	
		
	}
		
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tbtnImgCombo1) {
			
			if(tbtnImgCombo1.isSelected()){
				ImageIcon imagenCombo1 = new ImageIcon("./img/combos/imgCombo1.png");
				tbtnImgCombo1.setIcon(new ImageIcon(imagenCombo1.getImage().getScaledInstance(tbtnImgCombo1.getWidth(),
						tbtnImgCombo1.getHeight(), Image.SCALE_SMOOTH)));
				spnCombo1.setEnabled(true);
			}else {
				ImageIcon imagenCombo1 = new ImageIcon("./img/combos/imgCombo1bn.png");
				tbtnImgCombo1.setIcon(new ImageIcon(imagenCombo1.getImage().getScaledInstance(tbtnImgCombo1.getWidth(),
						tbtnImgCombo1.getHeight(), Image.SCALE_SMOOTH)));
				spnCombo1.setEnabled(false);
			}
			
		}
		else if(e.getSource()==tbtnImgCombo2){
			
			if(tbtnImgCombo2.isSelected()){
				
				ImageIcon imagenCombo2 = new ImageIcon("./img/combos/imgCombo2.png");
				tbtnImgCombo2.setIcon(new ImageIcon(imagenCombo2.getImage().getScaledInstance(tbtnImgCombo2.getWidth(),
						tbtnImgCombo2.getHeight(), Image.SCALE_SMOOTH)));
				spnCombo2.setEnabled(true);
			}else {
				ImageIcon imagenCombo2 = new ImageIcon("./img/combos/imgCombo2bn.png");
				tbtnImgCombo2.setIcon(new ImageIcon(imagenCombo2.getImage().getScaledInstance(tbtnImgCombo2.getWidth(),
						tbtnImgCombo2.getHeight(), Image.SCALE_SMOOTH)));
				spnCombo2.setEnabled(false);
			}
			
			
		}
		else if (e.getSource() == tbtnImgCombo3) {

			if (tbtnImgCombo3.isSelected()) {

				ImageIcon imagenCombo3 = new ImageIcon("./img/combos/imgCombo3.png");
				tbtnImgCombo3.setIcon(new ImageIcon(imagenCombo3.getImage().getScaledInstance(tbtnImgCombo3.getWidth(),
						tbtnImgCombo3.getHeight(), Image.SCALE_SMOOTH)));
				spnCombo3.setEnabled(true);
			} else {
				ImageIcon imagenCombo3 = new ImageIcon("./img/combos/imgCombo3bn.png");
				tbtnImgCombo3.setIcon(new ImageIcon(imagenCombo3.getImage().getScaledInstance(tbtnImgCombo3.getWidth(),
						tbtnImgCombo3.getHeight(), Image.SCALE_SMOOTH)));
				spnCombo3.setEnabled(false);
			}

		}
		else if (e.getSource() == tbtnImgCombo4) {

			if (tbtnImgCombo4.isSelected()) {

				ImageIcon imagenCombo4 = new ImageIcon("./img/combos/imgCombo4.png");
				tbtnImgCombo4.setIcon(new ImageIcon(imagenCombo4.getImage().getScaledInstance(tbtnImgCombo4.getWidth(),
						tbtnImgCombo4.getHeight(), Image.SCALE_SMOOTH)));
				spnCombo4.setEnabled(true);
			} else {
				ImageIcon imagenCombo4 = new ImageIcon("./img/combos/imgCombo4bn.png");
				tbtnImgCombo4.setIcon(new ImageIcon(imagenCombo4.getImage().getScaledInstance(tbtnImgCombo4.getWidth(),
						tbtnImgCombo4.getHeight(), Image.SCALE_SMOOTH)));
				spnCombo4.setEnabled(false);
			}

		}else if(e.getSource()==btnContinuar) {
			
			int ValorSpn1 = (Integer)spnCombo1.getValue();
			int ValorSpn2 = (Integer)spnCombo2.getValue();
			int ValorSpn3 = (Integer)spnCombo3.getValue();
			int ValorSpn4 = (Integer)spnCombo4.getValue();
			
			if (ValorSpn1 != 0 && spnCombo1.isEnabled()) {

				//en lugar de un SYstem out, se podria llamar a un método que realizara estas "Cotizaciones"
				System.out.println(
						"→ " + ValorSpn1 + " Combos N°1.......................................$" + ValorSpn1 * 3500);

			}
			if (ValorSpn2 != 0 && spnCombo2.isEnabled()) {

				System.out.println(
						"→ " + ValorSpn2 + " Combos N°2.......................................$" + ValorSpn2 * 2500);

			}
			if (ValorSpn3 != 0 && spnCombo3.isEnabled()) {

				System.out.println(
						"→ " + ValorSpn3 + " Combos N°1.......................................$" + ValorSpn3 * 500);

			}
			if (ValorSpn4 != 0 && spnCombo4.isEnabled()) {

				System.out.println(
						"→ " + ValorSpn4 + " Combos N°1.......................................$" + ValorSpn4 * 1500);

			}
			
			
	
		}else if(e.getSource()==btnSalir) {
			
			VentanaCompraSilla vcs = new VentanaCompraSilla(Pelicula, Cine);
			this.setVisible(false);
			vcs.setVisible(true);
			
		}
		
	}



	@Override
	public void keyTyped(KeyEvent evt) {
		if (evt.getSource() == spnCombo1) {

			char c = evt.getKeyChar();

			if (c < '0' || c > '9')
				evt.consume();

		}
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void enviarDatos(String Pelicula, String Cine) {
		
		this.Pelicula = Pelicula;
		this.Cine = Cine;
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}