package pl.pw.edu.mini.po.droga.jezdnia;

import java.util.Random;

import pl.pw.edu.mini.po.droga.asfalt.*;
import pl.pw.edu.mini.po.droga.pojazdy.*;

public class Jezdnia {
	
	protected static final Random random = new Random();
	
	private Asfalt[][] jezdnia;
	private int szerokosc;
    private double temperatura;
    
    
    
    public Jezdnia(int szerokosc, String typ, double temperatura) throws NieobslugiwanaSzerokoscException {
    	
        if (szerokosc < 20 || szerokosc > 50) {
            throw new NieobslugiwanaSzerokoscException();
        }
        
        this.szerokosc = szerokosc;
        this.temperatura = temperatura;
        jezdnia = new Asfalt[50][szerokosc];
        
        for (int i = 0; i < jezdnia.length; i++) {
            for (int j = 0; j < jezdnia[0].length; j++) {
                switch (typ) {
                    case "Twardy":
                        jezdnia[i][j] = new AsfaltTwardy(this.temperatura);
                        break;
                    case "Scieralny":
                        jezdnia[i][j] = new AsfaltScieralny(this.temperatura);
                        break;
                    case "Lepiszczow":
                        int los = random.nextInt(1);
                        jezdnia[i][j] = los == 0 ? new AsfaltBardzoMiekki(this.temperatura) : new AsfaltMiekki(this.temperatura);
                        break;
                }
            }
        }
        
    }
    
    public void print() {
        for (Asfalt[] rzad : jezdnia) {
            for (Asfalt asfalt : rzad) {
                System.out.print(asfalt.toString() + " ");
            }
            System.out.println();
        }
    }

	public Asfalt[][] getJezdnia() {
		return jezdnia;
	}
    
	
	private Pojazd losujRodzajPojazdu() {
		Pojazd result;

		switch (random.nextInt(2)) {
		case 0:
			result = new SamochodOsobowy(this);
			break;
		default:
			result = new SamochodCiezarowy(this);
		}

		return result;
		
	}
	
	
	
	public void generujAuta(int n) {
	
		for (int i = 0; i < n; i++) {
			Pojazd iTyPrzejazd = this.losujRodzajPojazdu();
			int indeks = random.nextInt(iTyPrzejazd.getSzerokoscOsi(),this.szerokosc);
			
			iTyPrzejazd.go(indeks);
		}
		
	}
}
