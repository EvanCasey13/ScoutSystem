/**
 * BeaverScout Class
 * @author Evan Casey
 * @version 1.0
 */

public class BeaverScout extends Scout {
    /*Fields*/
    private String parentPhone;

    /**Constructor for BeaverScout with 8 parameters
     * @param parentPhone is the parents phone number of the BeaverScout
     * */
    public BeaverScout(String name, String county, String dateOfBirth, String address, String phoneNumber, SpecialInterest specialInterests, SpecialInterest S2, String parentPhone) {
        super(name, county, dateOfBirth, address, phoneNumber, specialInterests, S2);
        this.parentPhone = parentPhone;

    }


    /*Getters*/
    /** @returns the parentPhone of the BeaverScout*/
    public String getParentPhone() {
        return parentPhone;
    }

    /*Setters*/
    /** Updates the parentPhone of the BeaverScout to the @param parentPhone*/
    public void setParentPhone(String parentPhone) {
        this.parentPhone = parentPhone;
    }

    /*Membership fee for BeaverScout*/
    /** @returns price of BeaverScout membership which is 100*/
    public double calcMembership() {
        return 100;
    }

    /**
     * Builds a String representing a user friendly representation of the object state
     * @return Details of the specific BeaverScout using getters from super class
     */
    public String toString() {
        return
                "Beaver Scout Name: '" + super.getName()+ '\'' +
                ", County: '" + super.getCounty()+ '\'' +
                ", Date of Birth: '" + super.getDateOfBirth()+ '\'' +
                ", Address: '" + super.getAddress()+ '\'' +
                ", Contact Number: '" + super.getPhoneNumber()+ '\'' +
                ", Special Interests: " + super.getSpecialInterests() + ", " + super.getS2() +
                " Parent Contact Number: '" + parentPhone + '\''
                ;
    }
}
