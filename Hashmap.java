//Loop through the items of a HashMap with a for-each loop.

package newbeginning;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String, String>capitalcities = new HashMap<String, String>();
		capitalcities.put("India", "NewDelhi");
		capitalcities.put("England", "Londan");
		capitalcities.put("Germany", "Berlin");
		capitalcities.put("Norway", "Olso");
		
		for (String i : capitalcities.values()) {
			System.out.println(i);
		}
	}

}
