package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import javax.swing.DefaultListModel;

import Modelo.BD;
import Modelo.ReservaModelo;

public class ConsultasReserva {

	public ConsultasReserva() {

	}
	
	public DefaultListModel mostrarReserva(){
    	    ResultSet rs = null;
    		BD cn = new BD();
    		DefaultListModel model = new DefaultListModel();
	    	Statement stmt;
			try {
				stmt = cn.getConexion().createStatement();
				rs = stmt.executeQuery("SELECT * FROM reserva");
				while (rs.next()) {
		        	ReservaModelo rm = new ReservaModelo();
		            rm.setIdReserva(rs.getInt("IdReserva"));
		            rm.setPasajero(rs.getString("Pasajero"));
		            rm.setPlaza(rs.getInt("Plaza"));
		            rm.setIdVuelo(rs.getInt("IdVuelo"));
		            
		            
		            model.addElement(rm.getIdReserva()+", "+rm.getPasajero()+", "+rm.getPlaza()
		            +", "+rm.getIdVuelo());
		            
		       }
			} catch (SQLException e) {
				e.printStackTrace();
			}		
	    return model;
	}
}