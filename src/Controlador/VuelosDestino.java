package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modelo.BD;

public class VuelosDestino {
	BD bd = new BD();
	

	public ArrayList<String> vdestino(){	
		ArrayList<String> llistatVolsDestino = new ArrayList<String>();
		ResultSet resultatConsulta=null;
		try {
			Statement stmt=bd.getConexion().createStatement();	
			resultatConsulta = stmt.executeQuery("SELECT DISTINCT CDestino FROM vuelo");
			while(resultatConsulta.next()){
				llistatVolsDestino.add(resultatConsulta.getString("CDestino"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			return llistatVolsDestino;
		}
	}

	@SuppressWarnings("finally")
	public ArrayList<String> vdestino(String origen){	
		ArrayList<String> llistatVolsDestino = new ArrayList<String>();
		ResultSet resultatConsulta=null;
		try {
			PreparedStatement stmt=bd.getConexion().prepareStatement("SELECT DISTINCT CDestino FROM vuelo where COrigen = ?");	
			stmt.setString(1, origen);
			resultatConsulta = stmt.executeQuery();
			while(resultatConsulta.next()){
				llistatVolsDestino.add(resultatConsulta.getString("CDestino"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			return llistatVolsDestino;
		}
	}
}
