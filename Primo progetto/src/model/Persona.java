package model;
// le classi model sono classi di archiviazione di dati sensibili

// Classe server
public class Persona {
	
	//Variabili di istanza o non statiche
	private String nome;
	private String cognome;
	private int eta;
	
	//Modificatori static si riferiscono alle classi, se modifico un metodo come statico lo sto svincolando dall'utilizzo degli oggetti, posso usare
	//direttamente la classe. Rendo quell'attributo condiviso tra gli oggetti della classe, ogni oggetto di tipo persona ha il suo nome cognome ed età
	//invece un attributo statico non è esclusivo e non cambia per ogni oggetto, ma è lo stesso per tutti i metodi della classe.
	

	
	// setter invece di usare il costruttore parametrizzato
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	public void setCognome(String cognome) {
		this.cognome=cognome;
	}
	public void setEta(int eta) {
		this.eta=eta;
	}
	
	// Getter per estrarre i dati
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	public int getEta() {
		return eta;
	}

	//Costruttore: ce n'è uno di default, se ne faccio uno con lo stesso nome quello di default non viene creato
	
	//overload: posso dichiarare metodi con stesso nome ma con tipi di argomenti diversi. Quello che conta è il tipo di variabili locali dei metodi
	//Tra i due Java sceglie quello parametrizzato
	public Persona() {}
	// Costruttore parametrizzato
	public Persona(String nome, String cognome) {
		this.nome=nome; // this si usa quando gli argomenti e le variabili di istanza hanno lo stesso nome per far capire al compilatore quale sia uno e quale l'altro
		this.cognome=cognome;
	}
	
	
	public Persona(String nome, String cognome, int eta) {
		this.nome=nome; // this si usa quando gli argomenti e le variabili di istanza hanno lo stesso nome per far capire al compilatore quale sia uno e quale l'altro
		this.cognome=cognome;
		this.eta=eta;	
	}
	
	public String toString() {
		return nome+" "+cognome+" "+eta;
	}

}
