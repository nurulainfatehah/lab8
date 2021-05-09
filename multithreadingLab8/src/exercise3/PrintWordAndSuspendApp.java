package exercise3;



public class PrintWordAndSuspendApp {
	public static void main(String[] args) {
		
	
	Runnable numberPrinter1 = new PrintWordAndSuspend();
	Runnable numberPrinter2 = new PrintWordAndSuspend();
	Runnable numberPrinter3 = new PrintWordAndSuspend();
	

	Thread displayPartions = new Thread(numberPrinter1, "text");
	Thread displayRandomA = new Thread(numberPrinter2);
	displayRandomA.setName("word1");
	Thread displayRandomB = new Thread(numberPrinter3, "word2");
	


	displayPartions.start();
	displayRandomA.start();
	displayRandomB.start();

	}

}