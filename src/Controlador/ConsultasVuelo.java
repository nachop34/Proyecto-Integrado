package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;


import Modelo.BD;
import Modelo.VueloModelo;

public class ConsultasVuelo {

	public ConsultasVuelo() {

	}
	
	public ArrayList<VueloModelo> mostrarVuelos(){
	    ResultSet rs = null;
		BD cn = new BD();
    	Statement stmt;
    	ArrayList<VueloModelo> tabla = new ArrayList<VueloModelo>();
    	
		try {
			stmt = cn.getConexion().createStatement();
			rs = stmt.executeQuery("SELECT A.Nombre, IdVuelo, COrigen, CDestino, HSalida, HLlegada, Plazas "
					+ "FROM aerolinea A JOIN vuelo V ON A.IdAerolinea = V.IdAerolinea");
			while (rs.next()) {
	        	VueloModelo vm = new VueloModelo();
	            vm.setIdVUELO(rs.getInt("IdVuelo"));
	            vm.setCOrigen(rs.getString("Corigen"));
	            vm.setCDestino(rs.getString("CDestino"));
	            vm.setHSalida(rs.getString("HSalida"));
	            vm.setHLlegada(rs.getString("HLlegada"));
	            vm.setPlazas(rs.getInt("Plazas"));
	            vm.setAerolinea(rs.getString("A.Nombre"));
	            tabla.add(vm);
	            }
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return tabla;
	}
}