package examen4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insert_pedidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conexion = 
			DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
			Statement instruccion = conexion.createStatement();
			String query = "INSERT INTO pedidos (id_cliente, numero_de_productos, suma) VALUES ('1', '4', '300')"; 
			boolean resultado = instruccion.execute(query); 
			if (!resultado) {
			System.out.println("Registros insertados: " + instruccion.getUpdateCount());}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
