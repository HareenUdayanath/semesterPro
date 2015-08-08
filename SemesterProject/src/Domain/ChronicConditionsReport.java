package Domain;


public class ChronicConditionsReport extends Document{
           
    private String chronicConditionsCol;    
    private boolean heartDisease;
    private boolean stroke;
    private boolean cancer;
    private boolean diabetes;
    private boolean obesity;
    private boolean arthritis;
   

   
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


    /**
     * @param chronicConditionsCol the chronicConditionsCol to set
     */
    public void setChronicConditionsCol(String chronicConditionsCol) {
        this.chronicConditionsCol = chronicConditionsCol;
    }

    /**
     * @param heartDisease the heartDisease to set
     */
    public void setHeartDisease(boolean heartDisease) {
        this.heartDisease = heartDisease;
    }

    /**
     * @param stroke the stroke to set
     */
    public void setStroke(boolean stroke) {
        this.stroke = stroke;
    }

    /**
     * @param cancer the cancer to set
     */
    public void setCancer(boolean cancer) {
        this.cancer = cancer;
    }

    /**
     * @param diabetes the diabetes to set
     */
    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    /**
     * @param obesity the obesity to set
     */
    public void setObesity(boolean obesity) {
        this.obesity = obesity;
    }

    /**
     * @param arthritis the arthritis to set
     */
    public void setArthritis(boolean arthritis) {
        this.arthritis = arthritis;
    }
    
}
