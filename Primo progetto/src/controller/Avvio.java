package controller;
// La controller è quella che contiene il main e si comporta come un programma procedurale.

import model.*;

// Vantaggi OOP: dividere in componenti il codice rispetto al procedurale, ho tante classi. facilità di correzione, riutilizzo, meno tempo di sviluppo.
// Codice molto più ordinato

// Ereditarietà: ad esempio Persona e Dipendente hanno attributi e metodi simili. Voglio evitare ridondanze.

// Incapsulamento: proprietà che definisce la visibilità dei costrutti, private, public, default e protected.

// Polimorfismo dei metodi: 
////overload: dichiarare metodi con stesso nome ma firma diversa. Il compilatore capisce da solo quale usare in base a gli argomenti dati.
////override: Sente l'ereditarietà, sovrascrittura di un metodo a patto che sia ereditato. La versione sovrascritta nella nuova classe ha la priorità. 
////Segnalare sempre un override. Con super si può sovrascrivere un override solo per gli attributi in più che ci servono nella classe figlia.

// Polimorfismo degli oggetti: sente l'ereditarietà. Ho delle tecniche di conversione dei riferimenti.
//upcasting: un oggetto di tipo dipendente può essere upcastato in un oggetto più generico di tipo persona.
//downcasting: un oggetto di tipo persona può essere downcastato in un oggetto più specifico di tipo dipendente.


//import view.GestoreIO;

// Classe client
public class Avvio {

	public static void main(String[] args) {
		
//		// Costruttore di default
//		GestoreIO g = new GestoreIO();
//		
//		Persona p1 = new Persona("Michelangelo", "Mazzitelli", 25);
//		
//		Persona p2 = new Persona("Francesca", "Mazzitelli", 22);
//		
//		Persona p3 = new Persona();
//		p3.setNome("Bruno");
//		p3.setCognome("Casellari");
//		p3.setEta(33);
//		
//		Persona p4 = new Persona();
//		p4.setNome("Carla");
//		p4.setCognome("Bruni");
//		p4.setEta(33);
//		
//		Persona p5 = new Persona(g.getStringa("Inserisci nome"), 
//									g.getStringa("Inserisci cognome"), 
//									g.getIntero("Inserisci età"));
//		g.outputPersona(p5);
//		
//		System.out.println(p1.toString());
//		System.out.println(p2.toString());
//		System.out.println(p3); // ho una chiamata di default del toString.
//		System.out.println(p4.getNome()+" "+p4.getCognome()+" "+p4.getEta());
		
		// passaggio per valore: quello che accade nel metodo rimane nel metodo, devo avere un return
		// Passaggio per riferimento: uso gli indirizzi di memoria, posso lavorare anche con i void per fare ad esempio uno swap
		
//		Studente s1 = new Studente("Mario","Rossi",18);
//		Studente s2 = new Studente("Pippo","Baudo",18);
//		Studente s3 = new Studente("Mimmo","Ercontadino",18);
//		Studente.setScuola("ITIS Galvani");
//		System.out.println(s1.getNome()+" "+s1.getCognome()+" "+Studente.getScuola());
//		System.out.println(s2.getNome()+" "+s2.getCognome()+" "+Studente.getScuola());
//		System.out.println(s3.getNome()+" "+s3.getCognome()+" "+Studente.getScuola());
//		
//		int id=1;
//		Studente[] scuola = {s1,s2,s3};
//		for(int i=0; i<scuola.length; i++) {
//			Studente.setId(id++);
//			System.out.println(Studente.getId()+" "+scuola[i].getNome()+" "+scuola[i].getCognome()+" "+Studente.getScuola());
//			 
//		}
		
		Persona p = new Persona("Pino","Mauro",25);
		System.out.println(p.getNome()+" "+p.getCognome());
		
		Dipendente d = new Dipendente("Michelangelo","Mazzitelli",25,2000.99);
		System.out.println(d.getNome()+" "+d.getCognome()+" "+d.getEta()+" "+d.getStipendio());
		
		if(d instanceof Dipendente) {
			System.out.println("Il riferimento è ad un dipendente");
		}
		else{
			System.out.println("è una persona qualsiasi");
		}
		

	}

}
