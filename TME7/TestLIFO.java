public class TestLIFO{
	public static void main (String[] args){
		ListeLIFO l= new ListeLIFO();
		l.push(1);
		l.push(2);
		l.push(3);
		System.out.println(l.toString());
		l.pop();
		System.out.println(l.toString());
		l.push(4);
		System.out.println(l.toString());
		l.pop();
		l.pop();
		System.out.println(l.toString());
	}
}
