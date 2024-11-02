package hn.uth.repository;

import hn.uth.data.AlumnosResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface DatabaseRepository {

	@Headers({
	    "Accept: application/vnd.github.v3.full+json",
	    "User-Agent: sistema-matricula"
	})
	@GET("/pls/apex/ingenieria_uth/appmatricula/alumnos")
	Call<AlumnosResponse> obtenerAlumnos();
}
