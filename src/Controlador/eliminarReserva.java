package Controlador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import Modelo.BD;

public class eliminarReserva {

	
	public static void eliminarReservas(int id){
		ResultSet rs = null;
		BD bd = new BD();
		Statement stmt;
		
    	
    	try {
			String sql = "DELETE FROM reserva WHERE IdReserva = "+id;
			PreparedStatement preparedStatement =  bd.getConexion().prepareStatement(sql);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}

