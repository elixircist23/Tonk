import java.util.*;
public class Player {
	
	//Grab the value of the used cards from the card class itself
	public Card card = new Card();
	public ArrayList<String> hand;
	
	public Player(){
		
		hand = card.deal();				
		
	}
	
	public void draw(){
		
		
		hand.add(card.randomCard());
		
	}
	
	
	

}
