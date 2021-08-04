package tuesdayTask2;

@FunctionalInterface
public interface SomeInterface {
   void printSomething(String a);
   
   default void me() {
	   System.out.println("I can be in a functional Interface cause I am default");
   }
   
   static void me2() {
	   System.out.println("I can also be in functional Interface cause I am static" );
   }
}
