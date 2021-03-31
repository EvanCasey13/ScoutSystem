import java.util.ArrayList;

/**
 * Scout Class
 * @author Evan Casey
 * @version 1.0
 */

/* Super class*/
public abstract class Scout implements iScoutMember {

    /* Fields*/
    private String name;
    private String county;
    private String dateOfBirth;
    private String address;
    private String phoneNumber;
    private ArrayList<SpecialInterest> S2;
    private ArrayList<SpecialInterest> specialInterests;

    /**
     * Constructor for objects of class Scout
     * @param name The name of the scout
     * @param county The county of the scout
     * @param dateOfBirth The date of birth of the scout
     * @param address The address of the scout
     * @param phoneNumber The phone number of the scout
     * @param S2 The second special Interest of the scout
     * @param specialInterests The first special Interest of the scout
     */

    /*Constructor with 7 parameters*/
    public Scout(String name, String county, String dateOfBirth, String address, String phoneNumber, SpecialInterest specialInterests, SpecialInterest S2){

    this.name = name;

    this.county = county;

    this.dateOfBirth = dateOfBirth;

    this.address = address;

    this.phoneNumber = phoneNumber;

    this.specialInterests = specialInterests;

    this.S2 = S2;

    }

    /*Getters*/
    /** @returns the name of the scout*/
    public String getName() {
        return name;
    }

    /** @returns the county of the scout*/
    public String getCounty() {
        return county;
    }

    /** @returns the date of birth of the scout*/
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /** @returns the address of the scout*/
    public String getAddress() {
        return address;
    }

    /** @returns the phoneNumber of the scout*/
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /** @returns the SpecialInterest of the scout*/
    public SpecialInterest getSpecialInterests() {
        return (SpecialInterest) specialInterests;
    }

    /** @returns the second SpecialInterest of the scout*/
    public ArrayList<SpecialInterest> getS2() {
        return S2;
    }

    /*Setters*/
    /**Updates the name to new name passed as parameter @param name is new name for scout*/
    public void setName(String name) {
        this.name = name;
    }

    /**Updates the county to new county passed as parameter @param county is new county for scout*/
    public void setCounty(String county) {
        this.county = county;
    }

    /**Updates the dateOfBirth to new dateOfBirth passed as parameter @param dateOfBirth is new dateOfBirth for scout*/
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**Updates the address to new address passed as parameter @param address is new address for scout*/
    public void setAddress(String address) {
        this.address = address;
    }

    /**Updates the PhoneNumber to new PhoneNumber passed as parameter @param PhoneNumber is new PhoneNumber for scout*/
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**Updates the SpecialInterest to new SpecialInterest passed as parameter @param SpecialInterest is new SpecialInterest for scout*/
    public void setSpecialInterests(SpecialInterest specialInterests) {
        this.specialInterests = specialInterests;
    }

    /**Updates the S2 to new S2 passed as parameter @param S2 is new S2 for scout*/
    public void setS2(ArrayList<SpecialInterest> s2) {
        S2 = S2;
    }

    /**
     * Builds a String representing a user friendly representation of the object state
     * @return Details of the specific scout
     */
    @Override
    public String toString() {
        return
                ": '" + name + '\'' +
                ", County: '" + county + '\'' +
                ", Date of Birth: '" + dateOfBirth + '\'' +
                ", Address: '" + address + '\'' +
                ", Contact Number: '" + phoneNumber + '\'' +
                ", Special Interests: " + specialInterests
                ;
    }
}
