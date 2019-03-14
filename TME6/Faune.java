public class Faune{
  public static final int taille= 21;
  private int nbanimaux;
  private Animal[] tab;

  public Faune(int nbanimaux){
    this.nbanimaux = nbanimaux;
    tab = new Animal[nbanimaux];
    for (int i = 0; i<taille; i++) {
      switch(i%3){
        case 0: tab[i]=new Poule((int) (Math.random()*(taille-1)),(int) (Math.random()*(taille-1)));
          break;
        case 1: tab[i]=new Renard((int) (Math.random()*(taille-1)),(int) (Math.random()*(taille-1)));
          break;
        case 2: tab[i]=new Vipere((int) (Math.random()*(taille-1)),(int) (Math.random()*(taille-1)));
          break;
      }
    }
  }
  public String terrain(){
    String[][] ter = new String[taille][taille];
    String s= "";
    for (int i=0; i<taille; i++){
      for (int j=0;j<taille; j++){
        ter[i][j]=" . ";
      }
    }

    for (int i=0; i<nbanimaux; i++){
      ter[tab[i].getPosX()][tab[i].getPosY()]=tab[i].toString();
    }

    for (int i=0; i<taille; i++){
      s+= "|";
      for (int j=0;j<taille; j++){
        s+=ter[i][j];
      }
      s+= "|";
      s+="\n";
    }
    return s;
  }
  public int getIndiceAnimalLePlusProche(Animal requete){
    double dist_min=Double.POSITIVE_INFINITY;
    int index = -1;
    for (int i=0; i<tab.length; i++){
      if (tab[i]==requete || tab[i]==null){
        continue;
      }
      if (tab[i].distance(requete) < dist_min){
        dist_min = i;
      }
    }
      return (int) dist_min;
  }

  public void etatDeLaFaune(){
    for (int i=0; i<tab.length; i++){
      System.out.println(tab[getIndiceAnimalLePlusProche(tab[i])]);
    }
  }
  public Animal[] getTab(){
    return tab;
  }


}
