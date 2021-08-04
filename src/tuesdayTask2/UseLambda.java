package tuesdayTask2;

public class UseLambda {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Division d1 = (a,b)->System.out.println(a/b);
		
		d1.divide(6, 3);
		
		Division d2 = (a,b)->System.out.println(b/a);
		
		d2.divide(6, 3);
		
		
		SomeInterface s1 = (s)->System.out.println(s);
		s1.printSomething("this is something");
		s1.printSomething("This task is from tuesday that is 3rd July 2021");
        s1.me();
        
        SomeInterface.me2();
	}

}
