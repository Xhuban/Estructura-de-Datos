package tareas.tarea3;

import java.util.Arrays;

public class Arreglo<T> {

	private int tamanio;
	private Object[] elementos;

	public Arreglo(int tamanio) {
		this.tamanio = tamanio;
		this.elementos = new Object[tamanio];
	}

	public int getLongitud() {
		return this.tamanio;
	}

	public void setElemento(int indice, T valor) {
		this.elementos[indice] = valor;
	}

	public Object getElemento(int indice) {
		return this.elementos[indice];
	}

	public void limpiar(T valor) {
		for (int i = 0; i < tamanio; i++) {
			elementos[i] = valor;
		}
	}
	
	@Override
	public String toString() {
		return Arrays.toString(elementos);
	}
	
}
