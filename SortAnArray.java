package newbeginning;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		String[] cars = {"volvo", "BMW", "Ford", "Toyota"};
		Arrays.sort(cars);
		for (String i : cars) {
			System.out.println(i);
		}
	}

}
