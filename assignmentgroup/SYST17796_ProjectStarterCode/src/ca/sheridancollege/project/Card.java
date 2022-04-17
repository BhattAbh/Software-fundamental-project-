package ca.sheridancollege.project;

public class Card {
    
   private int value;
    private int suit;
   
    private int position;
    private static String[] ranks = {"Joker","Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
private static String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
  
    
    Card(int suit, int values)
    {
        this.position=values;
        this.suit=suit;
    }
    
    public String toString()
    {
        return ranks[position]+" of "+suits[suit];
    }
    
    public int getrank()
    {
        return position;
    }

    
    public int getsuit()
    {
        return suit;
    }
    
    public int getvalue()
    {
        if(position>10)
        {
            value=10;
        }
        else if(position==1)
        {
            value=11;
        }
        else
        {
            value=position;
        }
        return value;
    }
    
    public void setvalue(int set)
    {
        value = set;
    }
}
