public class Jeu{
	private Emplacement gauche, milieu, droit;
	private Carte cible;
	public Jeu(){
		gauche = new Emplacement("gauche");
		milieu = new Emplacement("milieu");
		droit = new Emplacement("droit");
		Carte c1 = new Carte ("c1");
		Carte c2 = new Carte ("c2");
		Carte c3 = new Carte ("c3");
		cible = c1;
		gauche.poser(c1);
		milieu.poser(c2);
		droit.poser(c3);
	}
	public String toString(){
		return gauche.toString() + milieu.toString() + droit.toString() ;
	}
	public void echanger (Emplacement a, Emplacement b){
		Carte temp1= new Carte (a.getCarte().toString());
		Carte temp2= new Carte (b.getCarte().toString());
		a.enlever();
		a.poser(temp2);	
		b.enlever();
		b.poser(temp1);
	}
	public void echanger (int i,int j){
		if(i+j==1)
			echanger(gauche,milieu);
		if(i+j==2) 
			echanger(gauche,droit);
		if (i+j==3)
			echanger (droit,milieu);
	}
	public boolean choisir(Emplacement a){
		return (a.getCarte()==cible);
	}
	public boolean choisir (int i){
		if(i==0){ return gauche.getCarte()==cible;}
		if(i==1) {return milieu.getCarte()==cible;}
		if(i==2) {return droit.getCarte()==cible;}
		return false;
	}


	public void melanger(){
		int n1= (int)(Math.random()*2);
		int n2=(int)(Math.random()*2);
		echanger(n1,n2);
	}
	public void melanger (int n){
		for(int i=0;i<n;i++){
			melanger();
		}
	}
	


	
}
