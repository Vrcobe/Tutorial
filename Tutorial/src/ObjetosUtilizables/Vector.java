package ObjetosUtilizables;

import java.util.ArrayList;

public class Vector {
	private ArrayList<Float> vector;

	public Vector() {
		super();
		this.vector = new ArrayList<>();
	}
	public void anyadirComponente(Float componente) {
		vector.add(componente);
	}
	
	public void mostrarVectorConCorchetes() {
		System.out.println(vector);
	}
	public void mostrarVectorComoUnaMatriz() {
		String devolver = "   | ";
		for ( Float i : vector) {
			devolver += i + " ";
		}
		devolver += "|";
		System.out.println(devolver);
	}
	public void anyadirComponente(ArrayList<Float> componente) {
		vector.addAll(vector.size(), componente);
	}

}
