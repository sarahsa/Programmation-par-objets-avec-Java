import java.util.ArrayList;
public abstract class Liste{
	protected ArrayList<Object> liste;
	public Liste(){
		liste=new ArrayList<Object>();
	}
	public void push(Object o){
		liste.add(o);
	}
	public boolean isEmpty(){
		if (liste.size()== 0) return true;
		return false;
	}
	public int size(){
		return liste.size();
	}
	public String toString(){
		String s="";
		for(Object o:liste){
			s+=o+", ";
		}
		return s;
	}
}
