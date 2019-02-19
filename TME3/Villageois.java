public class Villageois{
	private String nom;
	private double poids;
	private boolean malade;

	public Villageois(String nomVillageois){
		nom = nomVillageois;
		poids = Math.random()*100+50;
		if(Math.random() < 0.20){
			malade = true;
		}else{
			malade = false;
		}
	}
	public String getNom(){
		return nom;
	}
	public double getPoids(){
		return poids;
	}
	public boolean getMalade(){
		return malade;
	}
	public String toString(){
		return "Villageois: "+nom+", poids: "+poids+"kg, malade: "+malade+", poids souleve: "+poidsSouleve();
	}
	public double poidsSouleve(){
		if(malade){
			return poids/4;
		}else{
			return poids/3;
		}
	}
}
