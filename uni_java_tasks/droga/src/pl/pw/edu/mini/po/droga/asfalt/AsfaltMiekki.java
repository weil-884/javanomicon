package pl.pw.edu.mini.po.droga.asfalt;

public class AsfaltMiekki extends Asfalt {

	public AsfaltMiekki(double temperatura) {
		super("100/150",temperatura,100);
	}

	
	@Override
	public void runOver(double masa) {
		double bwe = this.getBazowaWysokosc();
		this.setAktualnaWysokosc(bwe - (Math.sqrt(1/(bwe + 1)*masa*this.getTemperatura()))/100);
		
	}

	@Override
	public String toString() {
		return "-" + this.getAktualnaWysokosc() + "-";
	}
}
