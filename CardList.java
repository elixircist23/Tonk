
public class CardList {
	
	private CardNode list;
	
	public CardList(){
		list = null;
	}
	
	public void add(Card c){
		CardNode node = new CardNode(c);
		CardNode current;
		
		if(list == null)
			list = node;
		else{
			current = list;
			while(current.next != null)
				current = current.next;
			current.next = node;
		}
	}
	
	public String toString(){
		String result = "";
		CardNode current = list;
		
		while(current != null){
			result += current.card + "\n";
			current = current.next;
		}
		
		return result;
	}

	private class CardNode{
		public Card card;
		public CardNode next;
		
		public CardNode(Card c){
			card = c;
			next = null;
		}
	}
}
