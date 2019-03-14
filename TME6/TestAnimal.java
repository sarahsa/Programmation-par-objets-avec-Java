public class TestAnimal{
  public static void main(String[] args){
    Poule p1 = new Poule(0,0);
    Poule p2 = new Poule(2,3);
    Renard r1 = new Renard(4,5);
    Renard r2 = new Renard(4,4);
    Vipere v1 = new Vipere(7,7);
    Vipere v2 = new Vipere(6,6);
    p1.afficher();
    p2.afficher();
    p1.move(4,4);
    p1.afficher();
    r1.afficher();
    r2.afficher();
    r2.move(2,2);
    r2.afficher();
    v1.afficher();
    v2.afficher();
  }
}
