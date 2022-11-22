package tareas.tarea8;

public class ColaPrioridadAcotada<T> {
	private Arreglo<Cola> colaCentral;
	private int prioridadMasBaja;

	public ColaPrioridadAcotada(int niveles) {
		this.colaCentral = new Arreglo(niveles);
		this.prioridadMasBaja = niveles;
		for (int i = 0; i < this.prioridadMasBaja; i++) {
			this.colaCentral.setElemento(i, new Cola<T>());
		}
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
		int contador = 0;
		for (int i = 0; i < this.prioridadMasBaja; i++) {
			contador += this.colaCentral.getElemento(i).longitud();
		}
		return contador;
	}

	public void enqueue(int prioridad, T elemento) {
		this.colaCentral.getElemento(prioridad).enqueue(elemento);
	}

	public T dequeue() {
		T elemento = null;
		if (this.estaVacia() == false) {
			for (int i = 0; i < this.prioridadMasBaja; i++) {
				if (this.colaCentral.getElemento(i).estaVacia() == false) {
					elemento = (T) this.colaCentral.getElemento(i).dequeue();
					break;
				}
			}
		}
		return elemento;
	}

	@Override
	public String toString() {
		String estado = "";
		for (int i = 0; i < this.prioridadMasBaja; i++) {
			if (this.colaCentral.getElemento(i).estaVacia() == false) {
				estado += this.colaCentral.getElemento(i).toString();
				if (i != this.prioridadMasBaja-1) {
					estado += ", ";
				}
			}
		}

		return estado;
	}

}
