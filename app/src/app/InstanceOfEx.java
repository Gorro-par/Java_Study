package app;

public class InstanceOfEx {
	public static void main(String[] args) {
		Child child = new Child();
		if(child instanceof Object) {
			System.out.println("child is instance of Object");
		} else if(child instanceof InferfaceA) {
			System.out.println("child is instance of Inferface");
		} else if(child instanceof Parent) {
			System.out.println("child is instance of Parent");
		} else if(child instanceof Child) {
			System.out.println("child is instance of Child");
		}
	}
}
interface InferfaceA{
	
}
class Parent implements InferfaceA{
	
}
class Child extends Parent{
	
}
