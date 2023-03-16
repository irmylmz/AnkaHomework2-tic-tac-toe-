public class Player {
    private String username;
    private String victoryPhrase;
    private String playerSymbol;
    public int score=0;

    public Player(String username, String victoryPhrase) {
        this.username = username;
        this.victoryPhrase = victoryPhrase;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getVictoryPhrase() {
        return victoryPhrase;
    }

    public void setVictoryPhrase(String victoryPhrase) {
        this.victoryPhrase = victoryPhrase;
    }

    public String getPlayerSymbol() {
        return playerSymbol;
    }

    public void setPlayerSymbol(String playerSymbol) {
        this.playerSymbol = playerSymbol;
    }

}
