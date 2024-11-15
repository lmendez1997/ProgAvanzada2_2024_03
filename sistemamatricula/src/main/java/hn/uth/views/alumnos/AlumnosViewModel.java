package hn.uth.views.alumnos;

import java.util.List;

import hn.uth.data.Alumno;

public interface AlumnosViewModel {

	void mostrarAlumnosEnGrid(List<Alumno> items);
	void mostrarMensajeError(String mensaje);
	void mostrarMensajeExito(String mensaje);
}
