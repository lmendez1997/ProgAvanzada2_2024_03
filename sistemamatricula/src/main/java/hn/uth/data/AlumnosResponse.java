package hn.uth.data;

import java.util.List;

public class AlumnosResponse {
	private List<Alumno> items;
	private int count;
	
	public List<Alumno> getItems() {
		return items;
	}
	public void setItems(List<Alumno> items) {
		this.items = items;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
