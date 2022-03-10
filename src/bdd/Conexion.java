package bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private static final String Controlador = "com.mysql.cj.jdbc.Driver";
	private static final String Url = "jdbc:mysql://localhost:3306/CinePrueba";
	private static final String User = "root";
	private static final String Password = "";

	static {
		try {
			Class.forName(Controlador);
		} catch (ClassNotFoundException e) {
			
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
			
		}
		
	}
	
	public Connection conectar() {

		Connection conexion = null;

		try {
			
			
			// 1.  Paso - Crear Conexion
			conexion = DriverManager.getConnection(Url, User, Password);

			System.out.println("Conexion Establecida con la base de datos\n");

		} catch (SQLException e) {

			System.out.println("Error en la conexión\n");

		}

		return conexion;

	}
	
	
	
	
	
	
	
	
	
}
