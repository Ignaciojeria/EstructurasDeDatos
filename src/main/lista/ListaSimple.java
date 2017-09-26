package main.lista;

import main.nodo.Nodo;

public class ListaSimple {
	public Nodo cabeza;
	public int size=0;
	public Nodo ultimo;
	
	public boolean isEmpty(){
		if(size==0)
		return true;
		else return false;
	}
	private boolean setCabezaIfIsEmpty(Object valor) {
	if(isEmpty()){
	cabeza=new Nodo(valor);ultimo=cabeza;size++;
	return true;
	}
	return false;
	}
	public void addDer(Object valor) {
	if(!setCabezaIfIsEmpty(valor)){
		ultimo.siguiente=new Nodo(valor);
		ultimo=ultimo.siguiente; size++;
	}}
	
	public void addIzq(Object valor) {
		if(!setCabezaIfIsEmpty(valor)){
			Nodo nuevo= new Nodo(valor);
			nuevo.siguiente=cabeza;
			cabeza=nuevo;size++;
		}
	}
	
    public Object get(int indice){
    	Nodo temp=cabeza;
    	for (int i = 0; i < size; i++) {
    		if(i==indice)break;
			temp=temp.siguiente;
		}
    	return temp.valor;
    }

}
