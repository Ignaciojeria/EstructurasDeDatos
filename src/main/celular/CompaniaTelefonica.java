package main.celular;

import main.lista.ListaSimple;

public class CompaniaTelefonica {
	
	private static String nombre="Entel";
	private ListaSimple listaSimple;
	public static int capacidad=30;

	public CompaniaTelefonica(ListaSimple listaSimple,int capacidad) {
		System.out.println("compañía: "+nombre);
		System.out.println("capacidad: "+ capacidad);
		System.out.println("clientes: "+ listaSimple.size);
		CompaniaTelefonica.capacidad=capacidad;
		setListaSimple(listaSimple);
	}

	
	public ListaSimple getListaSimple() {
		return listaSimple;
	}

	public void setListaSimple(ListaSimple listaSimple) {
		if(capacidad<listaSimple.size) { 
		System.out.println("La lista de clientes excede la capacidad máxima que puede almacenar esta compañía");	
		return;
		}
		this.listaSimple = listaSimple;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		CompaniaTelefonica.nombre = nombre;
	}

}
