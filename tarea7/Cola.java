package tareas.tarea7;

public class Cola<T> {
	private Arreglo<T> elementos;

	public Cola() {
		this.elementos = new Arreglo(0);
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
		return this.elementos.numElementos();
	}

	public void enqueue(T elemento) {
		this.elementos.añadirElemento(elemento);
	}

	public T dequeue() {
		T elemento = this.elementos.getElemento(0);
		Arreglo<T> auxiliar = new Arreglo(this.longitud() - 1);
		for (int i = 1; i < this.longitud(); i++) {
			auxiliar.setElemento(i - 1, this.elementos.getElemento(i));
		}

		this.elementos = auxiliar;

		return elemento;
	}

	@Override
	public String toString() {
		String estado = "";

		for (int i = 0; i < this.longitud(); i++) {
			estado += this.elementos.getElemento(i);
			if (i != this.longitud() - 1) {
				estado += ", ";
			}
		}

		return estado;
	}

}
