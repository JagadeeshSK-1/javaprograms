//Print all the array element

package newbeginning;

public class ArrayElement {

	public static void main(String[] args) {
		String myStr = "jagdeesh";
		char[] myArray = myStr.toCharArray();
		
		for (char i : myArray) {
			System.out.println(i);
		}
	}

}
