package pl.pw.edu.mini.po.droga.asfalt;

public class AsfaltBardzoMiekki extends Asfalt{

	public AsfaltBardzoMiekki(double temperatura) {
		super("160/220", temperatura, 100);
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
