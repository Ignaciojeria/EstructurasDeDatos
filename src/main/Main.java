package main;

import main.celular.Celular;
import main.celular.ClienteCelular;
import main.celular.ClienteCelularService;
import main.celular.CompaniaTelefonica;
import main.celular.MockClienteCelular;
import main.colegio.Alumno;
import main.colegio.AlumnoService;
import main.lista.ListaSimple;
import main.nodo.Nodo;
import main.pila.Pila;
import main.temperatura.MockTemperatura;
import main.temperatura.TemperaturaService;

public class Main {

	public static void main(String[] args) {
	//exampleNodo ->new Main().EjemploNodo();
	// exampleAlumno -> new Main().ejemploAlumno();
	//exampleTemperatura-> new Main().ejemploTemperaTura();
	//new Main().ejemploCelular();
		new Main().ejemploPila();
		
	}
	
	private void ejemploPila() {
        Pila pila=new Pila();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.listarPila();
        
        System.out.println("---peek---");
        System.out.println("peek cima:"+pila.peek());
        System.out.println("no borra el valor de la cima. Sólo lo muestra");
        pila.listarPila();
        System.out.println("----Pop----");
        System.out.println("pop cima: "+pila.pop());
        System.out.println("muestra y borra el valor de la cima");
        pila.listarPila();
        System.out.println("---clear---");
        pila.clear();
        pila.listarPila();
	}
	
	//las clases de Este Ejemplo están más acompladas que la conchetumadre.No programes así por ningún motivo en la rial life.
	private void ejemploCelular() {
		new MockClienteCelular().initData();
		CompaniaTelefonica compania=new CompaniaTelefonica(ClienteCelularService.getInstance().findAll(),7);
		ClienteCelularService.getInstance().add(new ClienteCelular("12351233-2","Bastian",12,'M',true,new Celular(1823949,"Samsung")));
	}
	
	
	private void ejemploTemperaTura() {
		new MockTemperatura().setData();
		System.out.println("Máxima: "+ TemperaturaService.getInstance().temperaturaMax());
		System.out.println("Mínima: "+ TemperaturaService.getInstance().TemperaturaMin());
		System.out.println("Promedio "+TemperaturaService.getInstance().promedio());
		System.out.println("Temperaturas bajo 0°: "+TemperaturaService.getInstance().temperaturasBajo0());
	}
	
	private void EjemploNodo() {
		Nodo nodo= new Nodo("object 1");
		nodo.siguiente=new Nodo("object 2");
		nodo.siguiente.siguiente=new Nodo("object 3");
		System.out.println(nodo.valor);
		System.out.println(nodo.siguiente.valor);
		System.out.println(nodo.siguiente.siguiente.valor);
	}
	
	private void ejemploAlumno() {
		AlumnoService alumnoService=AlumnoService.getInstance();
		alumnoService.addAlumno(new Alumno("Ignacio","18666636-4"));
		alumnoService.addAlumno(new Alumno("lucia","18736748-2"));
		alumnoService.addAlumno(new Alumno("jhon","19328490-5"));
		alumnoService.listar();
	}
	
	private void EjemploListaSimple() {
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
