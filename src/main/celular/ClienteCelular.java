package main.celular;

public class ClienteCelular {

	private String rut;
	private String nombre;
	private int edad;
	private char sexo;
	private boolean plan;
	private Celular celular;
	
	public ClienteCelular(String rut, String nombre, int edad, char sexo, boolean plan, Celular celular) {
		this.rut = rut;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.plan = plan;
		this.celular = celular;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public boolean isPlan() {
		return plan;
	}

	public void setPlan(boolean plan) {
		this.plan = plan;
	}

	public Celular getCelular() {
		return celular;
	}

	public void setCelular(Celular celular) {
		this.celular = celular;
	}
	
}
