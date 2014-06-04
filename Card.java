import java.util.Random;
/**

* Write a description of class card here.

*

* @author (your name)

* @version (a version number or a date)

*/
public class Card implements Comparable<Card> {
  
    public int suit;
    public int rank;
     public int rand1=1;
     public int rand2=1;
     public int usersValue = 0;
     public int usersCards = 0;
        private final int ACE = 1;
	    private final int KING = 13;
	    private final int QUEEN = 12;
	    private final int JACK = 11;
	    private final int TEN = 10;
	    private final int NINE = 9;
	    private final int EIGHT = 8;
	    private final int SEVEN = 7;
	    private final int SIX = 6;
	    private final int FIVE = 5;
	    private final int FOUR = 4;
	    private final int THREE = 3;
	    private final int TWO = 2;
	    private final int HEARTS=0;
	    private final int DIAMONDS=0;
	    private final int CLUBS=0;
	    private final int SPADES=0;
	    
	 

   
    private static final String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
    public static final String[] ranks = { "narf", "Ace", "2", "3", "4", "5", "6",
                   "7", "8", "9", "10", "Jack", "Queen", "King" };
    
    //random
    Random random = new Random();
//         public Double pickCard(){
//            rand1 = random.nextInt(13)+1;
//            rand2 = random.nextInt(4)+1;
//            
//             return rand1;
//            }
    
        
    

    /**
     * No-argument constructor.
     */
    public Card() { 
        this(0,0);
    }
    
    
    /**
     * Constructor with arguments.
     */
    public Card(int suit, int rank) { 
        this.suit = random.nextInt(4);  //pick random 
        this.rank = random.nextInt(13)+1; // picks random
    }
    
    /**
     * Prints a card in human-readable form.
     */
    @Override
    public String toString() {
      return ranks[rank] + " of " + suits[suit];
      
    }
    
    /**
     * Return true if the cards are equivalent.
     */
    @Override
    public boolean equals(Object obj) {
      boolean b = false;
      if (obj instanceof Card) {
        Card that = (Card) obj;
        b = this.compareTo(that) == 0;
      }
      return b;
    } 
    
    public static void printCard(Card card) {
      System.out.println(card);
    }
    
    /**
     * Compares two cards: returns 1 if the first card is greater
     * -1 if the seconds card is greater, and 0 if they are the equivalent.
     */
    public int compareTo(Card that) {
      // first compare the suits
      if (this.suit > that.suit) return 1;
      if (this.suit < that.suit) return -1;
      
      // compare the ranks
      if (this.rank > that.rank) return 1;
      if (this.rank < that.rank) return -1;
      return 0;
    }

}