package ppj.training.grzybolinijavolini.grzybole;

import java.util.Random;

public abstract class Grzyb {
	
	private Twardosc twardosc;
	private double masaOwocnika;
	protected static final Random random = new Random();
	
	public void ugotuj() {
		this.setTwardosc(Twardosc.MIEKKI);
	};
	public boolean isTrujacy() {return false;};
	
	protected Grzyb(int dol, int gora ) {
		this.twardosc = Twardosc.values()[random.nextInt(Twardosc.values().length)];
		this.masaOwocnika = random.nextDouble(dol, gora);
		
	}
	public Twardosc getTwardosc() {
		return twardosc;
	}
	public void setTwardosc(Twardosc twardosc) {
		this.twardosc = twardosc;
	}
	public double getMasaOwocnika() {
		return masaOwocnika;
	}
	public void setMasaOwocnika(double masaOwocnika) {
		this.masaOwocnika = masaOwocnika;
	}
}
