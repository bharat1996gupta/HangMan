package requesthandler;

import javabean.GameDictionary;

public class Logic
{
	private static String word = GameDictionary.getRandomWord().toUpperCase();
	private static char[] wordToGuess = inWordToGuess();
	private static int worngAttempts = 0;
	
	
	public static void checkCharInWord(char userCharater) 
	{
		int index = word.indexOf(userCharater);
		
		if(index == -1) 
		{
			worngAttempts++;
		}
		else
		{
			updateWordToGuess(userCharater);
		}
	}
	
	private static char[] inWordToGuess() 
	{	
		char[] guess = new char[word.length()];
		for(int i=0;i<word.length();i++) 
		{
			guess[i] = '_';
		}
		
		return guess;
	}
	
	private static void updateWordToGuess(char newChar) 
	{	
		char wordArr[] = word.toCharArray();
		
		for(int i=0;i<wordToGuess.length;i++) 
		{
			if(wordArr[i] == newChar) 
			{
				wordToGuess[i] = newChar;
			}
		}
		
		System.out.println("new UnDiscovered is ="+ wordToGuess);
	}
	
	public  static char[] getWordToGuess() 
	{
		return wordToGuess;
	} 
	
	public void setWordToGuess(char[] WordToGuess) 
	{
		Logic.wordToGuess = WordToGuess;
	}
	
	public static int getWorngAttempts() 
	{
		return worngAttempts;
	}
}
