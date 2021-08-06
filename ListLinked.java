package Periodo3Trabajo4;


public class ListLinked<T> {
	public Node<T> primero;
	
	public ListLinked() {
		this.primero=null;
	}
	
	boolean isEmpty() {
		return this.primero==null;
	}
	

}
