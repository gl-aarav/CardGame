import java.util.Scanner;
public class Game {

  public static void main(String[] args) {
    Game Cardgame = new Game();
    Cardgame.PlayGame();
  }

  public void PlayGame() {
    Scanner in = new Scanner (System.in);
    String PlayAgain = "No";
    do {
    Flip flipcard= new Flip();
    DisplayCards cardgame = new DisplayCards();
    int card1, card2, card3, card4;
    card1 = flipcard.CardFlip();
    card2 = flipcard.CardFlip();
    card3 = flipcard.CardFlip();
    card4 = flipcard.CardFlip();
    cardgame.color(card1);
    cardgame.color(card2);
    cardgame.color(card3);
    cardgame.color(card4);
    CalculateTurnScore(card1, card2, card3, card4);
    System.out.println("\nDo you want to play again?");
    PlayAgain = in.nextLine();
    if (PlayAgain.equalsIgnoreCase("No"))
      System.out.println("\nThank you for playing!");
    } while (PlayAgain.equalsIgnoreCase("Yes"));
  }

  public void CalculateTurnScore(int c1, int c2, int c3, int c4) {
    int red=0, black=0;
    if (c1 == 1){
      red++;
    }
    else{
      black++;
    }


    if (c2 == 1){
      red++;
    }
    else{
      black++;
    }



    if (c3 == 1){
      red++;
    }
    else{
      black++;
    }


    if (c4 == 1){
      red++;
    }
    else{

      black++;
    }


    if (red ==4 || black == 4) {
      System.out.println("\nFive points earned.");
    }

    else if(red == 2) {
      System.out.println("\nOne point earned.");
    }

    else {
      System.out.println("\nNo Points Earned");
    }
  }
}



