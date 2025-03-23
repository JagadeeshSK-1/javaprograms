package newbeginning;

public class CountNumber {

	public static void main(String[] args) {
		String words = "one, Two, Three, Four";
		int countWords =words.split("\s").length;
		System.out.println(countWords);
	}

}
