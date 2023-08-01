import javafx.scene.layout.Pane;

public class LudoGame {
    private LudoBoard board;
    private Player[] players;
    private Dice dice;

    private int currentPlayerIndex;
    // Add other game-related properties like a flag to check if the game is over, etc.

    public LudoGame(LudoBoard board, Player[] players,Dice dice) {
        this.board = board;
        this.players = players;
        this.dice = dice;
        this.currentPlayerIndex = 0;
        // Initialize other game-related properties
    }

    
    public void startGame() {
        
    }

    public Pane getBoard() {
        return board;
    }
}


