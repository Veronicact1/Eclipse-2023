package examen4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class select {
	public static void main(String[] args) {
		try {
		Connection conexion = 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
				Statement instruccion = conexion.createStatement(); 
				String query = "SELECT * FROM productos WHERE departamento='technica'";
				ResultSet resultados = instruccion.executeQuery(query); 
				System.out.println(resultados.getMetaData().getColumnCount());
		} catch (SQLException e) {
				e.printStackTrace();}
	}	
}
