public class TestVillageois{
	public static void main(String[] args){
		Villageois v1 = new Villageois("Sarah");
		Villageois v2 = new Villageois("Coline");
		Villageois v3 = new Villageois("Paris");
		Villageois v4 = new Villageois("Bergen");
		System.out.println(v1.toString()+"; "+v2.toString()+";"+v3.toString()+"; "+v4.toString()+"; ");
		double poidstotal= v1.poidsSouleve()+v2.poidsSouleve()+v3.poidsSouleve()+v4.poidsSouleve();
		if(poidstotal>=100){
			System.out.println("Rocher soulevé\n");
		}else{
			System.out.println("Rocher pas soulevé\n");
		}
	}
}
