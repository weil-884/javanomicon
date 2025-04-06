package pl.pw.edu.mini.po.droga.pojazdy;

import pl.pw.edu.mini.po.droga.jezdnia.Jezdnia;

public class SamochodOsobowy extends PojazdRzeczywisty {
	 public SamochodOsobowy(Jezdnia jezdnia) {
	        super(jezdnia, 1000 + random.nextInt(501), 4, 2);
	    }

}
