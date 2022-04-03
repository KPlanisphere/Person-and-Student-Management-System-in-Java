//--------> Principal

import java.util.Scanner;

class Principal{
	
	public static void main(String[] args){
		TAlumno personas[];
		int n,edad;
		String nombre,curp,carrera,matricula,correo;
		Scanner sc1 = new Scanner(System.in); //NUMEROS
		Scanner sc2 = new Scanner(System.in); //CADENAS
		
		System.out.println("Lista de alumnos Programacion II");
		System.out.print("Cuantos datos deseas ingresar: ");
		n = sc1.nextInt();
		personas = new TAlumno[n];
		
		System.out.println("Ingresa los datos:");
		
		for(int i=0; i<n ; i++){
			System.out.print("Dame el dato del alumno " + (i+1) + ": ");
			nombre = sc2.nextLine();
			System.out.print("Dame la edad del alumno " + (i+1) + ": ");
			edad = sc1.nextInt();
			System.out.print("Dame el CURP del alumno " + (i+1) + ": ");
			curp = sc2.nextLine();
			System.out.print("Dame la matricula del alumno " + (i+1) + ": ");
			matricula = sc2.nextLine();
			System.out.print("Dame la carrera del alumno " + (i+1) + ": ");
			carrera = sc2.nextLine();
			System.out.print("Dame el correo del alumno " + (i+1) + ": ");
			correo = sc2.nextLine();
			personas[i] = new TAlumno(nombre,edad,curp,matricula,carrera,correo);
			System.out.println();
			
		}
		
		System.out.println("\nLa lista de alumnos es:");
		for(int i=0;i<n;i++){
			System.out.println(personas[i].toString());
		}
	}//FIN MAIN
	
}//FIN CLASE Principal
