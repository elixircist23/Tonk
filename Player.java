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
		System.out.println(randomCard);
		int x = 1;
		while(x > 0){
			if(deck.isEmpty() == false){
				if(USED.contains(randomCard)){
					continue;
				}
				else{
					hand.add(card.randomCard());
					x++;
				}
			}
			else{
				System.out.println("GSO");
				x++;
			}
		}
	}
	
	public void print(){
		System.out.println(hand);
	}
	
	
	

}
