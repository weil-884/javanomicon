package pl.pw.edu.mini.po.droga.asfalt;

public class AsfaltTwardy extends Asfalt {

	public AsfaltTwardy(double temperatura) {
		super("20/30", temperatura, 60);
	}
	
	@Override
	public void runOver(double masa) {
		double bwe = this.getBazowaWysokosc();
		this.setAktualnaWysokosc(bwe - (Math.sqrt(1/(bwe + 1)*masa*this.getTemperatura()))/10000);
		
	}

	@Override
	public String toString() {
		return "[" + this.getAktualnaWysokosc() + "]";
	}
	
}
