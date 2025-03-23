//Create a program that finds the lowest age among different ages.

package newbeginning;

public class LowestAgeArray {

	public static void main(String[] args) {
		int ages[] = {20, 22, 42, 32, 15, 13, 25, 35};
		int lowestAge = ages[0];
		for (int ages1 : ages) {
			if (lowestAge>ages1) {
				lowestAge=ages1;
				System.out.println("The lowest age in the array is: "+lowestAge\
						);
				
			}
		}
		
	}

}
