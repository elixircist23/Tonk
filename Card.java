
public class Card {
	private int suit;
	private int pip;
	
	public Card(int Suit, int Pip){
		suit = Suit;
		pip = Pip;
	}
	
	public int[] returnCard(){
		int[] array = {suit, pip};
		return array;
	}
	
}
