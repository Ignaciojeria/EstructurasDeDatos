package main;

import main.colegio.Alumno;
import main.colegio.AlumnoService;
import main.lista.ListaSimple;
import main.nodo.Nodo;
import main.temperatura.MockTemperatura;
import main.temperatura.TemperaturaService;

public class Main {

	public static void main(String[] args) {
	//exampleNodo ->new Main().EjemploNodo();
	// exampleAlumno -> new Main().ejemploAlumno();
	new Main().ejemploTemperaTura();
	}
	
	public void ejemploTemperaTura() {
		new MockTemperatura().setData();
		System.out.println("Máxima: "+ TemperaturaService.getInstance().temperaturaMax());
		System.out.println("Mínima: "+ TemperaturaService.getInstance().TemperaturaMin());
		System.out.println("Promedio "+TemperaturaService.getInstance().promedio());
	}
	
	public void EjemploNodo() {
		Nodo nodo= new Nodo("object 1");
		nodo.siguiente=new Nodo("object 2");
		nodo.siguiente.siguiente=new Nodo("object 3");
		System.out.println(nodo.valor);
		System.out.println(nodo.siguiente.valor);
		System.out.println(nodo.siguiente.siguiente.valor);
	}
	
	public void ejemploAlumno() {
		AlumnoService alumnoService=AlumnoService.getInstance();
		alumnoService.addAlumno(new Alumno("Ignacio","18666636-4"));
		alumnoService.addAlumno(new Alumno("lucia","18736748-2"));
		alumnoService.addAlumno(new Alumno("jhon","19328490-5"));
		alumnoService.listar();
	}
	
	public void EjemploListaSimple() {
		ListaSimple listaSimple= new ListaSimple();
		listaSimple.addDer("1");
		listaSimple.addDer("2");
		listaSimple.addDer("izquierda");
		listaSimple.addIzq("Nueva cabeza");
		System.out.println(listaSimple.get(0));
		System.out.println(listaSimple.get(1));
		System.out.println(listaSimple.get(2));
		System.out.println(listaSimple.get(3));
	}
}
