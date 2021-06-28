package model;

public class Dipendente extends Persona {
	
	private double stipendio;

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
	public Dipendente() {
		
	}
	
	public Dipendente(String nome, String cognome) {
		super(nome, cognome); // Modo per passare i parametri dal costr parametrizzato presente nella superclasse Persona
		
	}
	
	public Dipendente(String nome, String cognome,int eta) {
		super(nome, cognome, eta); // Modo per passare i parametri dal costr parametrizzato presente nella superclasse Persona
		
	}

	
	public Dipendente(String nome, String cognome,int eta, double stipendio) {
		super(nome, cognome, eta); // Modo per passare i parametri dal costr parametrizzato presente nella superclasse Persona
		this.stipendio=stipendio;
		
	}

}
