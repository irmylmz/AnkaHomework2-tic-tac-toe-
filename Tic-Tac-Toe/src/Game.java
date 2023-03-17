import java.util.Locale;
import java.util.Scanner;

public class Game {
    Player player1 = new Player("Flying Elephant" , "The elephants can fly.");
    Player player2 = new Player("Fearless Panda" , "I'm not afraid.");
    Player gamningPlayer = player2;
    GameBoard gameBoard = new GameBoard();
    GameBoardSquare gameBoardSquare = new GameBoardSquare();

    Scanner scanner = new Scanner(System.in);

     public void initGame(){
        this.gameBoard.initBoard();
         this.gameBoardSquare.getStoredValue(player1,player2);
         while(!gameBoard.checkGameFinished()){
             this.setPlayers();
             this.replaceGame();
             this.gameBoard.draw();
         }
        this.stopGame();
     }

     public int setScore(){
         return gamningPlayer.score++;
     }

     public Player setPlayers(){
         if(this.gamningPlayer==player2){
             this.gamningPlayer = player1;
         } else if (this.gamningPlayer==player1) {
             this.gamningPlayer = player2;
         }
         System.out.println(" ");
         System.out.println("It is on "+ gamningPlayer.getUsername()+".");
         return this.gamningPlayer;
     }

     public void replaceGame(){
         System.out.println("Where will you game in row(starts from scratch): ");
         int x = scanner.nextInt();
         System.out.println("Where will you game in column(starts from scratch): ");
         int y = scanner.nextInt();
         gameBoard.board[x][y] = this.gamningPlayer.getPlayerSymbol();
     }

     public void stopGame(){
         this.setScore();
         System.out.println("The Winning player: " +gamningPlayer.getUsername().toUpperCase());
         System.out.println("The Victory Phrase: "+this.gamningPlayer.getVictoryPhrase().toUpperCase());
     }
}
