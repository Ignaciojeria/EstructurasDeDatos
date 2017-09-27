package main.celular;

import main.lista.ListaSimple;

public class ClienteCelularService {
	
	private ListaSimple listaSimple;
	
	private static final ClienteCelularService clienteCelular=new ClienteCelularService();
	
	private ClienteCelularService() {
		listaSimple=new ListaSimple();
	}
	
	public static ClienteCelularService getInstance() {
		return clienteCelular;
	}
	
	public ListaSimple findAll() {
		return listaSimple;
	}
	
	public void add(ClienteCelular clienteCelular) {
		if(CompaniaTelefonica.capacidad==listaSimple.size) {
			System.out.println("La lista de clientes excede la capacidad m�xima que puede almacenar esta compa��a");	
			return;
		}
		listaSimple.addDer(clienteCelular);
	}
	
}
