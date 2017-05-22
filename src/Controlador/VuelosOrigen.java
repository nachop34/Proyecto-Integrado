package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modelo.BD;

public class VuelosOrigen {
	BD bd=new BD();
	
	
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
	
	
	
}
