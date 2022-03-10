package principal;

import java.sql.Connection;

import bdd.Conexion;
import interfaz.VentanaInicio;
import interfaz.VentanaRegistroUsuario;


/*
 * @ author Jhonatan Moreno
 * @ version 
 */

public class Main {
	
	public static void main (String []args) {
		
		VentanaInicio v1 = new VentanaInicio();
		v1.setVisible(true);
//		
		
//		
		Conexion conexion = new Conexion();
		Connection cn = null;
//		
//		VentanaPelicula v3 = new VentanaPelicula("Encanto");
//		v3.setVisible(true);
		
//		VentanaIngresoUsuario v4 = new VentanaIngresoUsuario();
//		v4.setVisible(true);
		
//		VentanaCambiarContraseña v5 = new VentanaCambiarContraseña();
//		v5.setVisible(true);
	
//		VentanaRegistroUsuario vru = new VentanaRegistroUsuario();
//		vru.setVisible(true);

//		d va = new VentanaAdmin();
//		va.setVisible(true);
		
//		VentanaAgregarEmpleado vac = new VentanaAgregarEmpleado();
//		vac.setVisible(true);
		
		
//		VentanaRegistroUsuario var = new VentanaRegistroUsuario();
//		var.setVisible(true);
		
		cn = conexion.conectar();

//		
			}
	

}

