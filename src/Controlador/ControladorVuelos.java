package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modelo.BD;
import Modelo.VueloModelo;

public class ControladorVuelos {
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
	
	@SuppressWarnings("finally")
	public ArrayList<String> vorigen(){	
		ArrayList<String> llistatVolsOrigen = new ArrayList<String>();
		ResultSet resultatConsulta=null;
		try {
			Statement stmt=bd.getConexion().createStatement();		
			resultatConsulta = stmt.executeQuery("SELECT DISTINCT COrigen  FROM vuelo");
			while(resultatConsulta.next()){
				llistatVolsOrigen.add(resultatConsulta.getString("COrigen"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			return llistatVolsOrigen;
		}
	}
	
	@SuppressWarnings("finally")
	public ArrayList<VueloModelo> ltabla(String origenSeleccionat, String destinoSeleccionat){
	 ArrayList<VueloModelo> llistatVolsTabla = new ArrayList<VueloModelo>();
	ResultSet resultatConsulta=null;
	try {
		PreparedStatement stmt=bd.getConexion().prepareStatement("SELECT * FROM vuelo WHERE COrigen=? AND CDestino=?");	
		stmt.setString(1, origenSeleccionat);
		stmt.setString(2, destinoSeleccionat);
		resultatConsulta = stmt.executeQuery();
		while(resultatConsulta.next()){
			int idv = resultatConsulta.getInt("IdVuelo");
			String cO = resultatConsulta.getString("COrigen");
			String cD = resultatConsulta.getString("CDestino");
			String hS = resultatConsulta.getString("HSalida");
			String hL = resultatConsulta.getString("HLlegada");
			String p = resultatConsulta.getString("Plazas");
			int a = resultatConsulta.getInt("idAerolinea");
			VueloModelo unVuelo = new VueloModelo(idv, cO, cD, hS, hL, p, a);
			llistatVolsTabla.add(unVuelo);
			
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally{
		return llistatVolsTabla;
	}
	}

}