package practicaConGit;

import java.util.Scanner;

public class PracticaConGit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca su nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Introduzca su apellido: ");
		String apellido = sc.nextLine();
		
		System.out.println(nombre);
		System.out.println(apellido);

	}

}
