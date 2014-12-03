import java.util.ArrayList;
import java.util.Arrays;

public class Card
{

  public static void main(String[] args)
	{
		String[] deckDown = new String[] {"1spade", "2spade", "3spade", "4spade", "5spade", "6spade","7spade", "8spade", "9spade", "10spade", "jspade", "qspade", "kspade", "1club", "2club", "3club", "4club", "5club", "6club","7club", "8club", "9club", "10club", "jclub", "qclub", "kclub", "1diamond", "2diamond", "3diamond", "4diamond", "5diamond", "6diamond","7diamond", "8diamond", "9diamond", "10diamond", "jdiamond", "qdiamond", "kdiamond", "1heart", "2heart", "3heart", "4heart", "5heart", "6heart","7heart", "8heart", "9heart", "10heart", "jheart", "qheart", "kheart"};
		
		for(int c = 0; c < 52; c++)
		{
			System.out.println((deckDown[c]));
	    }	
	
		   

	}

    //Add a arraylist of cards in the deck called upDeck <-- (the faceup discard deck)
}
