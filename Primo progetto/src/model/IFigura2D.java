package model;
// interfaccia, si avvale di soli metodi astratti, non è una classe a tutti gli effetti. non ammette variabili. Voglio solo un elenco di metodi da implementare.
// Ho l'obbligo di sovrascrivere dei metodi che magari sono importanti
// Una classe figlia non può avere più superclassi da estendere, invece le interfacce lo rendono possibile. Non ho un limite di ereditarietà. Una classe può ereditare
// più  interfacce (si dice implementare). Anche un interfaccia può estendere più interfacce.
public interface IFigura2D {
	public void calcolaArea(double base, double altezza); // non serve dire che è abstract

}
