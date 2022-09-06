package tareas.tarea1;

import java.io.*;

public class NominaADT {
	private String nombreCompania;
	private Arreglo <Trabajador> empleados;
	private String rutaArchivo;
	
	public NominaADT() {
		
	}
	
	public NominaADT(String rutaArchivo) throws IOException {
		this.rutaArchivo = rutaArchivo;
		
		DataInputStream entrada1 = new DataInputStream(new FileInputStream(this.rutaArchivo));
		
		String linea;
		int tamanio=0;
		
		while ((linea = entrada1.readLine()) != null) {
			tamanio = tamanio+1;
		}
		
		entrada1.close();
		
		DataInputStream entrada2 = new DataInputStream(new FileInputStream(this.rutaArchivo));
		
		int numTrab, horasExt, anioIng;
		String nombre, paterno, materno;
		double sueldoBase;
		
		Arreglo<String> datos = new Arreglo(7);
		
		entrada2.readLine();
			
		for(int i=0;i<tamanio-1;i++) {
			numTrab = Integer.parseInt(entrada2.readLine().split(",")[0]);
			nombre = entrada2.readLine().split(",")[1];
			paterno = entrada2.readLine().split(",")[2];
			materno = entrada2.readLine().split(",")[3];
			horasExt = Integer.parseInt(entrada2.readLine().split(",")[4]);
			sueldoBase = Double.parseDouble(entrada2.readLine().split(",")[5]);
			anioIng = Integer.parseInt(entrada2.readLine().split(",")[6]);
			
			this.empleados.setElemento(i,new Trabajador(numTrab,nombre,paterno,materno,horasExt,sueldoBase,anioIng));
			
		}
		
		
	}
	
}
