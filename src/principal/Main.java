package principal;

import java.sql.Connection;

import bdd.Conexion;
import interfaz.VentanaAdmin;
import interfaz.VentanaCompraSilla;
import interfaz.VentanaEstablecerContraseña;
import interfaz.VentanaIngresoCliente;
import interfaz.VentanaInicio;
import interfaz.VentanaRegistroUsuario;
import interfaz.VentanaSnacks;


/*
 * @ author Jhonatan Moreno
 * @ version 
 */

public class Main {
	
	public static void main (String []args) {
		
//		VentanaInicio v1 = new VentanaInicio();
//		v1.setVisible(true);
		
		
//		
		Conexion conexion = new Conexion();
		Connection cn = null;
//		
//		VentanaPelicula v3 = new VentanaPelicula("Encanto");
//		v3.setVisible(true);
		
		
//		VentanaCambiarContraseña v5 = new VentanaCambiarContraseña();
//		v5.setVisible(true);
	
//		VentanaRegistroUsuario vru = new VentanaRegistroUsuario();
//		vru.setVisible(true);

//		VentanaAdmin va = new VentanaAdmin();
//		va.setVisible(true);
		
//		VentanaAgregarEmpleado vac = new VentanaAgregarEmpleado();
//		vac.setVisible(true);
		
		
//		VentanaRegistroUsuario var = new VentanaRegistroUsuario();
//		var.setVisible(true);
		
		VentanaEstablecerContraseña vec = new VentanaEstablecerContraseña();
		vec.setVisible(true);
////		
//		VentanaSnacks vs = new VentanaSnacks();
//		vs.setVisible(true);
//		
//		VentanaCompraSilla vcs = new VentanaCompraSilla();
//		vcs.setVisible(true);
//		VentanaIngresoCliente vic = new VentanaIngresoCliente();
//		vic.setVisible(true);
		
//		
		cn = conexion.conectar();

//		
			}
	

}

