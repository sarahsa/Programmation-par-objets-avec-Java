public class Emplacement{
	private Carte carte;
	//Carte vaut null quand il n'y a pas de carte posée;
	private String nom;
	
	public String toString(){
		return nom+":"+carte.toString();
	}
	public boolean EstVide(){
		if (carte == null) {
			return true;
		} return false;

	}
	public boolean poser(Carte carte){
		if (this.EstVide()){
			this.carte= carte;
			return true;
		} else {
			return false;
		}
	}
	public Carte enlever(){
		if (this.EstVide()== false){
			carte = null;
			return carte;
		} return null;
	}
	public Emplacement(String nom){
		this.nom = nom;
	}
	public Emplacement(String nom, Carte carte){
		this.nom = nom;
		this.carte = carte;
	}
	public Carte getCarte(){
		return carte;
	}
}
