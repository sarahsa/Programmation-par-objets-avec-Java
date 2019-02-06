public class Coureur{
	private int nuDossard;
	private double tempsAu100;
	private boolean aLeTemoin;
	public Coureur (int dossard){
		nuDossard=dossard;
		tempsAu100=Math.random()*4+12;
		aLeTemoin=false;
	}
	public Coureur(){
		this((int)(Math.random()*999+1));
	}
	public int getNuDossard(){
		return nuDossard;
	}
	public double getTempsAu100(){
		return tempsAu100;
	}
	public boolean getALeTemoin(){
		return aLeTemoin;
	}
	public void setALeTemoin(boolean b){
		aLeTemoin=b;
	}
	public String toString(){
		return "Coureur"+nuDossard+"tempsAu100:"+tempsAu100+"s au 100m aLeTemoin: "+aLeTemoin;
	}

	public void passeTemoin(Coureur c){
		System.out.println("moi coureur "+nuDossard+", je passe le temoin au coureur "+c.nuDossard);
		aLeTemoin=false;
		c.aLeTemoin=true;
	}
	public void courir(){
		System.out.println("je suis le coureur "+nuDossard+" et je cours");
	}
}

		
