public class TestEmplacement{
	public static void main(String [] args){
		Emplacement e = new Emplacement("Coline");
		Carte c = new Carte("Sarah");
		e.poser(c);
		System.out.println(e.toString());
		e.enlever(); 
		System.out.println(e.toString());
	}
}
