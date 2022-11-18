package tareas.tarea6;

import java.util.ArrayList;

public class Pila<T> {
	private Arreglo<T> datos;
	private int tope;

	public Pila() {
		this.datos = new Arreglo(0);
	}

	public Pila(int tope) {
		this.datos = new Arreglo(tope);
		this.tope = tope;
	}

	public boolean estaVacia() {
		boolean estado;
		if (this.longitud() == 0) {
			estado = true;
		} else {
			estado = false;
		}
		return estado;
	}

	public int longitud() {
		int contador;
		for (contador = 0; contador < tope; contador++) {
			if (this.datos.getElemento(contador) == null) {
				break;
			}
		}

		return contador;

	}

	public T pop() {
		T dato = this.datos.getElemento(this.longitud() - 1);
		Arreglo<T> auxiliar = new Arreglo(this.tope);

		for (int i = 0; i < this.longitud() - 1; i++) {
			auxiliar.setElemento(i, this.datos.getElemento(i));
		}

		this.datos = auxiliar;

		return dato;
	}

	public void push(T dato) {
		if (this.tope == 0) {
			this.datos.añadirElemento(dato);
		} else {
			if (this.estaLlena() == false) {
				this.datos.setElemento(this.longitud(), dato);
			} else {
				System.out.println("Esta pila no puede aceptar más datos debido a que ha alcanzado su límite de "
						+ this.longitud() + " elementos");
			}
		}
	}

	public T peek() {
		T dato = this.datos.getElemento(this.longitud() - 1);

		return dato;
	}

	public boolean estaLlena() {
		boolean estado;
		if (this.longitud() == this.tope) {
			estado = true;
		} else if (this.tope==0){
			estado = false;
			System.out.println("No es posible saber si esta pila está llena porque no tiene un tope asignado");
		} else {
			estado = false;
		}

		return estado;
	}

	@Override
	public String toString() {
		String estado = "";
		for (int i = this.longitud() - 1; i >= 0; i--) {
			estado += this.datos.getElemento(i);
			if (i != 0) {
				estado += "\n";
			}
		}
		return estado;
	}

}
