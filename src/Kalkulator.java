package vjezba;

public class Kalkulator {

		public double mnozenje(double a, double b) {
			
			return a * b;
		}
		public  double dijeljenje(double a, double b) {
			return a / b;
		}
		public  double korjenovanje(double broj1) {
			return Math.sqrt(broj1);
		}
			public  double kvadriranje(double broj1) {
				return Math.pow(broj1, 2);
			}

			public  double Oduzimanje(double broj1 , double broj2) {
				double razlika = broj1 -  broj2;
				System.out.println("Razlika dva broja je " + razlika);
				return razlika;
			}
			public  double Sabiranje (double broj1 , double broj2) {
				double zbir = broj1 + broj2;
				System.out.println("Zbir brojeva je " + zbir);
				
				return zbir ;
			}
}
