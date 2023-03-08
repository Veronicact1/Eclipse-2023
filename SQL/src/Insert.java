import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Insert {

	public static void main(String[] args) {
		try {
			Connection conexion = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "fullstack");
		// obtención de un objeto de tipo Statement 
		Statement instruccion =conexion.createStatement();
		// construir sentencia SQL 
		//String query = "INSERT INTO gestor (usuario, password, correo) VALUES ('gestor1','gestor1', 'gestor1@correo.com')";
		String query = "UPDATE gestor SET usuario='gestoractualizado' WHERE id='1'";	
		// ejecutar instrucción con el método execute 
		boolean resultado = instruccion.execute(query);
		// si es false, entonces la instrucción no devuelve un objeto de tipo ResultSet 
		if (!resultado) {
		// mostrar el número de registros insertados
		System.out.println("Registros insertados: " + instruccion.getUpdateCount());}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}