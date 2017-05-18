package Modelo;

public class VueloModelo {
	private int idVUELO;
	private String COrigen;
	private String CDestino;
	private String HSalida;
	private String HLlegada;
	private int Plazas;
	private int idAerolinea;
	public VueloModelo() {
		this.idVUELO = 0;
		this.COrigen = "";
		this.CDestino = "";
		this.HSalida = "";
		this.HLlegada = "";
		this.Plazas = 52;
		this.idAerolinea = 0;
	}
	public int getIdVUELO() {
		return idVUELO;
	}
	public void setIdVUELO(int idVUELO) {
		this.idVUELO = idVUELO;
	}
	public String getCOrigen() {
		return COrigen;
	}
	public void setCOrigen(String cOrigen) {
		COrigen = cOrigen;
	}
	public String getCDestino() {
		return CDestino;
	}
	public void setCDestino(String cDestino) {
		CDestino = cDestino;
	}
	public String getHSalida() {
		return HSalida;
	}
	public void setHSalida(String hSalida) {
		HSalida = hSalida;
	}
	public String getHLlegada() {
		return HLlegada;
	}
	public void setHLlegada(String hLlegada) {
		HLlegada = hLlegada;
	}
	public int getPlazas() {
		return Plazas;
	}
	public void setPlazas(int plazas) {
		Plazas = plazas;
	}
	public int getIdAerolinea() {
		return idAerolinea;
	}
	public void setIdAerolinea(int idAerolinea) {
		this.idAerolinea = idAerolinea;
	}
}
