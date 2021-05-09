package exercise1;

public class DateTimeNameMain {

	public static void main(String[] args) {
		Thread printDTN1 = new DateTimeName();
		Thread printDTN2 = new DateTimeName();

		printDTN1.setName("ObjectA");
		printDTN2.setName("ObjectB");
		
		
		printDTN1.start();
		printDTN2.start();

	}

}
