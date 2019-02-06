public class SuiteNewton{
	public double calcule(int x,double epsilon){
		double u0= x/2;
		double u1=(u0+x/u0)/2;
		while ((u1-u0)>epsilon){
			double u2=u1;
			u1=(u0+x/u0)/2;
			u0=u2;
		}
		return u1;
	}
	
} 
