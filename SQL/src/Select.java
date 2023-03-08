import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		try {
			Connection conexion = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "fullstack");
		// obtención de un objeto de tipo Statement 
		Statement instruccion =conexion.createStatement();
		// construir sentencia SQL 
		String query = "SELECT * FROM cliente WHERE id='1'";	
		// ejecutar instrucción con el método execute 
		boolean resultado = instruccion.execute(query);
		// si es true, entonces la instrucción devuelve un objeto de tipo ResultSet 
		if (resultado) {
		ResultSet resultados1 = instruccion.getResultSet();
		System.out.println("Listado de cliente (con execute): ");
		while (resultados1.next()) {
		System.out.println("Cliente " + resultados1.getInt("id")); 
		System.out.println("Ig_gestor: " + resultados1.getString("id_gestor"));
		System.out.println("Usuario: " + resultados1.getString("usuario")); 
		System.out.println("Password: " + resultados1.getString("password")); 
		System.out.println("Correo: " + resultados1.getString("correo")); 
		System.out.println("Saldo: " + resultados1.getString("saldo"));}}}
//		
//		System.out.println("Listado de gestores (con executeQuery): ");
//			while (resultados1.next()) {
//				System.out.println("Gestor " + resultados1.getInt("id")); 
//				System.out.println("Usuario: " + resultados1.getString("usuario")); 
//				System.out.println("Password: " + resultados1.getString("password")); 
//				System.out.println("Correo: " + resultados1.getString("correo")); }
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
