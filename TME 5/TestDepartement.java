public class TestDepartement{
	public static void main(String []args){
		Departement d1=new Departement(1);
		System.out.println(d1.getPlaque());
		for(int i=0;i<15000;i++){
			Departement d2= new Departement(1);
			System.out.println(d2.getPlaque());
		}
		
	}
}
