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
        Card jdubCrazyCard = new Card("Nutty","Professor");


    }
}
