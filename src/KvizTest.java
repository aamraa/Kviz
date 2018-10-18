
public class KvizTest {

	public static void main(String[] args) {
		int randomBroj1 = (int) (Math.random()*10);
		int randomBroj2 = (int) (Math.random()*10);
		
		
		int izbor = (int)(Math.random()*6);
		Kviz kviz = new Kviz(randomBroj1, randomBroj2);
		
		switch (izbor) {
		case 0: kviz.Sabiranje();
		break;
		case 1: kviz.Oduzimanje();
		break;
		case 2: kviz.Mnozenje();
		break;
		case 3: kviz.Dijeljenje();
		break;
		case 4: kviz.Kvadriranje();
		break;
		case 5: kviz.Korjenovanje();
		break;
		}

	}

}
