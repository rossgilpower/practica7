package practica7;

import java.util.Scanner;

public class Main {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int opc,funcion,i=0;
		JefeRobotChef JRC = new JefeRobotChef();ChefRobot2 MCR2 = new ChefRobot2(); ChefRobot1 MCR1 = new ChefRobot1();
		do {
			System.out.println();
			System.out.println(" ---Menu---");
			System.out.println("1. Robot: Jefe ("+ JRC.getNombre()+")");
			System.out.println("2. Ayudante: Robot 1 ("+MCR1.getNombre()+")");
			System.out.println("3. Ayudante: Robot 2 ("+MCR2.getNombre()+")");
			System.out.println("4. Salir");
			System.out.println();
			opc = CapturaEntrada.capturarEntero("Introduce el robot");
			while(opc<=0 || opc >= 5);
			
				do {
					System.out.println();
					System.out.println(" ---Funciones del robot---");
					System.out.println("1. Cortar");
					System.out.println("2. Cocinar");
					System.out.println("3. Servir");
					funcion = CapturaEntrada.capturarEntero("Introduce la funcion a realizar del robot");
					}while(funcion >=4);
				
				
				switch(opc) {
				case 1:{
					switch(funcion) {
					case 1: {
						System.out.println(JRC.Cortarcarne());
						System.out.println(JRC.Picarverdura());
						JRC.setAccion(">>Ingredientes a utilizar<<");
						break;
					}
					case 2:{
						System.out.println(JRC.cocinar());
						JRC.setAccion(">>Cocinar<<");
						break;
					}
					case 3:{
						System.out.println(JRC.Servir());
						JRC.setAccion(">>Servir comida<<");
						break;
					}
						
				}
			}
			break;
				case 2:{
					switch(funcion) {
					case 1:{
						System.out.println(MCR1.Cortarcarne());
						System.out.println(MCR1.Picarverdura());
						MCR1.acci = true;
						MCR1.setAccion(">>Ingredientes a utilizar<<");
						MCR1.acco = true;
						break;
					}
					case 2:{
						System.out.println(MCR1.cocinar());
						MCR1.acci = false;
						System.out.println(">>Cocinar<<");
						MCR1.acco = true;
						break;
					}
					case 3: {
						System.out.println(MCR1.Servir());
						MCR1.acci = false;
						System.out.println(">>Servir comida<<");
						MCR1.acco = true;
						break;
					}
					
					}
					break;
				}
				case 3:{
					switch(funcion) {
					
					case 1:{
						System.out.println(MCR2.Cortarcarne());
						System.out.println(MCR2.Picarverdura());
						MCR2.acco = false;
						MCR2.setAccion(">>Ingredientes a utilizar<<");
						MCR2.acci = true;
						break;
					}
					case 2:{
						System.out.println(MCR2.cocinar());
						MCR2.acco = false;
						MCR2.setAccion(">>Cocinar<<");
						MCR2.acci = true;
						break;
					}
					case 3: {
						System.out.println(MCR2.Servir());
						MCR2.acco = false;
						MCR2.setAccion(">>Servir comida<<");
						MCR2.acci = true;
						break;
						}
					}
					break;
				}
			}
			i++;		
		}
		while(funcion!=3);
		
		if(MCR1.getAccion() == null && MCR2.getAccion() ==null) {
		System.out.println("<<Jefe chef completó la comida correctamente >>");	
		}
		else if(MCR1.getAccion() != null && MCR2.getAccion() == null) {if(MCR1.acci == true) {
				System.out.println("Genial! El plato estuvo exquisito");
			}
		else {
			System.out.println("Le falta sabor... Sigue practicando.");
		}
		}
		else if(MCR1.getAccion() == null && MCR2.getAccion() != null) {if(MCR2.acco == true) {
		System.out.println("Genial! El plato estuvo exquisito");	
		}
		else {
			System.out.println("Le falta sabor... Sigue practicando.");
		}
		}
		else if(MCR1.acci == true && MCR2.acco == true) {
			System.out.println("Genial! El plato estuvo exquisito");
		}
		else if((MCR1.acci == false && MCR2.acco == true) || (MCR1.acci == true && MCR2.acco == false)) {
		System.out.println("Genial! El plato estuvo exquisito");	
		}
		else if(MCR1.acci == false && MCR2.acco == false) {
			System.out.println("Le falta sabor... Sigue practicando.");
		}
		JRC.InfoRobots();
		MCR1.InfoRobots();
		MCR2.InfoRobots();
	}
	
	public static class CapturaEntrada {
		
		   public static int capturarEntero(String msg){
		        Scanner sc = new Scanner(System.in);System.out.println("" + msg+":");
		        return (sc.nextInt());
		    }
		    public static float CapturarFloat(String msg){
		        Scanner sc = new Scanner(System.in); System.out.println("" + msg+":");
		        return (sc.nextFloat());
		    }
		    public static String CapturarString(String msg){
		        Scanner sc = new Scanner(System.in);System.out.println("" + msg+ ":");
		        return (sc.nextLine());
		    }
	}

}

