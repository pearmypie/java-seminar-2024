package eu.ase.lab7;

@FunctionalInterface // Annotation useful for IDE: only ONE abstract method!
public interface BinaryOperation {
	public int operate(int operand1, int operand2);
}
