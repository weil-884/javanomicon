package pl.pw.edu.mini.po.droga.pojazdy;

import java.util.Random;

import pl.pw.edu.mini.po.droga.jezdnia.*;
import pl.pw.edu.mini.po.droga.asfalt.*;

public abstract class Pojazd {
	
	protected static final Random random = new Random();
	
	private Jezdnia jezdnia;
    private double masa;
    private int liczbaKol;
    private int szerokoscOsi;
    
    public Pojazd(Jezdnia jezdnia, double masa, int liczbaKol, int szerokoscOsi) {
    	this.jezdnia = jezdnia;
        this.masa = masa;
        this.liczbaKol = liczbaKol;
        this.szerokoscOsi = szerokoscOsi;
	    
	}
	
    
    public int getSzerokoscOsi() {
		return szerokoscOsi;
	}



	public void go(int lewyIndeks) {
        double masaNaKolo = masa / liczbaKol;
        Asfalt[][] powierzchnia = this.jezdnia.getJezdnia();
        
        for (int i = 0; i < 50; i++) {
            if (lewyIndeks >= 0 && lewyIndeks < powierzchnia[i].length) {
                powierzchnia[i][lewyIndeks].runOver(masaNaKolo);
            }
            if (lewyIndeks - szerokoscOsi >= 0 && lewyIndeks < powierzchnia[i].length) {
                powierzchnia[i][lewyIndeks - szerokoscOsi].runOver(masaNaKolo);
            }
        }
    }
}
