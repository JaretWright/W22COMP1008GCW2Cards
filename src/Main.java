import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //instantiated a Scanner object
        //new Scanner(System.in) is calling the "constructor" and passes in the
        //argument System.in (which is the input stream)
        Scanner keyboard = new Scanner(System.in);
//
//        System.out.println("Enter your name:");
//        String name = keyboard.nextLine();
//        System.out.printf("Hello %s%n",name);

        //let's create our first Card object
        Card aceOfSpades = new Card("ace","spades");
        Card jdubCrazyCard = new Card("7","hearts");

        System.out.println(aceOfSpades.getSuit());
        aceOfSpades.setSuit("hearts");
        System.out.println(aceOfSpades.getSuit());
        aceOfSpades.setFaceName("5");
        System.out.println(aceOfSpades.getFaceName());

        try {
            //let's put an INVALID suit in here...Armani
//            aceOfSpades.setSuit("Armani");
            aceOfSpades.setSuit("Professor");
        }catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        DeckOfCards deck = new DeckOfCards();

    }
}
