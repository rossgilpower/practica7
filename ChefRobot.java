package practica7;

public abstract class ChefRobot {
	public int nivelbateria;
	public String nombre;
	public int numeroSerie;
	private String accion;
	
	public ChefRobot() {
		setNombre(Main.CapturaEntrada.CapturarString("Introduce nombre del Robot "));
		setNivelbateria(Main.CapturaEntrada.capturarEntero("Introduce el nivel de bateria "));
		setNumeroSerie(Main.CapturaEntrada.capturarEntero("Introduce el numero de serie del robot "));
	}
	
	public void InfoRobots() {
		System.out.println();
		System.out.println("Nombre del Robot: "+ nombre);
		System.out.println();
		System.out.println("Nivel de bateria: "+ nivelbateria);
		System.out.println();
		System.out.println("Numero de serie: "+ numeroSerie);
	}
	public int getNivelbateria() {
		return nivelbateria;
	}
	public void setNivelbateria(int nivelbateria) {
		this.nivelbateria = nivelbateria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public String getAccion() {
		return accion;
	}
	public void setAccion(String accion) {
		this.accion = accion;
	}
	

}
