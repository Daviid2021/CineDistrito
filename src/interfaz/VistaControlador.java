package interfaz;

import javax.swing.JFrame;

import facade.ControladorEvento;
import facade.Fachada;
import interfaz.VentanaPeliculas.VentanaPelicula;
import interfaz.VentanaPeliculas.VentanaPeliculaEncanto;
import interfaz.VentanaPeliculas.VentanaPeliculaMoonfall;
import interfaz.VentanaPeliculas.VentanaPeliculaPaseo6;
import interfaz.VentanaPeliculas.VentanaPeliculaScream;
import interfaz.VentanaPeliculas.VentanaPeliculaSpiderman;

public class VistaControlador extends JFrame{
	
	private Fachada fachada;
	private ControladorEvento control;
	
	private VentanaAdmin va;
	private VentanaCambiarContraseña vcc;
	private VentanaCartelera vc;
	private VentanaCompraSilla vcs;
	private VentanaEstablecerContraseña vec;
	private VentanaIngresoCliente vic;
	private VentanaInicio vi;
	private VentanaPelicula vp;
	private VentanaRegistroCliente vrc;
	private VentanaRegistroUsuario vru;
	private VentanaSnacks vs;
	private VentanaPeliculaEncanto vpEncanto;
	private VentanaPeliculaMoonfall vpMoonfall;
	private VentanaPeliculaPaseo6 vpPaseo;
	private VentanaPeliculaScream vpScream;
	private VentanaPeliculaSpiderman vpSpiderman;
	
	
	
	

	public VistaControlador(Fachada fachada) {
		
		this.fachada = fachada;
		iniciarComponentes();
		capturarEventos();
		
		
	}
	
	private void iniciarComponentes() {
		
		this.setTitle("Cine Distrito");
		this.setSize(700, 700);
		//this.setIconImage(Toolkit.getDefaultToolkit().getImage(VistaControlador.class.getResource("/Imagen/Icono.png")));
		this.getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
//		VentanaAdmin va = new VentanaAdmin();
//		this.add(va);
		
//		VentanaCambiarContraseña vcc = new VentanaCambiarContraseña();
//		this.add(vcc);
//		
		vc = new VentanaCartelera();
		this.add(vc);
//		
//		VentanaCompraSilla vcs = new VentanaCompraSilla();
//		this.add(vcs);
//		
//		VentanaEstablecerContraseña vec = new VentanaEstablecerContraseña();
//		this.add(vec);
//		
		vic = new VentanaIngresoCliente();
		this.add(vic);
//		
		vi = new VentanaInicio();
		this.add(vi);
//		
//		vp = new VentanaPelicula();
//		this.add(vp);
		
		vpEncanto = new VentanaPeliculaEncanto();
		this.add(vpEncanto);
		
		vpMoonfall = new VentanaPeliculaMoonfall();
		this.add(vpMoonfall);
		
		vpPaseo = new VentanaPeliculaPaseo6();
		this.add(vpPaseo);
		
		vpScream = new VentanaPeliculaScream();
		this.add(vpScream);
		
		vpSpiderman = new VentanaPeliculaSpiderman();
		this.add(vpSpiderman);
//		
//		VentanaRegistroCliente vrc = new VentanaRegistroCliente();
//		this.add(vrc);
//		
//		VentanaRegistroUsuario vru = new VentanaRegistroUsuario();
//		this.add(vru);
//		
//		VentanaSnacks vs = new VentanaSnacks();
//		this.add(vs);
		
		
		
		vi.setVisible(true);
		
//		vcc.setVisible(false);
//		va.setVisible(false);
		vc.setVisible(false);
//		vcs.setVisible(false);
//		vec.setVisible(false);
		vic.setVisible(false);
		vpEncanto.setVisible(false);
		vpMoonfall.setVisible(false);
		vpPaseo.setVisible(false);
		vpScream.setVisible(false);
		vpSpiderman.setVisible(false);
		
//		vrc.setVisible(false);
//		vru.setVisible(false);
//		vs.setVisible(false);
		
	}
	
	//Método por el cual se da el control de los eventos de los componentes interactivos de la interfaz
	public ControladorEvento getControl() {
		if (control == null) {
			control = new ControladorEvento(this);
			}

		return control;
		
	}
	
	
	private void capturarEventos() {
		
		vi.getBtnSalir().addActionListener(getControl());
		vi.getBtnIngreso().addActionListener(getControl());
		
		vc.getBtnSalir().addActionListener(getControl());
		vc.getBtnPeliculaEncanto().addActionListener(getControl());
		vc.getBtnPeliculaMoonfall().addActionListener(getControl());
		vc.getBtnPeliculaPaseo6().addActionListener(getControl());
		vc.getBtnPeliculaScream().addActionListener(getControl());
		vc.getBtnPeliculaSpiderman().addActionListener(getControl());
		
		vpEncanto.getBtnContinue().addActionListener(getControl());
		vpEncanto.getBtnSalir().addActionListener(getControl());
		vpEncanto.getCmbCinesDisponibles().addActionListener(getControl());
		
		vpMoonfall.getBtnContinue().addActionListener(getControl());
		vpMoonfall.getBtnSalir().addActionListener(getControl());
		vpMoonfall.getCmbCinesDisponibles().addActionListener(getControl());
		
		vpPaseo.getBtnContinue().addActionListener(getControl());
		vpPaseo.getBtnSalir().addActionListener(getControl());
		vpPaseo.getCmbCinesDisponibles().addActionListener(getControl());
		
		vpScream.getBtnContinue().addActionListener(getControl());
		vpScream.getBtnSalir().addActionListener(getControl());
		vpScream.getCmbCinesDisponibles().addActionListener(getControl());
		
		vpSpiderman.getBtnContinue().addActionListener(getControl());
		vpSpiderman.getBtnSalir().addActionListener(getControl());
		vpSpiderman.getCmbCinesDisponibles().addActionListener(getControl());
		
		vic.getBtnSalir().addActionListener(getControl());
		
		
		
		
		
		
		
	}
	
	public VentanaInicio getVentanaInicio() {
		return vi;
	}
	
	public VentanaCartelera getVentanaCartelera() {
		return vc;
	}
	
//	public VentanaPelicula getVentanaPelicula() {
//		return vp;
//	}
	
	public VentanaPeliculaEncanto getVentanaPeliculaEncanto() {
		return vpEncanto;
	}
	
	public VentanaPeliculaMoonfall getVentanaPeliculaMoonfall() {
		return vpMoonfall;
	}
	
	public VentanaPeliculaPaseo6 getVentanaPeliculaPaseo6() {
		return vpPaseo;
	}
	
	public VentanaPeliculaScream getVentanaPeliculaScream() {
		return vpScream;
	}
	
	public VentanaPeliculaSpiderman getVentanaPeliculaSpiderman() {
		return vpSpiderman;
	}
	
	public VentanaIngresoCliente getVentanaIngresoCliente() {
		return vic;
	}
	
	public Fachada getFachada () {
		return fachada;
	}


	
	
	
	
	
	
	
	
}
