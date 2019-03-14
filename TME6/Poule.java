public class Poule extends Animal{
  private static int counter;
  private int id;

  public Poule(int posX, int posY){
    super(posX, posY, "p");
    id = counter;
    counter ++;
  }
  public String toString(){
    return String.format("p%02d", id);
  }
  public void afficher(){
    System.out.println("Type: "+this.animalType+"\nPosition: x= "+this.posX+" y= "+this.posY+"\nid= "+this.id);
  }
}
