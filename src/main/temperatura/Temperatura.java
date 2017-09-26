package main.temperatura;

import java.util.Date;

public class Temperatura {
	
	private Date fecha;
	
	private int temperatura;
	
	public Temperatura() {}

	public Temperatura(Date fecha, int temperatura) {
		this.fecha = fecha;
		this.temperatura = temperatura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	

}
