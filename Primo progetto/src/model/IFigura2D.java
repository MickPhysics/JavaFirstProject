package model;
// interfaccia, si avvale di soli metodi astratti, non � una classe a tutti gli effetti. non ammette variabili. Voglio solo un elenco di metodi da implementare.
// Ho l'obbligo di sovrascrivere dei metodi che magari sono importanti
// Una classe figlia non pu� avere pi� superclassi da estendere, invece le interfacce lo rendono possibile. Non ho un limite di ereditariet�. Una classe pu� ereditare
// pi�  interfacce (si dice implementare). Anche un interfaccia pu� estendere pi� interfacce.
public interface IFigura2D {
	public void calcolaArea(double base, double altezza); // non serve dire che � abstract

}
