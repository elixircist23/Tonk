
public class Tonk {

	public static void main(String[] args) {
		
		Card deck = new Card();
		String random = deck.randomCard();
		int valueOfRandom = deck.getValue(random);
		System.out.println(random);
		System.out.println(valueOfRandom);
		
		

	}

}
