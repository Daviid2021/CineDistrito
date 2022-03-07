package principal;

import interfaz.VentanaInicio;
import interfaz.VentanaPelicula;
import interfaz.VentanaRegistroUsuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import bdd.Conexion;
import interfaz.VentanaCambiarContraseña;
import interfaz.VentanaCartelera;
import interfaz.VentanaIngresoUsuario;


/*
 * @ author Jhonatan Moreno
 * @ version 
 */

public class Main {
	
	public static void main (String []args) {
		
		VentanaInicio v1 = new VentanaInicio();
		v1.setVisible(true);
		
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

	

		
		cn = conexion.conectar();

//		
			}
	

}

