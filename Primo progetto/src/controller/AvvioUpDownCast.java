package controller;
import model.Persona;
import model.Dipendente;
public class AvvioUpDownCast {

	public static void main(String[] args) {
		
//		Persona p = new Persona("Mario","Rossi"); //downcasting
//		((Dipendente)p).setStipendio(2000.99);
		
		Dipendente d =  new Dipendente("Michelangelo","Mazzitelli");
		individuaIstanza(d);
		
		//Persona d = (Persona) new Dipendente();	// upcasting
	}



public static void individuaIstanza(Persona p) {
	if(p instanceof Dipendente)
		System.out.println("Istanza dipendente");
	else
		System.out.println("Istanza persona");
}
}