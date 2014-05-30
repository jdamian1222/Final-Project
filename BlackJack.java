
/**
 * Write a description of class BlackJack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
	public class BlackJack
	{
	    public static void main(String[] args)
	    {
	        int myTotal, dealerTotal;
	        //declares the Scanner object
	        Scanner scan = new Scanner(System.in);
	        String again = "yes"; 
	         
	        System.out.println("Let's Play a Game of BlackJack");
	         
	        while (again.equalsIgnoreCase("yes"))
	        {
	        Card myCard = new Card();   // creates a new card
	        Card myCard2 = new Card();  
	        Card dealerCard = new Card();  // creates a new card
	        Card dealerCard2 = new Card(); 
	        Money Mymoney = new Money();
	        
	         
	        //deals the two cards to each player
	        myCard.toString();
	        myCard2.toString();
	        dealerCard.toString();
	        dealerCard2.toString();
	        
	         
	        System.out.println("You draw the " + myCard);            // prints the card
	        System.out.println("You draw the " + myCard2);          // prints the 2nd card
	         
	        System.out.println("The dealer drew the " + dealerCard);        // prints the dealer's top card
	         
	         
	        System.out.println("The dealer's hidden card was " +dealerCard2);  // prints the dealer's 2nd card
	        Mymoney.toString();
	        
	 
	             
	            System.out.println("Would you like to play another hand? yes/no");
	            again = scan.nextLine();
	        }
	    }
	}