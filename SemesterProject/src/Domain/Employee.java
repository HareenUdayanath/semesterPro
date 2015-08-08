package Domain;

public abstract class Employee {
    private int EID;    
    private String position;
    private String name;
    private String NIC;
    private String username;
    private String password;

    /**
     * @return the EID
     */
    public int getEID() {
        return EID;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the NIC
     */
    public String getNIC() {
        return NIC;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
}
