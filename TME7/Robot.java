public abstract class Robot{
	private static int cpt=0; 	
	protected int i,j;
	protected int id;

	public Robot(int i, int j){
		cpt++;
		id = cpt;
		this.i = i;
		this.j = j;
	}
	protected void move(int di, int dj){
		i += di;
		j += dj;
	}
	protected int getID(){
		return id;
	}
	
	
}
