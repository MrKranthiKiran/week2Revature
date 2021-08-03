package tuesday;

public class BusinessLayer {

	public void divide(int a) throws ArithmeticException {
		
		float c = a/0;
		System.out.println(c);
		// TODO Auto-generated method stub

	}
	
	public void something(String s) throws ClassNotFoundException {
		if (s.equals("s")) {
			throw new ClassNotFoundException("dsfaf");
		}
		
		
	}

}
