package eu.ase.lab7;

public class Main {

	@FunctionalInterface
	public interface GreetingService {
		public void greet(String message);
	}
	
	public static void main(String[] args) {
		// Old Method (before Java 8)
		BinaryOperation operation = new Sum();
		int resultAddition = operation.operate(20, 14);
		System.out.println("The result is " + resultAddition + ".");
		
		// Anonymous Inner-class Method
		BinaryOperation operation2 = new BinaryOperation() {
			
			@Override
			public int operate(int operand1, int operand2) {
				
				return operand1 - operand2;
			}
		};
		int resultSubtraction = operation2.operate(59, 19);
		System.out.println("The result is " + resultSubtraction + ".");

		// Java 8 -> Lambda expressions + Functional interfaces
		// Anonymous method
		BinaryOperation multiplication = (int o1, int o2) -> o1 * o2; 
		int resultMultiplication = multiplication.operate(7, 8);
		System.out.println("The result is " + resultMultiplication + ".");
		
		BinaryOperation division = (o1, o2) -> {
			System.out.println("Division between " + o1 + " and " + o2 + ".");
			return o1 / o2;
		};
		int resultDivision = division.operate(355, 113);
		System.out.println("The result is " + resultDivision + ".");
		
		GreetingService gs1 = m -> System.out.println("Hello " + m);
		gs1.greet("World!");
		
		GreetingService gs2 = (msg) -> {
			System.out.println("Goodbye " + msg);
		};
		gs2.greet("Cruel World!");
	}

}
