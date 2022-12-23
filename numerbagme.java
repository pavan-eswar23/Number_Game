import java.util.Scanner;
import java.util.Random;

class game {
    public int number;
    public int guessnum;
    public int nofguesses;

    void guessnumber() {
        boolean guess = false;
        for (nofguesses = 1; !guess; nofguesses++) {
            Scanner sc = new Scanner(System.in);
                System.out.print("enter a number upto 10:");
                    number = sc.nextInt();
            
            Random rand = new Random();
            int guessnum = rand.nextInt(10);

            if (number == guessnum) {
                guess = true;
            }
            if (guess == true) {
                System.out.print("you made correct choice!");
                System.out.println();
                System.out.print("no of guesses made:" + nofguesses);
            } else {
                System.out.println("oops! you lost.Better luck next time");
            }
        }

    }
}

public class numerbagme {
  public static void main(String[] args) {
    game g=new game();
    g.guessnumber();
  }
}
