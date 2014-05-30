
/**
 * Write a description of class Money here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Money 
{
    int money = 500;
    public double toString(int money,int card1,int card2, int dealercard, int  dealercard2)
    {
        
        if (card1 + card2<= dealercard + dealercard2)
        {
            money = money-100;
            System.out.println("you lost $"+money);
        }
        else {
            money = money+100;
            System.out.println("You won $"+money); 
        }
        return money;
    }
}
