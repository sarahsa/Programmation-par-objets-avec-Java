public class TestJeu{
	public static void main(String [] args){
		Jeu j = new Jeu();
		j.melanger(100);
		int n = (int)(Math.random()*2);
		System.out.println(j.choisir(n));

			
	}
}
