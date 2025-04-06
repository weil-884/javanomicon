package pl.pw.edu.mini.po.droga.pojazdy;

import pl.pw.edu.mini.po.droga.jezdnia.Jezdnia;

public class SamochodCiezarowy extends PojazdRzeczywisty {
	 public SamochodCiezarowy(Jezdnia jezdnia) {
	        super(jezdnia, 8000 + random.nextInt(4001), 8, 3);
	    }
}
