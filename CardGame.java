package cardgame;

import java.util.Random;


class Card{
    private String face; // face of card (Ace, Deuce....)
    private String suit; // suit of card (Hearts, Diamonds......)
    
    // two argument constructor initializes card's face and suit
    public Card(String cardFace, String cardSuit){
        face = cardFace;
        suit = cardSuit;
    }
    
    //return string representation of Card
    @Override
    public String toString(){
        return face+" of "+suit;
    }
} // end class Card

class DeckOfCards{
    private Card[] deck; // array of Card objects
    private int currentCard; // index of next Card to be dealt (0-51)
    private static final int NUMBER_OF_CARDS = 52; // constant # of Cards
    // random number generator
    private static final Random randomNumbers = new Random();
    
    // constructor fills deck of Cards
    public DeckOfCards(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", 
            "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        
        deck = new Card[NUMBER_OF_CARDS]; // create array of Card objects
        currentCard = 0; // set currentCard so first Card dealt is deck[0]
        
        // populate deck with Card objects
        for(int count=0; count<deck.length; count++){
            deck[count] = new Card(faces[count%13], suits[count/13]);
        }   
    }
    
    // shuffle deck of Cards with one-pass algorithm
    public void shuffle(){
        // after shuffling, dealing should start at deck[0] again
        currentCard = 0; // reinitialize currentCard
        
        // for each Card, pick another random Card (0-51) and swap them
        for(int first=0; first<deck.length; first++){
            // select a random number between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            
            // swap current Card with randomly selected Card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }
    
    // deal one Card
    public Card dealCard(){
        // determine whether Cards remain to be dealt
        if(currentCard < deck.length){
            return deck[currentCard++]; // return current Card in array
        }
        else{
            return null; // return null to indicate that all Cards were dealt
        }
    } // end method dealCard
} // end class DeckOfCards

public class CardGame {

    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // place Cards in random order
        
        // print all 52 Cards in the order in which they are dealt
        for(int i=1; i<=52; i++){
            System.out.printf("%-19s", myDeckOfCards.dealCard());
            if(i%4 == 0){
                System.out.println(); // output a newline after every fourth card
            }
        }
    }
}

/* OUTPUT:
Nine of Hearts     Ace of Clubs       Five of Clubs      Ten of Clubs       
Four of Spades     Jack of Spades     Eight of Hearts    Nine of Spades     
Seven of Clubs     Jack of Clubs      King of Diamonds   Seven of Hearts    
Queen of Diamonds  Eight of Diamonds  Eight of Clubs     Six of Diamonds    
Deuce of Spades    Ace of Hearts      Queen of Clubs     Four of Diamonds   
Seven of Spades    Nine of Clubs      Three of Spades    Three of Clubs     
Six of Spades      Four of Hearts     Five of Spades     Five of Hearts     
Queen of Spades    Seven of Diamonds  Eight of Spades    Three of Hearts    
Nine of Diamonds   Jack of Diamonds   Three of Diamonds  Deuce of Clubs     
Five of Diamonds   King of Clubs      Ten of Hearts      Ace of Diamonds    
Queen of Hearts    King of Spades     King of Hearts     Deuce of Hearts    
Deuce of Diamonds  Ten of Diamonds    Six of Hearts      Ace of Spades      
Jack of Hearts     Six of Clubs       Four of Clubs      Ten of Spades 
 */