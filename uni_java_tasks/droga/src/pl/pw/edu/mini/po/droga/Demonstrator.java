package pl.pw.edu.mini.po.droga;

import pl.pw.edu.mini.po.droga.jezdnia.*;

public class Demonstrator {

	public static void main(String[] args) throws NieobslugiwanaSzerokoscException {
	        Jezdnia jezdnia = new Jezdnia(20, "Lepiszczow", 1050);
	        jezdnia.generujAuta(1);
	        jezdnia.print();
	
	}

}
