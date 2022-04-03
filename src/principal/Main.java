package principal;

import java.sql.Connection;

import bdd.Conexion;
import facade.Fachada;

/*
 * @ author Jhonatan Moreno
 * @ version 
 */

public class Main {

	public static void main(String[] args) {

		Fachada App = new Fachada();
		App.iniciar();

//		
		Conexion conexion = new Conexion();
		Connection cn = null;
//		
//		VentanaPelicula v3 = new VentanaPelicula("Encanto");
//		v3.setVisible(true);

//		VentanaCambiarContraseña v5 = new VentanaCambiarContraseña();
//		v5.setVisible(true);

//		VentanaRegistroCliente vru = new VentanaRegistroCliente();
//		vru.setVisible(true);

//		VentanaAdmin va = new VentanaAdmin();
//		va.setVisible(true);

//		VentanaRegistroUsuario var = new VentanaRegistroUsuario();
//		var.setVisible(true);

//		VentanaEstablecerContraseña vec = new VentanaEstablecerContraseña();
//		vec.setVisible(true);

//		VentanaSnacks vs = new VentanaSnacks();
//		vs.setVisible(true);

// 		VentanaCompraSilla vcs = new VentanaCompraSilla("", "");
//		vcs.setVisible(true);
//		
//		VentanaIngresoCliente vic = new VentanaIngresoCliente();
//		vic.setVisible(true);

//		
		cn = conexion.conectar();

//		
	}

}
