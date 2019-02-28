public class Terrain{
	private int taille;
	private Case[][] terrain;
	
	public Terrain(int t){
		taille = t;
		terrain = new Case [t][t];
		for(int i = 0; i< taille; i++){
			for(int j= 0; j< taille; j++){
				terrain[i][j]=new Case();
				if (Math.random()<0.05){
					Mouton m = new Mouton();
					terrain[i][j].setMouton(m);
				}
			}
		}
	}
	public String toString(){
		String s= "";
		for(int i = 0; i< taille; i++){
			for(int j= 0; j< taille; j++){
				s+=terrain[i][j].toString();
			}
			s+= "\n";
		}
		return s;
	}
}
