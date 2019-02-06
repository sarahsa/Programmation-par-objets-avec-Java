public class TestLettre{
	public static void main (String [] args){
		for(char c='a';c<='z';c++){
			Lettre l=new Lettre(c);
			System.out.println(l.getCodeAscii()+"\n");
		}
		for(char c='a';c<='z';c++){
			Lettre l=new Lettre(c);
			System.out.print(c+" ");
			if ((l.getCodeAscii()-96)%5==0){
				System.out.print("\n");
			}
		}
	}
}


      
