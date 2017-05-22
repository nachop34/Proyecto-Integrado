package Modelo;

public class ReservaModelo {
	private int idReserva;
	private String Pasajero;
	private int Plaza;
	private int idVuelo;
	
	public ReservaModelo() {
		this.idReserva = 0;
		this.Pasajero = "";
		this.Plaza = 0;
		this.idVuelo = 0;
	}
	
	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	public String getPasajero() {
		return Pasajero;
	}
	public void setPasajero(String pasajero) {
		Pasajero = pasajero;
	}
	public int getPlaza() {
		return Plaza;
	}
	public void setPlaza(int plaza) {
		Plaza = plaza;
	}
	public int getIdVuelo() {
		return idVuelo;
	}
	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}
	
}
