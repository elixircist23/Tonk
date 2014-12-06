//Importing all HashMap libraries
import java.util.*;

public class Card {
	
	//Creating HashMap with String Keys and Integer Values
	public HashMap<String,Integer> deck = new HashMap<String, Integer>();
	
	public Card(){
		
		//Creating all the cards and placing them in the HashMap called 'deck'
		for(int i = 2; i < 10; i++){
			deck.put(i + " of Hearts", i);
		}
		
		for(int i = 2; i < 10; i++){
			deck.put(i + " of Spades", i);
		}
		
		for(int i = 2; i < 10; i++){
			deck.put(i + " of Clubs", i);
		}
		
		for(int i = 2; i < 10; i++){
			deck.put(i + " of Diamonds", i);
		}
		
		deck.put("Ace of Hearts", 10);
		deck.put("Ace of Spades", 10);
		deck.put("Ace of Clubs", 10);
		deck.put("Ace of Diamonds", 10);
		
		deck.put("King of Hearts", 10);
		deck.put("King of Spades", 10);
		deck.put("King of Clubs", 10);
		deck.put("King of Diamonds", 10);
		
		deck.put("Queen of Hearts", 10);
		deck.put("Queen of Spades", 10);
		deck.put("Queen of Clubs", 10);
		deck.put("Queen of Diamonds", 10);
		
		deck.put("Jack of Hearts", 10);
		deck.put("Jack of Spades", 10);
		deck.put("Jack of Clubs", 10);
		deck.put("Jack of Diamonds", 10);
		
		
	}
	
	public void print(){
		System.out.println(deck);
	}
	
	public String randomCard(){
		
		//Selects a random card from deck
		//Gets value and Key, but returns a String of the Key
		Random random = new Random();
		List<String> keys = new ArrayList<String>(deck.keySet());
		String randomKey = keys.get(random.nextInt(keys.size()));
		Integer value = deck.get(randomKey);
		
		return randomKey;
		
	}
	
	public int getValue(String key){
		//returns the value of the card, given the key
		int value = deck.get(key);
		return value;
	}
	
	
	
	
}
