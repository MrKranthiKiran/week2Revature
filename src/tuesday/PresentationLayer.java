package tuesday;

public class PresentationLayer {
	
	public static void main(String[] args) {
		BusinessLayer b = new BusinessLayer();
		
		try {
			b.divide(1);
		} catch(ArithmeticException e) {
			System.out.println("Cannot Divide with zero ");
		}
		
		try {
			b.something("s");
		} catch(ClassNotFoundException e) {
			System.out.println("Some exception occured");
		} finally {
			System.out.println("Done some exception handling");
		}
		
	
	}

}
