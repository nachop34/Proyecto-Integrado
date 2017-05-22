package Controlador;

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
	
	
}