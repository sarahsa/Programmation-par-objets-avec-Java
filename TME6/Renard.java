public class Renard extends Animal{
  private static int counter;
  private int id;

  public Renard(int posX, int posY){
    super(posX, posY, "r");
    id = counter;
    counter ++;
  }
  public String toString(){
    return String.format("r%02d", id);
  }
  public void afficher(){
    System.out.println("Type: "+this.animalType+"\nPosition: x= "+this.posX+" y= "+this.posY+"\nid= "+this.id);
  }

}
