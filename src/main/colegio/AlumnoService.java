package main.colegio;

import main.lista.ListaSimple;

public class AlumnoService {
	
	private ListaSimple alumnos;
	
	private static final AlumnoService alumnoService=new AlumnoService();
	
	private AlumnoService() {
		alumnos=new ListaSimple();
	}
	
	public static AlumnoService getInstance() {
		return alumnoService;
	}
	
	public void addAlumno(Alumno alumno) {
		alumnos.addIzq(alumno);
	}
	
	public void listar() {
	for (int i = 0; i < alumnos.size; i++) {
		System.out.println(alumnos.get(i).toString());
		}
	}

}
