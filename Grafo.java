package GRAFO;

public class Grafo<T extends Comparable<T>> {
	class Node {

		public Node nodoPadre;
		public int ordenGrafo;
		public T info;

		public Node(T info, Node nodoPadre, int ordenGrafo) {
			this.info = info;
			this.nodoPadre = nodoPadre;
			this.ordenGrafo = ordenGrafo;
		}

		public String toString() {
			String imp = (this.nodoPadre == null) ? "-" : nodoPadre.info.toString();
			return info.toString() + "\t" + imp + "\t" + this.ordenGrafo;
		}
	}

	class Cola {

	}

	public T[] lista;
	public int[][] listaAdyacencia;
	public int cantidad = 0, total;
	public static Integer a = Integer.MAX_VALUE;

	public Grafo(int n) {
		lista = (T[]) new Comparable[n];
		listaAdyacencia = new int[n][n];
		total = n;

		listaV();
	}

	private void listaV() {
		for (int i = 0; i < total; i++)
			for (int u = 0; u < total; u++)
				listaAdyacencia[i][u] = a;
	}

	public boolean lleno() {
		return cantidad == total;
	}

	public void insert(T info) {
		if (this.lleno()) {
			System.out.println("Lleno");
		} else {
			this.lista[cantidad] = info;
			this.cantidad++;
		}
	}

	public void arista(T primero, T segundo) {
		this.arista(primero, segundo, 1, true);
	}

	public void arista(T primero, T segundo, int p) {
		this.arista(primero, segundo, p, false);
	}

	private void arista(T primero, T segundo, int p, boolean both) {
		int primeraposicion, segundaposicion;
		primeraposicion = sacarP(primero);
		segundaposicion = sacarP(segundo);

		if (primeraposicion == -1 || segundaposicion == -1) {
			System.out.println("Incorrecto");
		} else {
			this.listaAdyacencia[primeraposicion][segundaposicion] = p;
			if (both)
				this.listaAdyacencia[segundaposicion][primeraposicion] = p;
		}
	}

	private int sacarP(T data) {

		for (int i = 0; i < this.cantidad; i++) {
			if (lista[i].compareTo(data) == 0)
				return i;
		}
		return -1;
	}

	public String imp() {
		String impresion = "\nLista de Adyacencia\n\t";

		for (int i = 0; i < this.total; i++) {
			impresion += this.lista[i] + "\t";
		}
		impresion += "\n";

		for (int i = 0; i < this.total; i++) {
			impresion += lista[i] + "\t";
			for (int u = 0; u < this.total; u++) {
				impresion += ((this.listaAdyacencia[i][u] == a) ? "inf" : this.listaAdyacencia[i][u]) + "\t";
			}
			impresion += "\n";
		}
		return impresion;
	}

}