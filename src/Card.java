import java.util.Random;

public class Card {
	    private String suit;
		private String num; //Face value of the card

		public Card(String suit, String num) 
		{
			this.suit = suit;
			this.num = num;
		}
		
		public String getSuit() 
		{
			return suit;
		}
		
		public void setSuit(String suit) 
		{
			this.suit = suit;
		}
		public String getnum() 
		{
			return num;
		}
		public void setnum(String num) 
		{
			this.num = num;
		}
		
		public String toString() {
			return   num + " of " + suit;
		}
		public static void main(String[] args) {
			// setting up the suits and face values for the cards
			String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
			String[] num = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
			
			//generating 5 cards
			Random rand = new Random(); 
			for (int i = 1; i<5; i++)
			{
				Card card = new Card(suits[rand.nextInt(suits.length)], num[rand.nextInt(num.length)]);
				System.out.println(card);
		}
	}	
}