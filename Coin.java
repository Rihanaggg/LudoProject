public class Coin{
    private int position; // Current position of the piece on the board

    private boolean inFinalZone; // Indicates whether the piece is in the final zone

    private boolean atHome; // Indicates whether the piece is at home (not on the board)

   

    public Coin() {

        this.position = -1; // -1 indicates the piece is at home or not on the board

        this.inFinalZone = false;

        this.atHome = true;

    }

   

    // Method to get the current position of the piece

    public int getPosition() {

        return position;

    }

   

    // Method to set the current position of the piece

    public void setPosition(int position) {

        this.position = position;

    }

   

    // Method to check if the piece is in the final zone

    public boolean isInFinalZone() {

        return inFinalZone;

    }

   

    // Method to set the piece's status in the final zone

    public void setInFinalZone(boolean inFinalZone) {

        this.inFinalZone = inFinalZone;

    }

   

    // Method to check if the piece is at home (not on the board)

    public boolean isAtHome() {

        return atHome;

    }

   

    // Method to set the piece's status at home

    public void setAtHome(boolean atHome) {

        this.atHome = atHome;

    }
}
