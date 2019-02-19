public class TestEquipeVillageois{
  public static void main(String[] args){
    Villageois mbappe = new Villageois("Mbappe");
    Villageois cavani = new Villageois("Cavani");
    Villageois neymar = new Villageois("Neymar");
    Equipe PSG = new Equipe("PSG");
    PSG.embaucher(mbappe);
    PSG.embaucher(cavani);
    PSG.embaucher(neymar);
    System.out.println(PSG.toString());


    if(PSG.poidsSouleve()>150){
      System.out.println("Roucher souleve");
    }else{
      System.out.println("Roucher pas souleve");
    }


    Villageois lacazette = new Villageois("Lacazette");
    Villageois koscielny = new Villageois("Koscielny");
    Villageois mustafi = new Villageois("Mustafi");
    Equipe Arsenal = new Equipe("Arsenal");
    Arsenal.embaucher(lacazette);
    Arsenal.embaucher(koscielny);
    Arsenal.embaucher(mustafi);
    System.out.println(Arsenal.toString());


    if(Arsenal.poidsSouleve()>150){
      System.out.println("Roucher souleve");
    }else{
      System.out.println("Roucher pas souleve");
    }
  }

}
