package newbeginning;

public class Overloading {
	int myMethod (int x) {
		return 0;
	}
	float myMethod (float x) {
		return 0;
	}
	double myMethod(double x, double y) {
		return 0;
	}
	
	static int plusMethodInt (int x, int y) {
		return x+y;
	}
	
	static int plusMethodDouble (double x, double y) {
		return (int) (x+y);
	}
	public static void main(String[] args) {
		int myNum1 = plusMethodInt(6, 7);
		double myNum2 = plusMethodDouble(1.2, 2.2);
		System.out.println("int: " +myNum1);
		System.out.println("double: " +myNum2);

		// TODO Auto-generated method stub

	}

}
