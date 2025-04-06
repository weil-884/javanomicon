package pl.pw.edu.mini.po.droga.jezdnia;

public class NieobslugiwanaSzerokoscException extends Exception {

	private static final long serialVersionUID = -3143876275000083372L;

	public NieobslugiwanaSzerokoscException() {
		super("Metoda obsluguje wartosci z przedzialy <-20; 50>.");
	}

}
