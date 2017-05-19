package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Modelo.BD;

public class muestraReservas {

	
	public static void MostrarVuelos(){
		ResultSet rs = null;
		BD bd = new BD();
		Statement stmt;
		
    	
    	try {
			String sql = "SELECT * FROM reserva";
			PreparedStatement preparedStatement =  bd.getConexion().prepareStatement(sql);
			preparedStatement.executeQuery(); 
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
}
