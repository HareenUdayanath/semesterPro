package PlayerRecords;


public class Player {
    private String name;
    private int wins;
    private int losses;
    private int ties;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the wins
     */
    public int getWins() {
        return wins;
    }

    /**
     * @param wins the wins to set
     */
    public void setWins(int wins) {
        this.wins = wins;
    }

    /**
     * @return the losses
     */
    public int getLosses() {
        return losses;
    }

    /**
     * @param losses the losses to set
     */
    public void setLosses(int losses) {
        this.losses = losses;
    }

    /**
     * @return the ties
     */
    public int getTies() {
        return ties;
    }

    /**
     * @param ties the ties to set
     */
    public void setTies(int ties) {
        this.ties = ties;
    }
}
