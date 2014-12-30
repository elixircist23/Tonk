import java.util.*;
public class Player {
	
	//Grab the value of the used cards from the card class itself
	public Card card = new Card();
	public ArrayList<String> hand;
	public ArrayList<String> USED = card.USED;
	public HashMap<String, Integer> deck = card.deck;
	
	public Player(){
		
		hand = card.deal();				
		
	}
	
	public void draw(){
		String randomCard = card.randomCard();
		if(deck.size() > 0){
			while(true){
			
				if(USED.contains(randomCard)){
					continue;
				}
			
				else{
					System.out.println(randomCard);
					deck.remove(randomCard);
					USED.add(randomCard);
					hand.add(randomCard);
					break;
				}
			}
		}
		
		else{
			System.out.println("GSO");
		}
	}
	
	public void print(){
		System.out.println(hand);
		System.out.println(hand.size());
		System.out.println("deck = " + deck.size());
		System.out.println(USED.size());
	}
	
	
	

}
