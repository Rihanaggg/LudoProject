import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Token extends Circle {
    private Player owner;
    private int position;

    public Token(Player owner, Color color) {
        super(10, color);
        this.owner = owner;
        this.position = -1; // Not on board initially
    }

    public Player getOwner() {
        return owner;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    // Other methods related to token movement, capturing, etc.
    // For brevity, let's leave these methods unimplemented.
}


