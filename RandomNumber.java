package newbeginning;

public class RandomNumber {

	public static void main(String[] args) {
		double duobleRandomNumber = Math.random()*5;
		System.out.println("duobleRandomNumber =" +duobleRandomNumber);
		int randomNumber = (int) duobleRandomNumber;
		System.out.println("randomNumber =" +randomNumber);
	}

}
