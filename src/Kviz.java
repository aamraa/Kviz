import java.util.Scanner;
public class Kviz {
static Scanner input = new Scanner (System.in);

	public double zbir(double a, double b) {
		return 0;
	}

	public void razlika(double a, double b) {
		System.out.println("Koliko iznosi: " + a + "-" + b + "?");
		int odgovor=input.nextInt();
		if(odgovor==(a-b))
		System.out.println("Odlicno! Vas odgovor je tacan!");
		else
			System.out.println("Nazalost, pogrijesili ste!");

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


