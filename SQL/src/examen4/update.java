package examen4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class update {

	public static void main(String[] args) {
		try {
			Connection conexion = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
		Statement instruccion =conexion.createStatement();
		String query = "UPDATE pedidos SET numero_de_productos='8' WHERE id='1'";	
		boolean resultado = instruccion.execute(query);
		if (!resultado) {
		System.out.println("Registros insertados: " + instruccion.getUpdateCount());}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
