import java.util.Scanner;
public class Kviz {

  int broj1;
	int broj2;
	
  Scanner input=new Scanner(System.in);
Kviz(){
			}

Kviz(int randomBroj1, int randomBroj2) {
			broj1 = randomBroj1;
			broj2 = randomBroj2;
		}

	public void Sabiranje() {
	}

	public void razlika(double broj1, double broj2) {
		System.out.println("Koliko iznosi: " + broj1 + "-" + broj2 + "?");
		int odgovor=input.nextInt();
		if(odgovor==(broj1 - broj2))
		System.out.println("Odlicno! Vas odgovor je tacan!");
		else
			System.out.println("Nazalost, pogrijesili ste!");

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
	
public void Korjenovanje() {
			System.out.println("Koliko iznosi: sqrt" + broj1 + "?");
			int odgovor=input.nextInt();
			if(odgovor==(Math.sqrt(broj1)))
			System.out.println("Odlicno! Vas odgovor je tacan!");
			else
				System.out.println("Nazalost, pogrijesili ste!");

		}

		public void Kvadriranje() {
			System.out.println("Koliko iznosi: " + broj1 + "*" + broj1 + "?");
			int odgovor=input.nextInt();
			if(odgovor==(Math.pow(broj1, 2)))
			System.out.println("Odlicno! Vas odgovor je tacan!");
			else
				System.out.println("Nazalost, pogrijesili ste!");
		}
	}


