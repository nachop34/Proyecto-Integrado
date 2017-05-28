package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;


import Modelo.BD;
import Modelo.ReservaModelo;

public class ConsultasReserva {

	public ConsultasReserva() {

	}
	
	public ArrayList<ReservaModelo> mostrarReservas(){
	    ResultSet rs = null;
		BD cn = new BD();
    	Statement stmt;
    	ArrayList<ReservaModelo> tabla = new ArrayList<ReservaModelo>();
    	
			try {
				stmt = cn.getConexion().createStatement();
				rs = stmt.executeQuery("SELECT * FROM reserva");
				while (rs.next()) {
		        	ReservaModelo rm = new ReservaModelo();
		            rm.setIdReserva(rs.getInt("IdReserva"));
		            rm.setPasajero(rs.getString("Pasajero"));
		            rm.setPlaza(rs.getInt("Plaza"));
		            rm.setIdVuelo(rs.getInt("IdVuelo"));
		            tabla.add(rm);
		            
		       }
			} catch (SQLException e) {
				e.printStackTrace();
			}		
	    return tabla;
	}
	
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
	
	public static void insertarReservas(Object idRESERVA, String pasajero, int plaza, int idVUELO){
		ResultSet rs = null;
		BD bd = new BD();
		Statement stmt;
		
    	
    	try {
			String sql = "INSERT INTO reserva (idRESERVA, pasajero, plaza, idVUELO)" +
			        "VALUES (?, ?, ?, ?)";
			PreparedStatement preparedStatement =  bd.getConexion().prepareStatement(sql);
			preparedStatement.setObject(1, idRESERVA);
			preparedStatement.setString(2, pasajero);
			preparedStatement.setInt(3, plaza);
			preparedStatement.setInt(4, idVUELO);
			preparedStatement.executeUpdate(); 
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	
}