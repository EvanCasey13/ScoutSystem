import java.util.ArrayList;

/**
 * SpecialInterest Class
 * @author Evan Casey
 * @version 1.0
 */

public class SpecialInterest extends ArrayList<SpecialInterest> {
    /*Fields*/
    private String interestCategory;
    private String details;
    private String dateBadgeReceived;

    /**Constructor for SpecialInterest with 3 parameters
     * @param interestCategory is the scouts interestCategory
     * @param details is the details of scouts interest
     * @param dateBadgeReceived is the date the scout received a badge
     * */
    /*Constructor*/
    public SpecialInterest(String interestCategory, String details, String dateBadgeReceived){
    this.interestCategory = interestCategory;
    this.details = details;
    this.dateBadgeReceived = dateBadgeReceived;
    }

    /*Getters*/
    /** @returns the scouts interestCategory*/
    public String getInterestCategory() {
        return interestCategory;
    }

    /** @returns the details of the scouts interestCategory*/
    public String getDetails() {
        return details;
    }

    /** @returns the date the scout received a badge*/
    public String getDateBadgeReceived() {
        return dateBadgeReceived;
    }

    /*Setters*/
    /** Updates the scouts interestCategory to the new @param interestCategory*/
    public void setInterestCategory(String interestCategory) {
        this.interestCategory = interestCategory;
    }

    /** Updates the details of the scouts interestCategory to the new @param details*/
    public void setDetails(String details) {
        this.details = details;
    }

    /** Updates the date the scout received a new badge to the new @param dateBadgeReceived*/
    public void setDateBadgeReceived(String dateBadgeReceived) {
        this.dateBadgeReceived = dateBadgeReceived;
    }

    /**
     * Builds a String representing a user friendly representation of the object state
     * @return Details of the specific SpecialInterest
     */
    public String toString() {
        return "" +
                "Interest Category: '" + interestCategory + '\'' +
                ", Interest Details: '" + details + '\'' +
                ", Date Badge Received: '" + dateBadgeReceived + '\''
               ;
    }
}
