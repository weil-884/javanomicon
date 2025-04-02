package ppj.training.grzybolinijavolini.grzybole;

public class Szarawy extends GrzybTrujacy{

	public Szarawy() {
		super(25,75);
		this.setToksyny(Toksyny.TRUJACE);
	}

	@Override
	public void ugotuj() {
		super.ugotuj();
		this.setToksyny(Toksyny.NIEOBECNE);
	}

	@Override
	public boolean isTrujacy() {
		if (this.getToksyny() == Toksyny.NIEOBECNE) {return false;}
		else {return true;}
	}

}
