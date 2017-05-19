package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Modelo.BD;

public class muestraVuelos {

	
	public static void MostrarVuelos(){
		ResultSet rs = null;
		BD bd = new BD();
		Statement stmt;
		
    	
    	try {
			String sql = "SELECT * FROM vuelo";
			PreparedStatement preparedStatement =  bd.getConexion().prepareStatement(sql);
			preparedStatement.executeQuery(); 
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
}
