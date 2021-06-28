package pack2;

import pack1.Dipendente;

public class Manager extends Dipendente {

	public static void test() { // svincolo la chiamata del metodo
		Dipendente d = new Dipendente();
		Manager m = new Manager();
		System.out.println(d.pubblico);
		System.out.println(m.protetto);
	}
}
