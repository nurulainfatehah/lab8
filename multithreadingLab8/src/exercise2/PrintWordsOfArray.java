package exercise2;

import java.util.Random;

public class PrintWordsOfArray implements Runnable{

	String[] arrOfWords = {"It", "is", "recommended", "to", "use", "Calender", "class"};
	
	
	public void arrayWordPrinter(String currentThread) {
		
		
		if(currentThread.equals("text")) {
			
			displayPortions(currentThread);
			
		}else {
			
			displayRandomly(currentThread);
		}
		
	}
	
	public void displayRandomly(String currentThread) {
		
		for(int i = 0; i < 10; i++) {
			Random generator = new Random();
			int randomIndex = generator.nextInt(arrOfWords.length);
			
			System.out.println(">> Name of Thread: " + currentThread +  "\n");
			System.out.println(">> Word randomly picked from array is: " + arrOfWords[randomIndex] + "\n");
		}
		
	}
	
	
	public void displayPortions(String currentThread) {
		
		StringBuffer sb = new StringBuffer();
		String str = "";
		int counter = 0;
		
		for(int i = 0; i < arrOfWords.length; i++) {
			sb.append(arrOfWords[i]);
			str = sb.toString();
			
		}
		
		for(int i = 0; i < 10; i++) {
			
			counter++;
			String strExtracted = str.substring(0, i+1);
			
			System.out.println("> Name of Thread: " + currentThread +  "\n" );
			System.out.println("> Portion of words extracted as in iterator " + counter + ": " + strExtracted + "\n");
			
			
		}
		
		
	}
	
	@Override
	public void run() {
		
		Thread currentThread = Thread.currentThread();
		
	
		arrayWordPrinter( currentThread.getName());
		
	}
}
