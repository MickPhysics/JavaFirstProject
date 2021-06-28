package view;
// classi responsabili di input e output. Simula l'interfaccia grafica. Solo qui si usano i Sys out.

import java.util.Scanner;
import model.Persona;

public class GestoreIO {
	
	// prende un valore da scanner e lo ritorna
	public String getStringa(String messaggio) {
		Scanner input = new Scanner(System.in);
		System.out.println(messaggio);
		return input.nextLine();
	}
	
	public int getIntero(String messaggio) {
		Scanner input = new Scanner(System.in);
		System.out.println(messaggio);
		return Integer.parseInt(input.nextLine());
	}
	
	public void outputPersona(Persona p) {
		System.out.println(p);	
	}

}
