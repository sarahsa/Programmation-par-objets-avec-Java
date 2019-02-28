public class Departement{
	private int numDepartement;
	private static char lettre1='A';
	private static char lettre2='A';
	private static int cpt=0;
	private int num;
	public Departement(int numDepartement){
		this.numDepartement=numDepartement;
		if(cpt==999){
			cpt=1;
			num=1;
			if(lettre2=='Z'){
				lettre1+=1;
				lettre2='A';
			}else{
				lettre2+=1;
			}
		}else{
			cpt++;
			num=cpt;
		}
	}
	public String getPlaque(){
		
		return num+" "+lettre1+lettre2+" "+numDepartement;
	}
		

}
