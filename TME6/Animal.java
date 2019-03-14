public class Animal{
  protected int posX, posY;
  protected String animalType;

  public Animal(int posX, int posY, String animalType){
    this.posX = posX;
    this.posY = posY;
    this.animalType = animalType;
  }
  public int getPosX(){
    return posX;
  }
  public int getPosY(){
    return posY;
  }
  public String getAnimalType(){
    return animalType;
  }
  public double distance(Animal a){
    return Math.sqrt(Math.pow(this.posX - a.posX,2) + Math.pow(this.posY - a.posY,2));
  }
  public void move(int i, int j){
    this.posX += i;
    this.posY += j;
  }
  public void move(Animal a){

  }
}
