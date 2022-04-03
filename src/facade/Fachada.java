package facade;

import java.awt.Component;

import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

import interfaz.VentanaCartelera;
import interfaz.VentanaCompraSilla;
import interfaz.VentanaEstablecerContraseña;
import interfaz.VentanaIngresoCliente;
import interfaz.VentanaInicio;
import interfaz.VentanaRecuperarContraseña;
import interfaz.VentanaRegistroCliente;
import interfaz.VistaControlador;
import interfaz.VentanaPeliculas.VentanaPeliculaEncanto;
import interfaz.VentanaPeliculas.VentanaPeliculaMoonfall;
import interfaz.VentanaPeliculas.VentanaPeliculaPaseo6;
import interfaz.VentanaPeliculas.VentanaPeliculaScream;
import interfaz.VentanaPeliculas.VentanaPeliculaSpiderman;
import lógica.Verificar;

public class Fachada {

	private VistaControlador interfaz;
	
	private Verificar verificar;
	
	private Component [] Componentes;
	
	
	
	
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
	
	public void verificacionCliente(VentanaIngresoCliente vic, VentanaCompraSilla vcs) {
		
		if(verificar.esCorreo(vic.getTxtCorreo()) && !vic.getPwdContraseña().getText().isEmpty()) {
			
			System.out.println("\nValidando información de Correo....");
			
			
			/*
			 * if(vic.getTxtCorreo() == BDD && vic.getPwdContraseña() == BDD){
			 * 
			 * 	}
			 */
			vic.setVisible(false);
			vcs.setVisible(true);
			
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Porfavor ingrese nuevamente los datos","ERROR", JOptionPane.ERROR_MESSAGE);
			vic.setTxtCorreo("");
			vic.setPwdContraseña("");
			
		}
		
	}
	
	public void ingresoIngresoClienteRecuperarContraseña(VentanaIngresoCliente vic, VentanaRecuperarContraseña vrc) {
		
		System.out.println("Ingresó a Ventana Recuperar Contraseña");
		vic.setVisible(false);
		vrc.setVisible(true);
		
		
	}
	
	// // // // // // // // // // VENTANA COMPRA SILLA // // // // // // // // // // 

	public void sillasSeleccionadas(VentanaCompraSilla vcs) {
		
		if(!vcs.getSpnGeneral().isEnabled() && !vcs.getSpnPreferencial().isEnabled()) {

			JOptionPane.showMessageDialog(null, "Porfavor seleccione asiento(s) para continuar", "NO Asiento", JOptionPane.INFORMATION_MESSAGE);
			
		}else {
			
			Componentes = vcs.getComponentesSilla();
			String Sillas ="";
			
			for (int i=0; i<Componentes.length; i++) {
				
				 if( ( (JToggleButton) Componentes[i]).isSelected() ){
	                Sillas += ((JToggleButton) Componentes[i]).getName() + " - ";
	              }
	          }
				
			System.out.println("Sillas seleccionadas: "+Sillas); 
			
		}
		
	}
	
	public void regresoCompraSillaIngreso(VentanaCompraSilla vcs, VentanaIngresoCliente vic) {
		
		System.out.println("Regresó a Ventana Ingreso Cliente");
		vcs.setVisible(false);
		vic.setVisible(true);
		
	}
	

	public void ingresoIngresoClienteRegistroCliente(VentanaRegistroCliente vrc, VentanaIngresoCliente vic) {
		
		System.out.println("Ingresó a la Ventana de Registro");
		vic.setVisible(false);
		vrc.setVisible(true);
		
	}
	
	public boolean registroClienteExitoso(VentanaRegistroCliente vrc) {
		
		
		if (!Verificar.esCorreo(vrc.getTxtCorreo().getText())) {

			JOptionPane.showMessageDialog(null, "Ingrese un formato de correo válido");
			vrc.getTxtCorreo().setText("");
			return false;
		}
		else if(vrc.getTxtApellido().getText().isEmpty() || vrc.getTxtContraseña().getText().isEmpty() || vrc.getTxtDocumento().getText().isEmpty() || vrc.getTxtNombre().getText().isEmpty()){
			
			JOptionPane.showMessageDialog(null, "Porfavor no deje espacios en blanco");
			vrc.getBtnIngreso().setEnabled(false);
			vrc.getCbxAutorizacion().setSelected(false);
			return false;
			
		}else {
			
			vrc.getBtnIngreso().setEnabled(true);
			System.out.println("Se registró con éxito!");
			//Se agrega el Cliente a la BDD
			return true;
		}

		
		
	}
	
	public void chechkBoxSelecionado(VentanaRegistroCliente vrc) {
		
		if(vrc.getCbxAutorizacion().isSelected()) {
			
			vrc.getBtnIngreso().setEnabled(true);

			
		}else {
			vrc.getBtnIngreso().setEnabled(false);
		}
		
	}
	
	public void regresoRegistroClienteIngresoCliente(VentanaRegistroCliente vrc, VentanaIngresoCliente vic) {
		
		System.out.println("Regresó a ventana Ingreso Usuario");
		vrc.setVisible(false);
		vic.getPwdContraseña().setText("");
		vic.getFtxtCorreo().setText("");
		vic.setVisible(true);
		
	}
	
	public void recuperarContraseña(VentanaRecuperarContraseña vrc) {
		
		if(Verificar.esCorreo(vrc.getTxtCorreo()) && !vrc.getTxtDocumento().getText().isEmpty()) {
			
			//Se hace la verificación en la base de datos
			
			JOptionPane.showMessageDialog(null, "Recuperación Exitósa\nNombre usuario: _______________\nContraseña: _______________");
			
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Porfavor ingrese nuevamente los datos","ERROR", JOptionPane.ERROR_MESSAGE);
			
		}
		
	}
	
	public void regresoRecuperarContraseñaIngresoCliente(VentanaIngresoCliente vic, VentanaRecuperarContraseña vrcontraseña) {
		
		System.out.println("Regresó a Ventana Ingreso");
		vrcontraseña.setVisible(false);
		vic.setVisible(true);
		
	}
	
	public void activarSpinnerGeneral(VentanaCompraSilla vcs) {

		if (vcs.getRbtnGeneral().isSelected()) {
			vcs.getSpnGeneral().setEnabled(true);
		} else {
			vcs.getSpnGeneral().setEnabled(false);
		}

	}

	public void activarSpinnerPreferencial(VentanaCompraSilla vcs) {

		if (vcs.getRbtnPreferencial().isSelected()) {
			vcs.getSpnPreferencial().setEnabled(true);
		} else {
			vcs.getSpnPreferencial().setEnabled(false);
		}

	}

		
	}
	

