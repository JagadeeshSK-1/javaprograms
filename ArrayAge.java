//Create a program that calculate the average of different ages:

package newbeginning;

public class ArrayAge {

	public static void main(String[] args) {
		int ages[] = {20, 22, 42, 32, 15, 13};
		float avg, sum=0;
		
		int length = ages.length;
		for (int ages1 : ages) {
			sum+=ages1;
		}
		avg = sum/length;
		System.out.println("The average age is: " +avg);
		
		
	}

}
