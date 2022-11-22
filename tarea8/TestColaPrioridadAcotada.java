package tareas.tarea8;

public class TestColaPrioridadAcotada {
	public static void main(String[] args) {
		ColaPrioridadAcotada comidaRefrigerada = new ColaPrioridadAcotada<>(4);
		
		System.out.println(comidaRefrigerada.estaVacia());
		comidaRefrigerada.enqueue(3, "Pescado congelado");
		comidaRefrigerada.enqueue(3, "Carne congelada");
		comidaRefrigerada.enqueue(1, "Pollo sin congelar");
		comidaRefrigerada.enqueue(2, "Bote de helado(abierto)");
		comidaRefrigerada.enqueue(0, "Jarra de agua de limon");
		System.out.println(comidaRefrigerada.toString());
		System.out.println(comidaRefrigerada.longitud());
		System.out.println(comidaRefrigerada.estaVacia());
		
		System.out.println(comidaRefrigerada.dequeue());
		System.out.println(comidaRefrigerada.dequeue());
		System.out.println(comidaRefrigerada.toString());
		System.out.println(comidaRefrigerada.longitud());
	}
}
