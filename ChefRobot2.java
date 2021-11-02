package practica7;

public class ChefRobot2 extends ChefRobot implements Funciones{
	public boolean acci = false;
	public boolean acco;
	public ChefRobot2() {
		super();
	}
	public String Cortarcarne() {
		acci = true;
		return ("Apoyo 2 >> "+ nombre +"  << Acción no permitida...No corresponde a mis funciones>>");
	}
	public String Picarverdura() {
		acci = true;
		return ("Apoyo 2 >> "+ nombre +"  << Acción no permitida...No corresponde a mis funciones>>");
	}
	public String cocinar() {
		acci = true;
		return ("Apoyo 2 >> "+ nombre +" << Trabajando... >>");
	}
	public String Servir() {
		acci = true;
		return (" Apoyo 2 >> "+ nombre +"  << Acción no permitida...No corresponde a mis funciones>>");
	}
	public String Calentar() {
		acci = true;
		return ("Apoyo 2 >> "+ nombre +" << Trabajando... >>");
	}
}
