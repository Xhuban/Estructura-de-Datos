package tareas.tarea7;

public class TestCola {
	public static void main(String[] args) {
		Cola filaRestaurante = new Cola();

		System.out.println(filaRestaurante.estaVacia());

		filaRestaurante.enqueue("Pepe Rodriguez");
		filaRestaurante.enqueue("Mariana Alvarez");
		filaRestaurante.enqueue("Angel Mendoza");
		System.out.println(filaRestaurante.longitud());
		System.out.println(filaRestaurante.toString());
		System.out.println(filaRestaurante.estaVacia());

		filaRestaurante.dequeue();
		System.out.println(filaRestaurante.longitud());
		System.out.println(filaRestaurante.toString());
	}

}
