package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.ArrayList;

import Modelo.BD;

public class VuelosDestino {
	BD bd = new BD();
	
	@SuppressWarnings("finally")
	public ArrayList<String> vdestino(){	
		ArrayList<String> llistatVolsDestino = new ArrayList<String>();
		ResultSet resultatConsulta=null;
		try {
			Statement stmt=bd.getConexion().createStatement();		
			resultatConsulta = stmt.executeQuery("SELECT DISTINCT CDestino  FROM vuelo");
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
