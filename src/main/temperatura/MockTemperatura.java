package main.temperatura;

import java.util.GregorianCalendar;

public class MockTemperatura {
	
	TemperaturaService temperaturaService=TemperaturaService.getInstance();
	
	public void setData() {
	temperaturaService.getListaSimple().addDer(new Temperatura(new GregorianCalendar(2000,03,10).getTime(),20));
	temperaturaService.getListaSimple().addDer(new Temperatura(new GregorianCalendar(2000,03,11).getTime(),25));
	temperaturaService.getListaSimple().addDer(new Temperatura(new GregorianCalendar(2000,03,12).getTime(),19));
	temperaturaService.getListaSimple().addDer(new Temperatura(new GregorianCalendar(2000,03,13).getTime(),27));
	temperaturaService.getListaSimple().addDer(new Temperatura(new GregorianCalendar(2000,03,14).getTime(),29));
	temperaturaService.getListaSimple().addDer(new Temperatura(new GregorianCalendar(2000,03,15).getTime(),22));
	temperaturaService.getListaSimple().addDer(new Temperatura(new GregorianCalendar(2000,03,16).getTime(),30));
	temperaturaService.getListaSimple().addDer(new Temperatura(new GregorianCalendar(2000,03,17).getTime(),-1));
	temperaturaService.getListaSimple().addDer(new Temperatura(new GregorianCalendar(2000,03,18).getTime(),-6));
	temperaturaService.getListaSimple().addDer(new Temperatura(new GregorianCalendar(2000,03,19).getTime(),-5));
	temperaturaService.getListaSimple().addDer(new Temperatura(new GregorianCalendar(2000,03,20).getTime(),-2));
	}

}
