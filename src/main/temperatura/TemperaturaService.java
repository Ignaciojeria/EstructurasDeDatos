package main.temperatura;

import main.lista.ListaSimple;

public class TemperaturaService {
	
 	private ListaSimple listaSimple;
	
	private static final TemperaturaService temperaturaService=new TemperaturaService();
	
	private  TemperaturaService() {
		listaSimple=new ListaSimple();
	}
	
	public static TemperaturaService getInstance() {
		return temperaturaService;
	}
	
	public ListaSimple getListaSimple() {
		return listaSimple;
	}

	public int temperaturaMax() {
		int temperaturaMaxima=0;
		for (int row = 0; row < listaSimple.size; row++) {
		//	Temperatura temperaturaRow= (Temperatura)listaSimple.get(row);
			for (int col = 0; col < listaSimple.size; col++) {
			Temperatura temperaturaCol=(Temperatura)listaSimple.get(col);
				if(temperaturaMaxima<temperaturaCol.getTemperatura())
				temperaturaMaxima=temperaturaCol.getTemperatura();
				//else temperaturaMaxima=temperaturaRow.getTemperatura();				
			}
		}
		return temperaturaMaxima;
	}
	
	public int TemperaturaMin() {
		int temperaturaMinima=0;
		for (int row = 0; row < listaSimple.size; row++) {
			//Temperatura temperaturaRow= (Temperatura)listaSimple.get(row);
			for (int col = 0; col < listaSimple.size; col++) {
			Temperatura temperaturaCol=(Temperatura)listaSimple.get(col);
				if(temperaturaMinima>temperaturaCol.getTemperatura())
				temperaturaMinima=temperaturaCol.getTemperatura();
				//else temperaturaMinima=temperaturaRow.getTemperatura();				
			}
		}
		return temperaturaMinima;
	}
	
	public int temperaturasBajo0(){
		int z=0;
		for (int i = 0; i < listaSimple.size; i++) {
			Temperatura temperatura=(Temperatura)listaSimple.get(i);
			if(temperatura.getTemperatura()<0)
				z++;
		}
		return z;
	}
	
	
	public double promedio() {
		double grados=0;
		int z=0;
		for (int i = 0; i < listaSimple.size; i++) {
			Temperatura temperatura=(Temperatura)listaSimple.get(i);
			grados+=temperatura.getTemperatura();z++;
		}
		return grados/z;
	}
}
