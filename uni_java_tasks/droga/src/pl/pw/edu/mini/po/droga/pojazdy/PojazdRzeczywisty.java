package pl.pw.edu.mini.po.droga.pojazdy;

import pl.pw.edu.mini.po.droga.jezdnia.Jezdnia;

public class PojazdRzeczywisty extends Pojazd{

	public PojazdRzeczywisty(Jezdnia jezdnia, double masa, int liczbaKol, int szerokoscOsi) {
		super(jezdnia, masa, liczbaKol, szerokoscOsi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void go(int lewyIndeks) {

		int zaburzenie = random.nextInt(-1,1);
		if (random.nextInt(10) == 0) {
		
		super.go(lewyIndeks + zaburzenie);}
		else {super.go(lewyIndeks);}
	}

	
	

}
