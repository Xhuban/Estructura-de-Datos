package tareas.tarea6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;

public class Arreglo<T> {

	private int tamanio;
	private ArrayList<T> elementos;

	public Arreglo(int tamanio) {
		this.tamanio = tamanio;
		this.elementos = new ArrayList<T>();
		for (int i = 0; i < this.tamanio; i++) {
			elementos.add(null);
		}
	}

	public int getLongitud() {
		return this.tamanio;
	}

	public void setElemento(int indice, T valor) {
		this.elementos.set(indice, valor);
	}

	public T getElemento(int indice) throws IndexOutOfBoundsException {
		return this.elementos.get(indice);
	}

	public void limpiar(T valor) {
		for (int i = 0; i < tamanio; i++) {
			elementos.set(i, valor);
		}
	}

	public void añadirElemento(T valor) {
		elementos.add(valor);
	}

	@Override
	public String toString() {
		String estado = "";
		for (T elemento : elementos) {
			if (elemento != null) {
				estado += elemento.toString() + " ";
			}
		}
		return estado;

	}

}
