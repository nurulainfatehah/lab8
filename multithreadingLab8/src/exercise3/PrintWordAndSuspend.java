package exercise3;

import java.util.Random;

public class PrintWordAndSuspend implements Runnable {

String[] arrOfWords = {"It", "is", "recommended", "to", "use", "Calender", "class"};
	
	
	public void arrayWordPrinter(String currentThread) {
		
		
		if(currentThread.equals("text")) {
			
			displayPortions(currentThread);
			
		}else {
			
			displayRandomly(currentThread);
		}
		
	}
	
	public void displayRandomly(String currentThread) {
		if(currentThread.equals("word1")) {
		
			try {
				System.out.println("> Object word1 is running\n");
				System.out.println("> Object word1 is about to be suspended for 5 seconds\n");
				Thread.sleep(5000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
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
