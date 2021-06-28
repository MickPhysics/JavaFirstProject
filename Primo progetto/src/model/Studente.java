package model;

public class Studente extends Persona {
	
	
	//Variabili di classe
	private static String scuola;
	private static int id;
	

	

	public static void setScuola(String scuola) {
		Studente.scuola = scuola; // non uso il this, ma la classe perchè non è una variabile di istanza, ma un attributo statico.
	}
	public static String getScuola() {
		return scuola;
	}
	

	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Studente.id = id;
	}
	
	public Studente() {}
	public Studente(String nome, String cognome, int eta) {
		super(nome, cognome, eta); // Modo per passare i parametri dal costr parametrizzato presente nella superclasse Persona
	}
	
	
	

}
