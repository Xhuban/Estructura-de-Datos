package tareas.tarea6;

import java.util.ArrayList;

public class Pila<T> {
	private Arreglo<T> datos;
	private int tope;
	
	public Pila(int tope) {
		this.datos = new Arreglo(tope);
		this.tope = tope;
	}
	
	public boolean estaVacia() {
		boolean estado;
		if (this.longitud()== 0) {
			estado = true;
		} else {
			estado = false;
		}
		 return estado;
	}
	
	public int longitud() {
		int contador = 0;
		for(int i=0;i<tope;i++) {
			if(this.datos.getElemento(i)==null) {
				break;
			} else {
				contador++;
			}
		}
		
		return contador;
		
	}
	
	public T pop() {
		T dato = this.datos.getElemento(this.longitud()-1);
		Arreglo<T> auxiliar = new Arreglo(this.tope);
		
		for(int i=0;i<this.longitud()-1;i++) {
			auxiliar.setElemento(i, this.datos.getElemento(i));
		}
		
		this.datos=auxiliar;
		
		return dato;
	}
	
	public void push(T dato) {
		if (this.estaLlena()==false) {
			this.datos.setElemento(this.longitud(), dato);
		} else {
			System.out.println("Esta pila no puede aceptar más datos debido a que ha alcanzado su límite de "+this.longitud()+" elementos");
		}
	}
	
	public T peek() {
		T dato = this.datos.getElemento(this.longitud()-1);
		
		return dato;
	}
	
	public boolean estaLlena() {
		boolean estado;
		if (this.longitud()==this.tope) {
			estado = true;
		} else {
			estado = false;
		}
		
		return estado;
	}
	
	@Override
	public String toString() {
		String estado = "";
		for (int i = this.longitud()-1; i>=0 ;i--) {
			estado += this.datos.getElemento(i);
			if(i!=0) {
				estado += "\n";
			}
		}
		return estado;
	}

}
