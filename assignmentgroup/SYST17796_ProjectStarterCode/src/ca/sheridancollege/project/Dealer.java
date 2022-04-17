package ca.sheridancollege.project;

/*
Project group :NAFK
Author:KHalid Adam, Abhishek Bhattarai, Fatoumatta
Date:2022-04-17





*/
import java.util.ArrayList;

import java.util.Arrays;

class Dealer {
ArrayList<Card> hand;
private int hvalue=0;
private Card[] Hand1;
private int AceCount;
Dealer(Deck deck)
{
    hand = new ArrayList<>();
    Hand1 = new Card[]{};
    int AceCount=0;
    for(int j=0; j<2; j++)
    {
        hand.add(deck.draw());
    }
    Hand1 = hand.toArray(Hand1);
    for(int j=0; j<Hand1.length; j++)
    {
        hvalue += Hand1[j].getvalue();
        if(Hand1[j].getvalue()==11)
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

public void showFirst()
{ Card[] first = new Card[]{};
first = hand.toArray(first);
System.out.println("["+first[0]+"]");
}

public void Hit(Deck deck)
{
    hand.add(deck.draw());
    Hand1 = hand.toArray(Hand1);
    hvalue = 0;
    for(int i=0; i<Hand1.length; i++)
    {
        hvalue += Hand1[i].getvalue();
        if(Hand1[i].getvalue()==11)
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

public boolean Hit()
{
    if(hvalue<17)
    {
        return true;
    }
    return false;
}

public boolean has21()
{
    if(hand.size()==2 && hvalue==21)
    {
        System.out.println("The dealer has blackjack!");
        return true;
    }
    return false;
}

public void show()
{
    System.out.println(hand);
}

public int getHvalue()
{
    return hvalue;
}

public boolean bust(int hvalue)
{
    if(hvalue>21)
    {
        System.out.println("The dealer is bust!");
        return true;
    }
    return false;
}

public int Turn(Deck deck)
{
    while(Hit())
    {
        System.out.println(" dealer hit");
        Hit(deck);
        if(bust(hvalue))
        {
            break;
        }
    }
    if(hvalue<=21)
    {
        System.out.print(" dealer stands.");
    }
    return hvalue;
}
}