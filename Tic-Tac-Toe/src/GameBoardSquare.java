public class GameBoardSquare {
    public GameBoard gameBoard;
    private String storedSymbol;

    public void setStoredSymbol(String storedSymbol) {
        this.storedSymbol = storedSymbol;
    }

    public void getStoredValue(Player player1, Player player2){
        player1.setPlayerSymbol("X");
        player2.setPlayerSymbol("O");
    }

    public boolean isSquareEmpty(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(this.gameBoard.board[i][j]=="-"){
                    return true;
                }
            }
        }
        return false;
    }

}
