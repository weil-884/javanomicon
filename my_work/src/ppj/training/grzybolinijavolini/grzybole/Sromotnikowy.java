package ppj.training.grzybolinijavolini.grzybole;

public class Sromotnikowy extends GrzybTrujacy{

	public Sromotnikowy() {
		super(25, 75);
		
		Toksyny toksyna = this.getMasaOwocnika() < 50 ? Toksyny.ZABOJCZE : Toksyny.WYJATKOWO_ZABOJCZE;
		this.setToksyny(toksyna);
	}

	@Override
	public boolean isTrujacy() {
		return true;
	}

}
