public class MethodsInJava{
	
	public static int add(int numberOne, int numberTwo){
		return numberOne + numberTwo;

	}
	public static int add(double numberOne, int numberTwo){
		return (int) numberOne + numberTwo;

	}
	public static int add(int numberOne, double numberTwo){
		return numberOne + (int)numberTwo;

	}
	public static int add(double numberOne, double numberTwo){
		return int(numberOne + numberTwo);
	}
}