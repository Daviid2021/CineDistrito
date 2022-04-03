package facade;

import javax.swing.JOptionPane;

import interfaz.VentanaCartelera;
import interfaz.VentanaIngresoCliente;
import interfaz.VentanaInicio;
import interfaz.VistaControlador;
import interfaz.VentanaPeliculas.VentanaPeliculaEncanto;
import interfaz.VentanaPeliculas.VentanaPeliculaMoonfall;
import interfaz.VentanaPeliculas.VentanaPeliculaPaseo6;
import interfaz.VentanaPeliculas.VentanaPeliculaScream;
import interfaz.VentanaPeliculas.VentanaPeliculaSpiderman;

public class Fachada {

	private VistaControlador interfaz;
	
	
	
	
	public Fachada() {
		
		interfaz = new VistaControlador(this);
		
		
		
	}
	
	public void iniciar() {
		
				
		interfaz.setVisible(true);
		
	}
	
	// // // // // // // // // // VENTANA INICIO // // // // // // // // // // 
	public void salir() {
		JOptionPane.showMessageDialog(null, "¡Hasta luego!");
		System.out.println("Sesión Finalizada con éxito...");
		System.exit(0);
	}
	
	//de ventana inicio a cartelera
	public void cambiarPanel(VentanaInicio vi, VentanaCartelera vc) {
		
		
		
		String myPass = String.valueOf(vi.getPwdContraseña().getPassword()); 
		String myName = String.valueOf(vi.getTxtNombre().getText());
				
//Debe hacer la comprobación si es admin, o no; y si esta en la basse de datos
		if (myName.isEmpty() || myPass.isEmpty()) {

			JOptionPane.showMessageDialog(null, "Porfavor, rellene todos los campos");
		
	}else {
		
		System.out.println("Usuario: "+myName);
		System.out.println("Contraseña: "+myPass);
		vi.setVisible(false);
		vc.setVisible(true);
	}
	
	
		
		
}
	// // // // // // // // // // VENTANA CARTELERA // // // // // // // // // //  
	public void cambiarPanel(VentanaCartelera vc, VentanaInicio vi) {
	
		System.out.println("Ha regresado a la ventana de inicio");
		vc.setVisible(false);
		vi.setVisible(true);
		
	}
	
	public void cambiarPeliculaEncanto(VentanaCartelera vc, VentanaPeliculaEncanto vpE) {

		System.out.println("Seleccionó: Encanto");
		vc.setVisible(false);
		vpE.setVisible(true);

	}
	
	public void cambiarPeliculaMoonfall(VentanaCartelera vc, VentanaPeliculaMoonfall vpM) {

		System.out.println("Seleccionó: Moonfall");
		vc.setVisible(false);
		vpM.setVisible(true);

	}
	
	public void cambiarPeliculaPaseo(VentanaCartelera vc, VentanaPeliculaPaseo6 vpP) {

		System.out.println("Seleccionó: Paseo 6");
		vc.setVisible(false);
		vpP.setVisible(true);

	}
	
	public void cambiarPeliculaScream(VentanaCartelera vc, VentanaPeliculaScream vpScream) {

		System.out.println("Seleccionó: Paseo 6");
		vc.setVisible(false);
		vpScream.setVisible(true);

	}
	
	public void cambiarPeliculaSpiderman(VentanaCartelera vc, VentanaPeliculaSpiderman vpSpiderman) {

		System.out.println("Seleccionó: Paseo 6");
		vc.setVisible(false);
		vpSpiderman.setVisible(true);

	}
	
	// // // // // // // // // // VENTANA PELICULA // // // // // // // // // // 
	
	//encanto
	public void regresoEncantoCartelera(VentanaCartelera vc, VentanaPeliculaEncanto vpE) {
		System.out.println("Regresó a la Cartelera");
		vc.setVisible(true);
		vpE.setVisible(false);
	}
	
	public void continueEncantoIngresoCliente(VentanaPeliculaEncanto vp, VentanaIngresoCliente vic) {

		if(vp.cmbCinesDisponibles.getSelectedItem().equals("Seleccione")) {
			
			JOptionPane.showMessageDialog(null, "Porfavor seleccione un cine disponible", "Error", JOptionPane.ERROR_MESSAGE);
		}else {
	
		System.out.println("...Ingreso...");
		System.out.println("Pelicula: "+vp.getPelicula());
		vic.setPeliculaSeleccionada(vp.getPelicula());
		System.out.println("Cine: "+vp.cmbCinesDisponibles.getSelectedItem());
		vic.setCineSeleccionado((String)vp.cmbCinesDisponibles.getSelectedItem());
		vp.setVisible(false);
		vic.setVisible(true);
		}
	}
	
	//Moonfall
	
	public void regresoMoonfallCartelera(VentanaCartelera vc, VentanaPeliculaMoonfall vp) {
		System.out.println("Regresó a la Cartelera");
		vc.setVisible(true);
		vp.setVisible(false);
	}
	
	public void continueMoonfallIngresoCliente(VentanaPeliculaMoonfall vp, VentanaIngresoCliente vic) {

		if(vp.cmbCinesDisponibles.getSelectedItem().equals("Seleccione")) {
			
			JOptionPane.showMessageDialog(null, "Porfavor seleccione un cine disponible", "Error", JOptionPane.ERROR_MESSAGE);
		}else {
	
		System.out.println("...Ingreso...");
		System.out.println("Pelicula: "+vp.getPelicula());
		vic.setPeliculaSeleccionada(vp.getPelicula());
		System.out.println("Cine: "+vp.cmbCinesDisponibles.getSelectedItem());
		vic.setCineSeleccionado((String)vp.cmbCinesDisponibles.getSelectedItem());
		vp.setVisible(false);
		vic.setVisible(true);
		}
	}
	
	
	
	
	//Paseo 6
	public void regresoPaseoCartelera(VentanaCartelera vc, VentanaPeliculaPaseo6 vp) {
		System.out.println("Regresó a la Cartelera");
		vc.setVisible(true);
		vp.setVisible(false);
	}
	
	public void continuePaseoIngresoCliente(VentanaPeliculaPaseo6 vp, VentanaIngresoCliente vic) {

		if(vp.cmbCinesDisponibles.getSelectedItem().equals("Seleccione")) {
			
			JOptionPane.showMessageDialog(null, "Porfavor seleccione un cine disponible", "Error", JOptionPane.ERROR_MESSAGE);
		}else {
	
		System.out.println("...Ingreso...");
		System.out.println("Pelicula: "+vp.getPelicula());
		vic.setPeliculaSeleccionada(vp.getPelicula());
		System.out.println("Cine: "+vp.cmbCinesDisponibles.getSelectedItem());
		vic.setCineSeleccionado((String)vp.cmbCinesDisponibles.getSelectedItem());
		vp.setVisible(false);
		vic.setVisible(true);
		}
	}
	
	
	//Scream
	public void regresoScreamCartelera(VentanaCartelera vc, VentanaPeliculaScream vp) {
		System.out.println("Regresó a la Cartelera");
		vc.setVisible(true);
		vp.setVisible(false);
	}
	
	public void continueScreamIngresoCliente(VentanaPeliculaScream vp, VentanaIngresoCliente vic) {

		if(vp.cmbCinesDisponibles.getSelectedItem().equals("Seleccione")) {
			
			JOptionPane.showMessageDialog(null, "Porfavor seleccione un cine disponible", "Error", JOptionPane.ERROR_MESSAGE);
		}else {
	
		System.out.println("...Ingreso...");
		System.out.println("Pelicula: "+vp.getPelicula());
		vic.setPeliculaSeleccionada(vp.getPelicula());
		System.out.println("Cine: "+vp.cmbCinesDisponibles.getSelectedItem());
		vic.setCineSeleccionado((String)vp.cmbCinesDisponibles.getSelectedItem());
		vp.setVisible(false);
		vic.setVisible(true);
		}
	}
	
	
	//scream
	
	public void regresoSpidermanCartelera(VentanaCartelera vc, VentanaPeliculaSpiderman vp) {
		System.out.println("Regresó a la Cartelera");
		vc.setVisible(true);
		vp.setVisible(false);
	}
	
	public void continueSpidermanIngresoCliente(VentanaPeliculaSpiderman vp, VentanaIngresoCliente vic) {

		if(vp.cmbCinesDisponibles.getSelectedItem().equals("Seleccione")) {
			
			JOptionPane.showMessageDialog(null, "Porfavor seleccione un cine disponible", "Error", JOptionPane.ERROR_MESSAGE);
		}else {
	
		System.out.println("...Ingreso...");
		System.out.println("Pelicula: "+vp.getPelicula());
		vic.setPeliculaSeleccionada(vp.getPelicula());
		System.out.println("Cine: "+vp.cmbCinesDisponibles.getSelectedItem());
		vic.setCineSeleccionado((String)vp.cmbCinesDisponibles.getSelectedItem());
		vp.setVisible(false);
		vic.setVisible(true);
		}
	}
	
	// // // // // // // // // // VENTANA INGRESO USUARIO // // // // // // // // // // 
	
	public void regresoIngresoPelicula(VentanaPeliculaEncanto vp , VentanaIngresoCliente vic ) {
		
		System.out.println("Regresó a "+vp.getPelicula());
		vic.setVisible(false);
		vp.setVisible(true);
		
	}
	
	public void regresoIngresoPelicula(VentanaPeliculaMoonfall vp , VentanaIngresoCliente vic ) {
		
		System.out.println("Regresó a "+vp.getPelicula());
		vic.setVisible(false);
		vp.setVisible(true);
		
	}
	
	public void regresoIngresoPelicula(VentanaPeliculaPaseo6 vp , VentanaIngresoCliente vic ) {
		
		System.out.println("Regresó a "+vp.getPelicula());
		vic.setVisible(false);
		vp.setVisible(true);
		
	}
	
	public void regresoIngresoPelicula(VentanaPeliculaScream vp , VentanaIngresoCliente vic ) {
		
		System.out.println("Regresó a "+vp.getPelicula());
		vic.setVisible(false);
		vp.setVisible(true);
		
	}
	
	public void regresoIngresoPelicula(VentanaPeliculaSpiderman vp , VentanaIngresoCliente vic ) {
		
		System.out.println("Regresó a "+vp.getPelicula());
		vic.setVisible(false);
		vp.setVisible(true);
		
	}
	
}
