
package ca.sheridancollege.project;

import java.util.*;
public class Blackjackgame {

private static int AceCount;
private static ArrayList<Card> hands;
private static int hvalue;
private static String username;
public static void main(String[] args){
    System.out.println("Hello! Please Enter your name?");

    Scanner scan = new Scanner(System.in);

    username = scan.nextLine();
    System.out.println("Hi there, "+username+"!");
   int i=1;
    while(i>0){
        Deck deck1 = new Deck();
        deck1.shuffle();
        AceCount=0;
        Dealer dealer = new Dealer(deck1);
        List<Card> hand1 = new ArrayList<>();
        hand1.add(deck1.draw());
        hand1.add(deck1.draw());
        
        
        
        System.out.println("these Cards are yours: ");

        System.out.println(hand1);

        
    int handvalue = calchValue(hand1);

        System.out.println("The dealer has a: ");
        dealer.showFirst();
        if(has21(handvalue) && dealer.has21())
        {
            tie();
        }
        else if(has21(handvalue))
        {
           
            
            Won();
        }
        else if(dealer.has21())
        {
            System.out.println("Here is the dealer's hand:");
            dealer.show();
            Lost();
        }
        else
        {
           
            System.out.println("Would you like to hit or stand?");
            Scanner hitorstand = new Scanner(System.in);
            String hitt = hitorstand.nextLine();
            while(!isHit(hitt))
            {
                System.out.println("Only Hit or stand is accepted");
                hitt = hitorstand.nextLine();
            }
            while(hitt.equals("hit"))
            {
                Hit(deck1, hand1);
                System.out.println("Your hand is now:");
                System.out.println(hand1);
                handvalue = calchValue(hand1);
                if(chkbust(handvalue))
                {
                    Lost();
                    break;
                }
               
                System.out.println("hit or stand?");
                hitt = hitorstand.nextLine();
            }
            if(hitt.equals("stand"))
            {
                int dealerhand = dealer.Turn(deck1);
                System.out.println("");
                System.out.println("The dealer had:");
                dealer.show();
                if(dealerhand>21)
                {
                    Won();
                }
                else
                {
                    int you = 21-handvalue;
                    int deal = 21-dealerhand;
                    if(you==deal)
                    {
                        tie();
                    }
                    if(you<deal)
                    {
                        Won();
                    }
                    if(deal<you)
                    {
                        Lost();
                    }
                }
            }
        }
    System.out.println(" Play Again?");
    Scanner yesorno = new Scanner(System.in);
    String answer = yesorno.nextLine();
    while(!isyesno(answer))
            {
                System.out.println("Only yes or no is accepted.");
                answer = yesorno.nextLine();
            }
    if(answer.equals("no"))
    {
        break;
    }
}
    
}

 static boolean has21(int handValue)
{
    if(handValue==21)
    {
        return true;
    }
    return false;
}

 static int calchValue(List<Card> hand)
{
    Card[] aHand = new Card[]{};
    aHand = hand.toArray(aHand);
    int handvalue=0;
    for(int i=0; i<aHand.length; i++)
    {
        handvalue += aHand[i].getvalue();
        if(aHand[i].getvalue()==11)
        {
            AceCount++;
        }
        while(AceCount>0 && handvalue>21)
        {
            handvalue-=10;
            AceCount--;
        }
    }
    return handvalue;
}


 static void Won()
{
    System.out.println(" you win!");
    
   
}

 static void Lost()
{
    System.out.println(" you lose!");
   
}

 static void tie()
{
    System.out.println("It's a Tie!");
   
   
}

 static void Hit(Deck deck, List<Card> hand)
{
    hand.add(deck.draw());
    Card[] thehand = new Card[]{};
    thehand = hand.toArray(thehand);
    hvalue = 0;
    for(int i=0; i<thehand.length; i++)
    {
        hvalue += thehand[i].getvalue();
        if(thehand[i].getvalue()==11)
        {
            AceCount++;
        }
        while(AceCount>0 && hvalue>21)
        {
            hvalue-=10;
            AceCount--;
        }
    }
}

 static boolean isHit(String hitter)
{
    if(hitter.equals("hit") || hitter.equals("stand"))
    {
        return true;
    }
    return false;
}

static boolean chkbust(int handvalue)
{
    if(handvalue>21)
    {
        System.out.println("You have are bust!");
        return true;
    }
    return false;
}

 static boolean isyesno(String answer)
{
    if(answer.equals("yes") || answer.equals("no"))
    {
        return true;
    }
    return false;
}

}