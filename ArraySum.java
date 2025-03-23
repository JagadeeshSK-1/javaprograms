package newbeginning;

public class ArraySum {

	public static void main(String[] args) {
		int [] myArray = { 1,5, 12,24,2};
		int sum = 0;
		int i;
		
	for(i=0; i<myArray.length; i++) {
		sum+=myArray[i];
	}
		System.out.println("The sum is: "+sum);
	}

}
