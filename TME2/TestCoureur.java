public class TestCoureur{
	public static void main(String[] args){
		Coureur c1= new Coureur ();
		Coureur c2= new Coureur ();
		Coureur c3= new Coureur ();
		Coureur c4= new Coureur (157);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		System.out.println(c4.getNuDossard());
		System.out.println(c1.getTempsAu100());
		System.out.println(c2.getALeTemoin());
		c2.setALeTemoin(true);
		System.out.println(c2.getALeTemoin());

		//question 6
		c1.courir();
		c1.passeTemoin(c2);
		c2.courir();
		c2.passeTemoin(c3);
		c3.courir();
		c3.passeTemoin(c4);
		c4.courir();
		double tempsTotal=c1.getTempsAu100()+c2.getTempsAu100()+c3.getTempsAu100()+c4.getTempsAu100();
		System.out.println("Temps total="+tempsTotal);
		
		
	}
}

