package collezioni;
import java.util.*;
public class Collezione {
	
	public void getArrayList(){
		
		// politica FIFO First In First Out
		// esempio di lista
		// se voglio un array dinamico di interi devo usare la wrapper Integer e non Int, altrimenti non avrei riferimenti
		ArrayList<String> listaNominativi = new ArrayList<>();
		//CRUD 
		//1. Create/inserimento
		listaNominativi.add("Pino");
		listaNominativi.add("Pluto");
		listaNominativi.add("Pippo");
		
		//2.Read/lettura
		System.out.println("Originale");
		for(int i=0; i<listaNominativi.size(); i++) {
			System.out.println(listaNominativi.get(i));
		}
		
		//3. Update/modifica
		
		listaNominativi.set(1, "Topolino");
		
		//4. Delete/cancella
		
		listaNominativi.remove(0);
		
		System.out.println("Modificato");
//		for(int i=0; i<listaNominativi.size(); i++) {
//			System.out.println(listaNominativi.get(i));
//		}
		
		//ForEach
		for(String nominativoCorrente:listaNominativi) {
			System.out.println(nominativoCorrente);
		}
		
	}
	// LIFO: last in first out: posso aggiungere cose anche direttamente in testa
	//List/Queue
	public void getLinkedList() {
		LinkedList<String> listaNominativi = new LinkedList<>(Arrays.asList("Mirko","Gino","Amelia"));
		listaNominativi.addFirst("Ettore"); //pila, nuovo primo elemento
		listaNominativi.addLast("Giulio");
		listaNominativi.removeFirst();
		for(String elemento:listaNominativi) {
			System.out.println(elemento);
		}
		
	}
	
	//Set
	public void getHashSet() {
		HashSet<String> listaNominativi = new HashSet<>(Arrays.asList("Mirko","Gino","Amelia","Mirko","Carlo")); // elimina i doppioni, non tiene conto dell'ordine
		
		for(String elemento:listaNominativi) {
			System.out.println(elemento);
		}
	}
	
	//LinkedHashSet
	
		public void getLinkedHashSet() {
			LinkedHashSet<String> listaNominativi = new LinkedHashSet<>(Arrays.asList("Mirko","Gino","Amelia","Mirko","Carlo")); 
			// elimina i doppioni, tiene conto dell'ordine
			
			for(String elemento:listaNominativi) {
				System.out.println(elemento);
			}
		}
		
		//Mappa
		public void getHashMap() {
			//gruppo hash non tiene conto dell' ordine
			HashMap<String,String> mappa = new HashMap<>();
			mappa.put("Persona1", "Pino"); //chiave + valore
			mappa.put("Persona2", "Pippo");
			mappa.put("Persona3", "Pluto");
			
			
			for(String s:mappa.keySet()) { 
				System.out.println(s);
			}
			
			for(String v:mappa.values()) { 
				System.out.println(v);
			}

		}
		
		public void getLinkedHashMap() {
			//gruppo linkedhash tiene conto dell' ordine
			LinkedHashMap<String,String> mappa = new LinkedHashMap<>();
			mappa.put("Persona1", "Pino"); //chiave + valore
			mappa.put("Persona2", "Pippo");
			mappa.put("Persona3", "Pluto");
			
			System.out.println(mappa.get("Persona2"));
			
			for(String s:mappa.keySet()) { 
				System.out.println(s);
			}
			
			for(String v:mappa.values()) { 
				System.out.println(v);
			}

		}

}
