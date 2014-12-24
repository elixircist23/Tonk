//Importing all HashMap libraries
import java.util.*;
import java.util.Arrays;

public class Card {
	public HashMap<String, Integer> deck;
	public static ArrayList<String> USED;
	
	public Card(){
		
		//Creating HashMap with String Keys and Integer Values
		deck = new HashMap<String, Integer>();
		//Creating Array list for used cards, we'll add to this list later on
		USED = new ArrayList<String>();
		
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
	
	public String randomCard(){
		
		//Selects a random card from deck
		//Gets value and Key, but returns a String of the Key
		Random random = new Random();
		List<String> keys = new ArrayList<String>(deck.keySet());
		String randomKey = keys.get(random.nextInt(keys.size()));
		//Integer value = deck.get(randomKey);
		
		return randomKey;
		
	}
	
	public int getValue(String key){
		//returns the value of the card, given the key
		//useful for adding values of cards together
		int value = deck.get(key);
		return value;
	}
	
	public String[] deal(){
		//Returns 5 cards that are not being used in the deck
		String dealCards[];
		dealCards = new String[5];
		int x = 0;
		
		while(x<5){
			String randomCard = randomCard();
			
			if(USED.contains(randomCard)){
				continue;
			}
			
			else{
				//add random card to USED pile
				USED.add(randomCard);
				dealCards[x] = randomCard;
				x++;
			}
			//CHANGE THIS LATER, if there are no cards what to do?
		
		}
		
		return dealCards;
	}
	
}
