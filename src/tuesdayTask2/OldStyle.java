package tuesdayTask2;

public class OldStyle implements Interface1 {
   
	@Override
	public void printName() {
		System.out.println("Hello I am first one");
	}
	
	public static void main(String[] args) {
		Interface1 i1 = new OldStyle();
		i1.printName();
		
		Interface1 i2 = new Interface1() {
			
			@Override
			public void printName() {
				// TODO Auto-generated method stub
				System.out.println("I am next within anonymous class");
			}
			
//		
		};
		i2.printName();
			
		Interface1 i3 = new OldStyle();
		i3.printName();
		
		Interface1 i4 = new Interface1() {
			
			@Override
			public void printName() {
				// TODO Auto-generated method stub
				System.out.println(2*2);
			}
		};
		
		i4.printName();
		}
	
	
	}

