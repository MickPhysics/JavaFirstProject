package model;
// Le classi astratte non permettono di dichiarare oggetti, ma solo metodi, deve essercene almeno uno astratto, che DEVE essere ereditato dalle classi figlie
// per subire override, altrimenti è inutile. Esempio area figura 2D per poi specializzarsi in triangolo.
public abstract class Figura2D {
	
	private double base;
	private double altezza;
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public abstract void calcolaArea(double base, double altezza);
	
	public Figura2D() {}
	public Figura2D(double base, double altezza) {
		super();
		this.base=base;
		this.altezza=altezza;	
	}

}
