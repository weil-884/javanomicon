package ppj.training.grzybolinijavolini.las;

import java.util.Random;

import ppj.training.grzybolinijavolini.grzybole.*;

public class GeneratorLAsu {
	
	private static final Random random = new Random();
	
	private Grzyb[][] las;
	
	private static Grzyb generujGrzybola() {
		Grzyb result;
		
		switch(random.nextInt(4)) {
		case 0:
			result = new Sromotnikowy();
			break;
		case 1:
			result = new Cesarski();
			break;
		case 2:
			result = new Kolczastoglowy();
			break;
		default:
			result = new Szarawy();
			break;
		}
		return result;
	}
	
	public GeneratorLAsu(int x, int y) {
		int rozmiarX, rozmiarY;
		rozmiarX = x > 0 ? x : 100;
		rozmiarY = y > 0 ? y : 100;
		
		las = new Grzyb[rozmiarX][rozmiarY];
		
		int pusta = random.nextInt(rozmiarY);
		
		for (int i = 0; i < las.length; i++) {
			for (int j = 0; j < las[i].length; j++) {
				
				if (j == pusta) {continue;}
				
				switch(random.nextInt(5)) {
				case 0: las[i][j] = generujGrzybola();
				default: las[i][j] = null;
				}
				

			}
		}
		
	}
}
