package ca.sheridancollege.project;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Deck {
private ArrayList<Card> deck;
Deck()
{
    deck = new ArrayList<Card>();
    for(int i=0; i<4; i++)
    {
        for(int j=1; j<=13; j++)
        {
            deck.add(new Card(i,j));
        }
    }
}


public Card draw()
{
    return deck.remove(0);
}

    void shuffle() {
      List<ArrayList<Card>> list =  Arrays.asList(deck);
    Collections.shuffle(list);
}
    }


