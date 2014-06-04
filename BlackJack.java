
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
               Money mymoney = new Money();
//                
//                  while (bet == true)
//         {
//             
//             System.out.println("You have " + mymoney + " dollars.");
//             
//             do
//             {
//                 System.out.println("How many dollars do you want to bet?  (Enter 0 to end.)");
//                 System.out.print("? ");
//                 bet = scan.nextLine();
//                  
//                 if (bet <= 0 || bet == mymoney)
//                 {
//                     System.out.println("Your answer must be between 0 and " + mymoney + '.');
//                 }
//             } while (bet < 0 || bet > mymoney);
//             if (bet == 0)
//             {
//                 break;
//             }
//             userWins = playBlackjack();
//             if (userWins)
//             {
//                 mymoney = mymoney + bet;
//             } else
//             {
//                 mymoney = mymoney - bet;
//             }
//             System.out.println();
//             if (mymoney == 0)
//             {
//                 System.out.println("Looks like you've are out of money!");
//                 break;
//             }
//         }
             
            while (again.equalsIgnoreCase("yes"))
            {
            Card myCard = new Card();   // creates a new card
            Card myCard2 = new Card();  
            Card dealerCard = new Card();  // creates a new card
            Card dealerCard2 = new Card(); 
         
           
            
             
            //deals the two cards to each player
            myCard.toString();
            myCard2.toString();
            dealerCard.toString();
            dealerCard2.toString();
            
        
            
            
             
            System.out.println("You draw the " + myCard );            // prints the card
            System.out.println("You draw the " + myCard2);          // prints the 2nd card
             
            System.out.println("The dealer drew the " + dealerCard);        // prints the dealer's top card
             
             
            System.out.println("The dealer's hidden card was " +dealerCard2);  // prints the dealer's 2nd card
            mymoney.toString();
            System.out.println(mymoney);
            
            

            
     
                 
                System.out.println("Would you like to play another hand? yes/no");
                again = scan.nextLine();
                
//                 public boolean bet{
//                     
//                     
//                 }
            }}}
