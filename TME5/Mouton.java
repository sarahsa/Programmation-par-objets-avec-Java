public class Mouton{
	private static int cpt=1;
	private int id;
	public Mouton(){
		id=cpt;
		cpt+=1;
	}
	public int getMoutonId(){
		return id;
	}
}
