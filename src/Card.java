import java.util.Arrays;
import java.util.List;

public class Card {
    private String suit, faceName;

    /**
     * This is the constructor, it takes the face name and the suit
     * of the card as arguments
     */
    public Card(String faceName,String suit) {
        this.suit = suit;
        this.faceName = faceName;
    }

    public String getSuit() {
        return suit;
    }

    public String getFaceName() {
        return faceName;
    }

    /**
     * This method will ensure that the argument is clubs, hearts, diamonds, spades"
     * @param suit - a String that represents the suit
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * This method will return a list of valid suits
     * @return "clubs", "hearts", "diamonds", "spades"
     */
    public static List<String> getValidSuits()
    {
        return Arrays.asList("clubs", "hearts", "diamonds", "spades");
    }

    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }
}
