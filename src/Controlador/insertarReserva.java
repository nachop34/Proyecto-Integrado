package Controlador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.DriverManager;

import Modelo.BD;

public class insertarReserva {

	
	public static void insertarReservas(int idRESERVA, String pasajero, int plaza, int idVUELO){
		ResultSet rs = null;
		BD bd = new BD();
		Statement stmt;
		
    	
    	try {
			String sql = "INSERT INTO reserva (idRESERVA, pasajero, plaza, idVUELO)" +
			        "VALUES (?, ?, ?, ?)";
			PreparedStatement preparedStatement =  bd.getConexion().prepareStatement(sql);
			preparedStatement.setInt(1, idRESERVA);
			preparedStatement.setString(2, pasajero);
			preparedStatement.setInt(3, plaza);
			preparedStatement.setInt(4, idVUELO);
			preparedStatement.executeUpdate(); 
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}
