package ppj.training.grzybolinijavolini.grzybole;

public abstract class GrzybTrujacy extends Grzyb {

	private Toksyny toksyny;
	
	protected GrzybTrujacy(int a, int b) {
		super(a,b);
	}

	public Toksyny getToksyny() {
		return toksyny;
	}

	public void setToksyny(Toksyny toksyny) {
		this.toksyny = toksyny;
	}
	
}
