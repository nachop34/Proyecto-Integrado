package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;

public class BD {

	private Connection conexion;
	
	public BD() {
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		}catch(Exception e){
			System.err.println("Error registrant el Driver mysql");
			System.err.println(e);
		}
		try{
			
			String cadenaDeConnexio = "jdbc:mysql://35.162.56.100/alianzaaerolines?user=usuario&password=skyteamadvisor2017";
			conexion= DriverManager.getConnection(cadenaDeConnexio);
			
		}catch(Exception e){
			System.err.println("Error connectant a mysql/alianzaerolines "+e);
		}
	
	}

	public Connection getConexion() {
		return conexion;
	}
	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
	
}
