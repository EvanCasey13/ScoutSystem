import java.util.ArrayList;

/**
 * Scouter Class
 * @author Evan Casey
 * @version 1.0
 */

public class Scouter extends Scout {
    /*Fields*/
    private String cubPhoneNumber;

    /**Constructor for Scouter with 8 parameters
     * @param cubPhoneNumber is the cubs phone number
     * */
    public Scouter(String name, String county, String dateOfBirth, String address, String phoneNumber, SpecialInterest specialInterests, SpecialInterest S2, String cubPhoneNumber) {
        super(name, county, dateOfBirth, address, phoneNumber, specialInterests, S2);
        this.cubPhoneNumber = cubPhoneNumber;
    }

    /*Getters*/
    /** @returns the cubs phone number*/
    public String getCubPhoneNumber() {
        return cubPhoneNumber;
    }

    /*Setters*/
    /** Updates the cubPhoneNumber to the new @param cubPhoneNumber*/
    public void setCubPhoneNumber(String cubPhoneNumber) {
        this.cubPhoneNumber = cubPhoneNumber;
    }

    /**Membership fee 10 euro for Scouter*/
    public double calcMembership() {
        return 10;
    }

    /**
     * Builds a String representing a user friendly representation of the object state
     * @return Details of the specific Scouter using getters from super class
     */
    public String toString() {
        return
                "Scouter Name: '" + super.getName()+ '\'' +
                ", County: '" + super.getCounty()+ '\'' +
                ", Date of Birth: '" + super.getDateOfBirth()+ '\'' +
                ", Address: '" + super.getAddress()+ '\'' +
                ", Contact Number: '" + super.getPhoneNumber()+ '\'' +
                ", Special Interests: " + super.getSpecialInterests()+ ", " + super.getS2() +
                " Cub Contact Number: '" + cubPhoneNumber + '\''
                ;
    }
}
