package pack1;

public class Dipendente {

	//modificatori
	public String pubblico = "Sono pubblica"; // lo vedo sempre
	private String privato = "Sono privata"; // non lo vedo da nessuna parte
	String diDefault = "Sono di default"; // lo vedo solo nello stesso pack
	protected String protetto = "Sono protetta"; // visibile anche fuori dal pack ma solo alla classe figlia, solo se ereditato, non c'� bisogno
	//dell'ereditariet� se sono nello stesso pack.
	
	final int A = 10; // il final serve per non rendere modificabile qualcosa, se una classe � final non pu� essere ereditato e un metodo final non pu�
	// subire override.
	
}
