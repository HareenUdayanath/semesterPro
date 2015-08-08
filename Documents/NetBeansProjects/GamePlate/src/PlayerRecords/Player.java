package PlayerRecords;


public class Player {
    private String name;
    private int wins;
    private int losses;
    private int ties;
    
    public Player(String name){
        this.name = name;
        this.wins = this.ties = this.losses = 0;    
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
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
        this.wins += wins;
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
        this.losses += losses;
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
        this.ties += ties;
    }
    
    public int getTotal(){
        return this.losses+this.wins+this.ties;
    }
}
