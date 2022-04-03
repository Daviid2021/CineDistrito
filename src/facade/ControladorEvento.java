package facade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import interfaz.VistaControlador;
import interfaz.VentanaPeliculas.*;


public class ControladorEvento implements ActionListener{
	
	private VistaControlador interfaz;

	public ControladorEvento (VistaControlador interfaz) {
		
		this.interfaz = interfaz;
				
	}
	

	public void actionPerformed(ActionEvent e) {
		
		// // // // // // // // // VENTANA INICIO // // // // // // // // //
		if (e.getSource() == (interfaz.getVentanaInicio().getBtnSalir())) {
			interfaz.getFachada().salir();
		}
		
		if(e.getSource() == interfaz.getVentanaInicio().getBtnIngreso()){
			
			interfaz.getFachada().cambiarPanel(interfaz.getVentanaInicio(), interfaz.getVentanaCartelera());
			
		}
		
		// // // // // // // // // VENTANA CARTELERA // // // // // // // // // 
		
		//Boton Salir
		if(e.getSource() == interfaz.getVentanaCartelera().getBtnSalir()) {
			
			interfaz.getVentanaInicio().getTxtNombre().setText("");
			interfaz.getVentanaInicio().getPwdContraseña().setText("");
			interfaz.getFachada().cambiarPanel(interfaz.getVentanaCartelera(), interfaz.getVentanaInicio());
		}
		
		//Boton pelicula Encanto
		if (e.getSource() == interfaz.getVentanaCartelera().getBtnPeliculaEncanto()) {

			interfaz.getFachada().cambiarPeliculaEncanto(interfaz.getVentanaCartelera(),interfaz.getVentanaPeliculaEncanto());

		}
		if(e.getSource() == interfaz.getVentanaCartelera().getBtnPeliculaMoonfall()) {
			
			interfaz.getFachada().cambiarPeliculaMoonfall(interfaz.getVentanaCartelera(), interfaz.getVentanaPeliculaMoonfall());
			
		}
		if(e.getSource() == interfaz.getVentanaCartelera().getBtnPeliculaPaseo6()) {
			
			interfaz.getFachada().cambiarPeliculaPaseo(interfaz.getVentanaCartelera(), interfaz.getVentanaPeliculaPaseo6());
			
		}
		if(e.getSource() == interfaz.getVentanaCartelera().getBtnPeliculaScream()) {
			
			interfaz.getFachada().cambiarPeliculaScream(interfaz.getVentanaCartelera(), interfaz.getVentanaPeliculaScream());
			
		}
		if(e.getSource() == interfaz.getVentanaCartelera().getBtnPeliculaSpiderman()) {
			
			interfaz.getFachada().cambiarPeliculaSpiderman(interfaz.getVentanaCartelera(), interfaz.getVentanaPeliculaSpiderman());
			
		}
		
		// // // // // // // // // VENTANA PELICULAS  // // // // // // // // //
		
		//encanto
		if(e.getSource() == interfaz.getVentanaPeliculaEncanto().getBtnSalir()) {
			
			interfaz.getFachada().regresoEncantoCartelera(interfaz.getVentanaCartelera(), interfaz.getVentanaPeliculaEncanto());
			
		}
		if(e.getSource() == interfaz.getVentanaPeliculaEncanto().getBtnContinue()) {
			
			interfaz.getFachada().continueEncantoIngresoCliente(interfaz.getVentanaPeliculaEncanto(), interfaz.getVentanaIngresoCliente());
			
		}
		
		//Moonfall
		if (e.getSource() == interfaz.getVentanaPeliculaMoonfall().getBtnSalir()) {

			interfaz.getFachada().regresoMoonfallCartelera(interfaz.getVentanaCartelera(), interfaz.getVentanaPeliculaMoonfall());

		}
		if(e.getSource() == interfaz.getVentanaPeliculaMoonfall().getBtnContinue()) {
			
			interfaz.getFachada().continueMoonfallIngresoCliente(interfaz.getVentanaPeliculaMoonfall(), interfaz.getVentanaIngresoCliente());
			
		}
		
		
		//Paseo 6
		if (e.getSource() == interfaz.getVentanaPeliculaPaseo6().getBtnSalir()) {

			interfaz.getFachada().regresoPaseoCartelera(interfaz.getVentanaCartelera(), interfaz.getVentanaPeliculaPaseo6());

		}
		
		if(e.getSource() == interfaz.getVentanaPeliculaPaseo6().getBtnContinue()) {
			
			interfaz.getFachada().continuePaseoIngresoCliente(interfaz.getVentanaPeliculaPaseo6(), interfaz.getVentanaIngresoCliente());
			
		}
		
		//Scream
		if (e.getSource() == interfaz.getVentanaPeliculaScream().getBtnSalir()) {

			interfaz.getFachada().regresoScreamCartelera(interfaz.getVentanaCartelera(), interfaz.getVentanaPeliculaScream());

		}
		if(e.getSource() == interfaz.getVentanaPeliculaScream().getBtnContinue()) {
			
			interfaz.getFachada().continueScreamIngresoCliente(interfaz.getVentanaPeliculaScream(), interfaz.getVentanaIngresoCliente());
			
		}
		
		//Spiderman
		if (e.getSource() == interfaz.getVentanaPeliculaSpiderman().getBtnSalir()) {

			interfaz.getFachada().regresoSpidermanCartelera(interfaz.getVentanaCartelera(), interfaz.getVentanaPeliculaSpiderman());

		}
		if(e.getSource() == interfaz.getVentanaPeliculaSpiderman().getBtnContinue()) {
			
			interfaz.getFachada().continueSpidermanIngresoCliente(interfaz.getVentanaPeliculaSpiderman(), interfaz.getVentanaIngresoCliente());
			
		}
		
		// // // // // // // // // VENTANA INGRESO CLIENTE // // // // // // // // //
		
				
		if(e.getSource()== interfaz.getVentanaIngresoCliente().getBtnSalir()) {
			switch (interfaz.getVentanaIngresoCliente().getPeliculaSeleccionada()) {
				
			case "Encanto":
				
				interfaz.getFachada().regresoIngresoPelicula(interfaz.getVentanaPeliculaEncanto(), interfaz.getVentanaIngresoCliente());
		
			break;
			
			case "Moonfall":
				
				interfaz.getFachada().regresoIngresoPelicula(interfaz.getVentanaPeliculaMoonfall(), interfaz.getVentanaIngresoCliente());
				
			break;
			
			case "Paseo 6":
				
				interfaz.getFachada().regresoIngresoPelicula(interfaz.getVentanaPeliculaPaseo6(), interfaz.getVentanaIngresoCliente());
				
			break;
			case "Scream":
				
				interfaz.getFachada().regresoIngresoPelicula(interfaz.getVentanaPeliculaScream(), interfaz.getVentanaIngresoCliente());
				
			break;
			case "Spiderman":
				
				interfaz.getFachada().regresoIngresoPelicula(interfaz.getVentanaPeliculaSpiderman(), interfaz.getVentanaIngresoCliente());
				
			break;
				
				
				
				
				
			}
			
			
			
	
	
		}
		
		
		
	}

}
