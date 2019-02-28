public class Case{
	private Mouton m;
	
	public Mouton getMouton(){
		return m;	
	}
	public void setMouton(Mouton m){
		this.m = m;
	}
	public String toString(){
		if(m==null)return ".";
		return String.format("%3d",m.getMoutonId());
	}
}
