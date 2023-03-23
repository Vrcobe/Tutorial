package ObjetosUtilizables;

import java.util.ArrayList;

import OperacionesAritmeticasParaObjetos.Multiplicable;

public class Matriz {
	private int filas = 0;
	private int columnas = 0;
	private ArrayList<Integer> arrayInts  ;
	private ArrayList<Vector> matriz ;
	



//	public Matriz(int filas, int columnas, ArrayList<Integer>[] arrayInts[], ArrayList<ArrayList<Integer>>[] matriz[]) {
//		super();
//		this.filas = filas;
//		this.columnas = columnas;
//		this.arrayInts = arrayInts[];
//		this.matriz = matriz[];
//	}
	

	public Matriz() {
		this.matriz = new ArrayList<>();
	}
	

//	/** En este constructor, se introducen el numero de filas y de columnas y un array por filas de los ints que
//	 *  se quiere introducir en cada posición, se devuelve una matriz que consta de dos arrayList formando la matriz deseada
//	 * @param filas numero de filas de la matriz a construir
//	 * @param columnas	numero de colmunas de la matriz a construir
//	 * @param arrayInts	lista de los ints que se quieren introducir en la lista
//	 */
//	public Matriz(int filas, int columnas, ArrayList<Integer>[] arrayInts) {
//		super();
//		this.filas = filas;
//		this.columnas = columnas;
//		this.arrayInts = arrayInts;
//		this.matriz
//	}



	public int getFilas() {
		return filas;
	}


	public void setFilas(int filas) {
		this.filas = filas;
	}


	public int getColumnas() {
		return columnas;
	}


	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}


	public boolean multiplicable(Matriz matriz) {
		if(this.columnas == matriz.filas) {
			return true;
		}
		return false;
	}
	public void anyadirFila(Vector vector) {
		matriz.add(vector);
	}
	
//	public void Multiplicar(Matriz matriz) {
//		for(int i=0;i<this.filas;i++){
//			int NuevaPosicion = 0;
//			for(int j = 0;this.columnas>j;j++){
//				NuevaPosicion = 
//			}
//		}
//		
//	}

	public void mostrarMatriz() {
		for(Vector i : matriz) {
			i.mostrarVectorComoUnaMatriz();
		}
	}
	
	
	
}


