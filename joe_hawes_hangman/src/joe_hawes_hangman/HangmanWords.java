package joe_hawes_hangman;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import util.MyConsole;

public class HangmanWords {
    
    private final List<String> words;
    
    public HangmanWords()
    {
	words = Arrays.asList("java", "code", "debug", "hangman", "program", "here", "face", "finger", "sun", "computer", "cat", "dog", "sun", "moon", "star", "fish", "book", "tree", "ball", "car",
		"pen", "hat", "cake", "chair", "door", "lamp", "bird", "rain", "shoe", "jump",
		"house", "smile", "apple", "grape", "cloud", "grass", "river", "table", "water", "hand",
		"blue", "happy", "funny", "window", "school", "mouse", "phone", "orange", "dance", "story",
		"bread", "candle", "friend", "pencil", "turtle", "butter", "guitar", "shadow", "puzzle", "rocket");
    }
    
    public String getRandomWord()
    {
        Random rand = new Random();
        return words.get(rand.nextInt(words.size()));
    }
    public String getHiddenWord(String word) 
    {
        return "_ ".repeat(word.length()).trim();
    }
    private static void displayHiddenWord(String hiddenWord) {
	String hiddenWordDisplay = "";
	char[] chars = hiddenWord.toCharArray();
	for (int i = 0; i < chars.length; i++) 
	{
	    hiddenWordDisplay += chars[i] + " ";
	}
	MyConsole.printL("hidden word display = "+hiddenWordDisplay);
    }
}
