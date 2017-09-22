
public class Main {

	public static void main(String[] args) {
		new Main().EjemploNodo();
	}
	
	public void EjemploNodo() {
		Nodo nodo= new Nodo(1);
		nodo.siguiente=new Nodo(2);
		nodo.siguiente.siguiente=new Nodo(3);
		System.out.println(nodo.valor);
		System.out.println(nodo.siguiente.valor);
		System.out.println(nodo.siguiente.siguiente.valor);
	}
}
