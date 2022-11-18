package tareas.tarea6;

public class TestPila {
	public static void main(String[] args) {
		Pila cartas = new Pila(5);
		
		System.out.println(cartas.estaVacia());
		cartas.push("As de treboles");
		cartas.push("Reina de picas");
		cartas.push("3 de diamantes");
		cartas.push("As de diamantes");
		
		System.out.println(cartas.estaVacia());
		System.out.println(cartas.longitud());
		System.out.println(cartas.toString()+"\n");
		
		System.out.println(cartas.pop()+"\n");
		System.out.println(cartas.longitud());
		System.out.println(cartas.toString()+"\n");
		System.out.println(cartas.peek()+"\n");
		
		System.out.println(cartas.estaLlena());
		cartas.push("Rey de corazones");
		cartas.push("6 de picas");
		System.out.println(cartas.estaLlena());
		
	}
}
