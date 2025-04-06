package pl.pw.edu.mini.po.droga.asfalt;

public class AsfaltScieralny extends Asfalt {

	public AsfaltScieralny(double temperatura) {
		super("50/70", temperatura, 80);
	
	}

	@Override
	public void runOver(double masa) {
		double bwe = this.getBazowaWysokosc();
		this.setAktualnaWysokosc(bwe - (Math.sqrt(1/(bwe + 1)*masa*this.getTemperatura()))/7000);
		
	}

	@Override
	public String toString() {
		return "{" + this.getAktualnaWysokosc() + "}";
	}

}
