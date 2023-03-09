package examen4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class delete {

	public static void main(String[] args) {
		try {
			Connection conexion = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
		Statement instruccion =conexion.createStatement();
		String query = "DELETE FROM clientes WHERE id='3'";	
		boolean resultado = instruccion.execute(query);
		if (!resultado) {
		System.out.println("Registros eliminados: " + instruccion.getUpdateCount());}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
