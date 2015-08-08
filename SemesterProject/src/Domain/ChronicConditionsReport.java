package Domain;


public class ChronicConditionsReport extends Document{
    private int PID;        
    private String chronicConditionsCol;    
    private boolean heartDisease;
    private boolean stroke;
    private boolean cancer;
    private boolean diabetes;
    private boolean obesity;
    private boolean arthritis;
   

    /**
     * @return the PID
     */
    public int getPID() {
        return PID;
    }

    /**
     * @return the chronicConditionsCol
     */
    public String getChronicConditionsCol() {
        return chronicConditionsCol;
    }

    /**
     * @return the heartDisease
     */
    public boolean isHeartDisease() {
        return heartDisease;
    }

    /**
     * @return the stroke
     */
    public boolean isStroke() {
        return stroke;
    }

    /**
     * @return the cancer
     */
    public boolean isCancer() {
        return cancer;
    }

    /**
     * @return the diabetes
     */
    public boolean isDiabetes() {
        return diabetes;
    }

    /**
     * @return the obesity
     */
    public boolean isObesity() {
        return obesity;
    }

    /**
     * @return the arthritis
     */
    public boolean isArthritis() {
        return arthritis;
    }
    
}
