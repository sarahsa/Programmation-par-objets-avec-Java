public class Vipere extends Animal{
  private static int counter;
  private int id;

  public Vipere(int posX, int posY){
    super(posX, posY, "v");
    id = counter;
    counter ++;
  }
  public String toString(){
    return String.format("v%02d", id);
  }
  public void afficher(){
    System.out.println("Type: "+this.animalType+"\nPosition: x= "+this.posX+" y= "+this.posY+"\nid= "+this.id);
  }

}
