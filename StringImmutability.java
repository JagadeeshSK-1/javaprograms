//Write a java program to prove the strings are immutable in java.

package newbeginning;

public class StringImmutability {

	public static void main(String[] args) {
		String originalString = "Hello";
		String modifiedString = originalString.concat("World");
		System.out.println("original string: " +originalString);
		System.out.println("original string: " +modifiedString);
		
		if (originalString.equals("Hello")) {
			System.out.println("The original String remains unchanged, proving immutable. ");
			
		}else {
			System.out.println("The original string has changed.");
		}

	}

}
