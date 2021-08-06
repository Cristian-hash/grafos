package Periodo3Trabajo4;


public class ListLinked<T> {
	protected Node<T> primero;
	
	public ListLinked() {
		this.primero=null;
	}
	
	boolean isEmpty() {
		return this.primero==null;
	}
	
	public T busqueda (T data) {
		Node<T> nodo=this.primero;
		while(nodo != null&& !nodo.data.equals(data))
			nodo=nodo.getNext();
		if(nodo !=null)
			return nodo.data;
		return null;
			
	}
	

}
