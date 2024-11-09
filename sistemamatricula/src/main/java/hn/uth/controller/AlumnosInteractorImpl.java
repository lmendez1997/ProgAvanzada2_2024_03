package hn.uth.controller;

import hn.uth.data.AlumnosResponse;
import hn.uth.repository.DatabaseRepositoryImpl;
import hn.uth.views.alumnos.AlumnosViewModel;

public class AlumnosInteractorImpl implements AlumnosInteractor{
	
	private DatabaseRepositoryImpl modelo;
	private AlumnosViewModel vista;

	public AlumnosInteractorImpl(AlumnosViewModel vista) {
		super();
		this.vista = vista;
		this.modelo = DatabaseRepositoryImpl.getInstance("https://apex.oracle.com", 3000L);
	}


	@Override
	public void consultarAlumnos() {
		try {
			AlumnosResponse respuesta = this.modelo.consultarAlumnos();
			if(respuesta == null || respuesta.getCount() == 0 || respuesta.getItems() == null) {
				this.vista.mostrarMensajeError("No hay alumnos disponibles");
			}else {
				this.vista.mostrarAlumnosEnGrid(respuesta.getItems());
			}
		}catch(Exception error) {
			error.printStackTrace();
		}
	}

}
