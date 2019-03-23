public class ListeLIFO extends Liste {
	public ListeLIFO(){
		super();
	}
	public Object pop (){ return liste.remove(liste.size()-1);}
	public String toString(){
		return liste.toString();
	}
}
	

