package tareas.tarea1;

public class Trabajador {
	
	private int numTrabajador;
	private String nombre;
	private String paterno;
	private String materno;
	private int horasExtra;
	private double sueldoBase;
	private int anioIngreso;
	
	public static final double MONTO_H_EXTRA = 276.5;
	public static final double PRESTACION = 0.03;
	
	public Trabajador() {
		
	}
	
	public Trabajador(int numTrabajador, String nombre, String paterno, String materno, 
			int horasExtra, double sueldoBase, int anioIngreso) {
		this.numTrabajador=numTrabajador;
		this.nombre=nombre;
		this.paterno=paterno;
		this.materno=materno;
		this.horasExtra=horasExtra;
		this.sueldoBase=sueldoBase;
		this.anioIngreso=anioIngreso;
	}

	public int getNumTrabajador() {
		return numTrabajador;
	}

	public void setNumTrabajador(int numTrabajador) {
		this.numTrabajador = numTrabajador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}
	
	public double calcularSueldo() {
		double total = 0.0;
		total = (sueldoBase+(2022-this.anioIngreso)*PRESTACION)+(MONTO_H_EXTRA*this.horasExtra);
		return total;
	}
	
	@Override
	
	public String toString() {
		return "#=" + this.numTrabajador + "nombre=" + this.nombre + "paterno=" + this.paterno
				+ "materno=" + this.materno + "horasExtra=" + this.horasExtra + "sueldoBase=" 
				+ this.sueldoBase + "anioIngreso=" + this.anioIngreso; 
	}

}
