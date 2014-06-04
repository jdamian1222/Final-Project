
/**
 * Write a description of class Money here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Money 
{
    int mymoney = 500;
    public double toString(int money,int card1,int card2, int dealercard, int  dealercard2)
    {
        
        if (card1 + card2<= dealercard + dealercard2)
        {
            mymoney = mymoney-100;
            System.out.println("you lost $"+ mymoney);
        }
        else if (card1 + card2>= dealercard + dealercard2) {
            mymoney = mymoney+100;
            System.out.println("You lost $"+ mymoney); 
        }
        else{
            System.out.println("IDK");}
        return mymoney;
    }
}
