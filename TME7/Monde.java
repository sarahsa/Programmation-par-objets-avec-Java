public class Monde extends Robot{
	private int dimension;
	private ArrayList<Robot>() robots;
	private ListeLIFO[][] terrain;
	public Monde(ArrayList<Robot> r, int d){
		dimension=d;
		robots=r;
		for(int i=0; i<dimension ; i++ ) {
			for(int j=0; j< dimension ; j++){
				terrain[i][j]= new ListeLIFO();
				for(int k=0; k<=(int) Math.random()*2; k++){
					terrain[i][j].push(new PapierGras);
				}
			}
		}
	}
	public int getDim (){
		return dimension;
	}
}
