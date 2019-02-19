import java.util.ArrayList;

public class Equipe{
  private String name;
  private Villageois[] table;
  private int noVillageois;

  public Equipe(String name){
    this.name = name;
    table = new Villageois[20];
    noVillageois = 0;
  }
  public void embaucher (Villageois v){
    if (noVillageois < 20) {
      table[noVillageois] = v;
      noVillageois++;
      //System.out.println("noVillageois: "+noVillageois);
    } else{
      System.out.println("The list is full! ");
    }
  }

  public double poidsSouleve(){
    double poidsTotal = 0;
    for (int i=0; i< table.length; i++) {
      if (table[i]!= null) {
        poidsTotal+=table[i].getPoids();
      }
    }
    return poidsTotal;
  }

  public String toString(){
    String s="";
    for (int i = 0; i<table.length; i++){
      if (table[i]!= null) {
        s += table[i].toString()+"\n";
      }
    }
    s += "Lequipe souleve un poids total de "+poidsSouleve()+"KG";
    return s;
  }
}
