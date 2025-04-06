package pl.pw.edu.mini.po.droga.asfalt;

import java.util.Random;

public abstract class Asfalt {

	protected static final Random random = new Random(); 
	
	private String nazwa;
	private double bazowaWysokosc;
	private double aktualnaWysokosc;
	private double temperatura;
	
	public Asfalt(String nazwa, double temperatura, int bazowaWysokosc) {
        this.nazwa = nazwa;
        this.bazowaWysokosc = bazowaWysokosc;
        this.aktualnaWysokosc = bazowaWysokosc;
        this.temperatura = temperatura;
    }
    
    public abstract void runOver(double masa);
    
    @Override
    public abstract String toString();

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public double getAktualnaWysokosc() {
		return aktualnaWysokosc;
	}

	public void setAktualnaWysokosc(double aktualnaWysokosc) {
		this.aktualnaWysokosc = aktualnaWysokosc;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	public double getBazowaWysokosc() {
		return bazowaWysokosc;
	}
	
}
