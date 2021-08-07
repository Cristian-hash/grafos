package Periodo3Trabajo4;

public class ListLinked<T> {
	public Node<T> primero;

	public ListLinked() {
		this.primero = null;
	}

	boolean isEmpty() {
		return this.primero == null;
	}

	public T busqueda(T data) {
		Node<T> nodo = this.primero;
		while (nodo != null && !nodo.data.equals(data))
			nodo = nodo.getNext();
		if (nodo != null)
			return nodo.data;
		return null;
	}

	public void insertar(T data) {
		this.primero = new Node<T>(data, this.primero);
	}
	public T remover(T data) {
		T item = null;
		Node<T> aux = this.primero;
		if (this.primero != null && this.primero.data.equals(data)) {
			item = primero.data;
			primero = primero.next;
		} else {
			while (aux.next != null && !aux.next.data.equals(data))
				aux = aux.getNext();
			if (aux.getNext() != null) {
				item = aux.next.data;
				aux.next = aux.next.next;
			}
		}
		return item;
	}
	public String toString() {
		String cadena = " ";
		Node<T> aux = this.primero;
		while (aux != null) {
			cadena = cadena + aux.getData();
			aux = aux.getNext();
		}
		return cadena;
	}

	
	
	
	

}
