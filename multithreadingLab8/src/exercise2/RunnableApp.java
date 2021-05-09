package exercise2;

public class RunnableApp {
	
	
	public static void main(String[] args) {
		Runnable numberPrinter1 = new PrintWordsOfArray();
		Runnable numberPrinter2 = new PrintWordsOfArray();
		

		Thread displayPartions = new Thread(numberPrinter1, "text");
		Thread displayRandom = new Thread(numberPrinter2);
		displayRandom.setName("word1");
		


		displayPartions.start();
		displayRandom.start();
	}

	
}
