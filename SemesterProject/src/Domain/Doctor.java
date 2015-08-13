package Domain;


public class Doctor extends Employee{
    private boolean availability;
    public Doctor(){
        this.availability = false;
        this.position = "Doctor";
    }

    /**
     * @return the availability
     */
    public boolean isAvailablity() {
        return availability;
    }

    /**
     * @param availablity the availability to set
     */
    public void setAvailablity(boolean availablity) {
        this.availability = availablity;
    }
    
}
