package main;

import main.lista.ListaSimple;
import main.nodo.Nodo;

public class Main {

	public static void main(String[] args) {
	//exampleNodo ->new Main().EjemploNodo();
	 new Main().EjemploListaSimple();
	}
	
	public void EjemploNodo() {
		Nodo nodo= new Nodo("object 1");
		nodo.siguiente=new Nodo("object 2");
		nodo.siguiente.siguiente=new Nodo("object 3");
		System.out.println(nodo.valor);
		System.out.println(nodo.siguiente.valor);
		System.out.println(nodo.siguiente.siguiente.valor);
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
