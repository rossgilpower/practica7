package practica7;

public class ChefRobot1 extends ChefRobot implements Funciones {
	public boolean acco = false;
	public boolean acci;
	public ChefRobot1() {
		super();
	}
	public String Cortarcarne() {
		acco = true;
		return ("Apoyo uno >>"+ nombre +" << Trabajando... >>");
	}
	public String Picarverdura() {
		acco = true;
		return ("Apoyo uno >> "+ nombre +" << Trabajando... >>");
	}
	public String cocinar() {
		acco = true;
		return (" Apoyo uno >> "+ nombre +" << Acción no permitida...No corresponde a mis funciones>>");
	}
	public String Servir() {
		acco = true;
		return ("Apoyo uno >> "+ nombre +"  << Acción no permitida...No corresponde a mis funciones>>");
	}
	public String Calentar() {
		acco = true;
		return ("Apoyo uno >> "+ nombre +"  << Acción no permitida...No corresponde a mis funciones>>");
	}
}
