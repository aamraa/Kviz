import java.util.Scanner;

public class Kviz {
	int broj1;
	int broj2;
	Scanner input=new Scanner(System.in);

	public double zbir(double a, double b) {
		return 0;
	}

	public double razlika(double a, double b) {
		return 0;
	}

	public void Mnozenje() {
		System.out.println("Koliko iznosi: " + broj1 + "*" + broj2 + "?");
		int odgovor=input.nextInt();
		if(odgovor==(broj1*broj2))
		System.out.println("Odlicno! Vas odgovor je tacan!");
		else
			System.out.println("Nazalost, pogrijesili ste!");
	}

	public void Dijeljenje() {
		System.out.println("Koliko iznosi: " + broj1 + "/" + broj2 + "?");
		int odgovor=input.nextInt();
		if(odgovor==(broj1/broj2))
		System.out.println("Odlicno! Vas odgovor je tacan!");
		else
			System.out.println("Nazalost, pogrijesili ste!");
	}
	
	public double vratiKorijen(double a) {
		return 0;
	}

	public double vratiKvadrat(double a) {
		return 0;
	}

	
}


