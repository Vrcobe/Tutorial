package ObjetosUtilizables;

import java.util.ArrayList;

public class Prueba {
//	private Float arrayFloat[];
	public static void main(String[] args) {
		Vector vector = new  Vector();
		Vector v2 = new Vector();
		vector.anyadirComponente(4f);
		vector.anyadirComponente(1f);
		v2.anyadirComponente(5f);
		v2.anyadirComponente(0f);
		v2.mostrarVectorConCorchetes();
		vector.mostrarVectorConCorchetes();
		Matriz matriz = new Matriz() ;
		matriz.anyadirFila(vector);
		matriz.anyadirFila(v2);
		matriz.mostrarMatriz();
		
		/* Podemos añadir elemento a elemento en el vector pero tienen que ser floats
		vector.anyadirComponente(3f);
		vector.anyadirComponente(4f);
		vector.anyadirComponente(12f);
		vector.anyadirComponente(15f);
		vector.mostrarVectorConCorchetes();
		*/
		
	}
}
