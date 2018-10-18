
public class Kviz {

	public double zbir(double a, double b) {
		a = (double) Math.random()*11;
		b = (double) Math.random()*11;
		double saberi = a + b ;
		return saberi;
	}

	public double razlika(double a, double b) {
		return 0;
	}

	public double proizvod(double a, double b) {
		return 0;
	}

	public double vratiDijeljenje(double a, double b) {
		if (b == 0) {
			System.out.println("Greska.");
			return 0;
		} else
			return a / b;

	}

	public double vratiKorijen(double a) {
		return 0;
	}

	public double vratiKvadrat(double a) {
		return 0;
	}

	
}


