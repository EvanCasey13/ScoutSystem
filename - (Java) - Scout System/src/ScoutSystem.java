import java.util.ArrayList;
import java.util.Scanner;

/**
 * ScoutSystem Class
 * @author Evan Casey
 * @version 1.0
 */

public class ScoutSystem {

    private Scanner input = new Scanner(System.in);
    private ScoutList scoutList = new ScoutList();

    /**
     * Main Method
     */
    public static void main(String[] args) {
        new ScoutSystem();
    }

    /**
     * Default Constructor
     */
    public ScoutSystem() {
        runMenu();
    }

    /**
     * @returns choice for each method
     */
    private int mainMenu() {
        System.out.println("Scout System Menu");
        System.out.println("*****************");
        System.out.println("1) Load all Scouts from file");
        System.out.println("------------------------");
        System.out.println("2) To add a Scout");
        System.out.println("3) List all Scouts");
        System.out.println("4) Delete a Scout");
        System.out.println("5) Update Scout Details");
        System.out.println("------------------------");
        System.out.println("6) List Scouts By Group (Beaver/Cub/Scouter)");
        System.out.println("7) List Amount of Scouts By Group (Beaver/Cub/Scouter)");
        System.out.println("8) Search Scouts by Name");
        System.out.println("9) Total fees received from each Scout group");
        System.out.println("10) Summary Report of all Scout Membership numbers");
        System.out.println("------------------------");
        System.out.println("11) Save Scouts to file");
        System.out.println("------------------------");
        System.out.println("0 - To Exit");
        System.out.print("===>>");
        int choice = input.nextInt();
        return choice;
    }

    /**
     * Method to runMenu
     */
    private void runMenu() {
        int option = mainMenu();
        while (option != 0) {
            switch (option) {
                case 1:
                    try {
                        scoutList.load();
                    }
                    catch(Exception e){
                        System.out.println("Error reading from file" + e);
                    }
                    break;
                case 2:
                    addScout();
                    break;
                case 3:
                    listOfScouts();
                    break;
                default:
                case 4:
                    deleteScout();
                    break;
                case 5:
                    updateScout();
                    break;
                case 6:
                    listScoutByGroup();
                    break;
                case 7:
                    listAmountOfScoutsByGroup();
                    break;
                case 8:
                    listScoutByName();
                    break;
                case 9:
                    totalFees();
                    break;
                case 10:
                    scoutSummary();
                    break;
                case 11:
                    try {
                        scoutList.save();
                    }
                    catch(Exception e){
                        System.out.println("Error Writing to file" + e);
                    }
                    break;
            }
            System.out.println("\nPress enter to continue...");
            input.nextLine();
            input.nextLine();
            option = mainMenu();
        }
        System.out.println("Exiting... bye");
    }

    /**Method to add a certain type of Scout*/
    private void addScout() {
        char choice;
        System.out.println("What kind of Scout do you want to add?.");
        System.out.println("\t 1. Beaver Scout");
        System.out.println("\t 2. Cub Scout");
        System.out.println("\t 3. Scouter");
        System.out.println();
        System.out.print("Enter choice [1-3]: ");
        // get choice
        choice = ScannerInput.readNextLine().charAt(0);
        System.out.println();
        //dummy read of String to clear the buffer - bug in Scanner class.
        input.nextLine();

        // get details from user
        System.out.println("Enter the new Scout Details:");
        System.out.print("    Scout Name: ");
        String name = ScannerInput.readNextLine();

        System.out.print("    County:      ");
        String county = ScannerInput.readNextLine();

        System.out.print("    Date of Birth:      ");
        String dateOfBirth = ScannerInput.readNextLine();

        System.out.print("    Address:      ");
        String address = ScannerInput.readNextLine();

        System.out.print("    Contact Phone Number:      ");
        String phoneNumber = ScannerInput.readNextLine();

        System.out.println("Enter Special Interest Details");

        System.out.print("    Enter Special Interest Category:      ");
        String interestCategory = ScannerInput.readNextLine();

        System.out.print("    Enter Details:      ");
        String details = ScannerInput.readNextLine();

        System.out.print("    Enter Date Badge Received:      ");
        String dateBadgeReceived = ScannerInput.readNextLine();

        /* Beaver Scout options*/
        if (choice == '1') {

            System.out.print("    Parents Phone Number:");
            String parentPhone = ScannerInput.readNextLine();

            System.out.println("Please Enter Another Special Interest: Y/y for Yes ==>");
            String anotherInterest = ScannerInput.readNextLine();

            /* Add another Special Interest*/
            if (anotherInterest.equals("y") || anotherInterest.equals("Y")) {
                System.out.println("Enter Special Interest Details");

                System.out.print("    Enter Special Interest Category:      ");
                String interestCategory2 = ScannerInput.readNextLine();

                System.out.print("    Enter Details:      ");
                String details2 = ScannerInput.readNextLine();

                System.out.print("    Enter Date Badge Received:      ");
                String dateBadgeReceived2 = ScannerInput.readNextLine();

                System.out.println("Beaver Scout Added");
                /* creating object called S2 from SpecialInterest class using its constructor and using the input from the user*/
                SpecialInterest S2 = new SpecialInterest(interestCategory2, details2, dateBadgeReceived2);

                /* creating object called specialInterests from SpecialInterest class using its constructor and using the input from the user*/
                SpecialInterest specialInterests = new SpecialInterest(interestCategory, details, dateBadgeReceived);

                /*Creating a new BeaverScout object using the variable B1 & the constructor from the BeaverScout Class and using the input from the user*/
                BeaverScout B1 = new BeaverScout(name, county, dateOfBirth, address, phoneNumber, specialInterests, S2, parentPhone);
                scoutList.addScout(B1);
            }
        }

        /*Cub Scout options*/
        if (choice == '2') {

            System.out.print("    Cub Scout Phone Number (if they have one):");
            String cubPhoneNumber = ScannerInput.readNextLine();

            System.out.println("Please Enter Another Special Interest: Y/y for Yes ==>");
            String anotherInterest = ScannerInput.readNextLine();

            /* Add another Special Interest*/
            if (anotherInterest.equals("y") || anotherInterest.equals("Y")) {
                System.out.println("Enter Special Interest Details");

                System.out.print("    Enter Special Interest Category:      ");
                String interestCategory2 = ScannerInput.readNextLine();

                System.out.print("    Enter Details:      ");
                String details2 = ScannerInput.readNextLine();

                System.out.print("    Enter Date Badge Received:      ");
                String dateBadgeReceived2 = ScannerInput.readNextLine();

                System.out.println("Cub Scout Added");
                /* creating object called S2 from SpecialInterest class using its constructor and using the input from the user*/
                SpecialInterest S2 = new SpecialInterest(interestCategory2, details2, dateBadgeReceived2);


                /* creating object called specialInterests from SpecialInterest class using its constructor and using the input from the user*/
                SpecialInterest specialInterests = new SpecialInterest(interestCategory, details, dateBadgeReceived);

                /* creating a new CubScout object using the variable C1 & the constructor from the CubScout class & using the input from the user*/
                CubScout C1 = new CubScout(name, county, dateOfBirth, address, phoneNumber, specialInterests, S2, cubPhoneNumber);
                scoutList.addScout(C1);
            }
        }


        /*Scouter options*/
        if (choice == '3') {
            System.out.print("    Date of Garda Vetting:");
            String vetting = ScannerInput.readNextLine();

            System.out.println("Please Enter Another Special Interest: Y/y for Yes ==>");
            String anotherInterest = ScannerInput.readNextLine();

            /* Add another Special Interest*/
            if (anotherInterest.equals("y") || anotherInterest.equals("Y")) {
                System.out.println("Enter Special Interest Details");

                System.out.print("    Enter Special Interest Category:      ");
                String interestCategory2 = ScannerInput.readNextLine();

                System.out.print("    Enter Details:      ");
                String details2 = ScannerInput.readNextLine();

                System.out.print("    Enter Date Badge Received:      ");
                String dateBadgeReceived2 = ScannerInput.readNextLine();

                System.out.println("Scouter Added");
                /* creating object called S2 from SpecialInterest class using its constructor and using the input from the user*/
                SpecialInterest S2 = new SpecialInterest(interestCategory2, details2, dateBadgeReceived2);

                    /* creating object called specialInterests from SpecialInterest class using its constructor and using the input from the user*/
                    SpecialInterest specialInterests = new SpecialInterest(interestCategory, details, dateBadgeReceived);

                    /* creating a new Scouter object using the variable S1 & the constructor from the Scouter class & using the input from the user*/
                    Scouter S1 = new Scouter(name, county, dateOfBirth, address, phoneNumber, specialInterests, S2, vetting);
                    scoutList.addScout(S1);
                }
            }
        }

    /**
     * Method to list all scouts using the listOfScouts Method from the scoutList class
     */
    private void listOfScouts() {
        System.out.println(scoutList.listOfScouts());
    }


    /**
     * Method to delete a Scout at a particular Index using the removeScout method from the scoutList class
     */
    private void deleteScout() {
        System.out.println(scoutList.listOfScouts());

        if (scoutList.getScouts().size() > 0) {
            System.out.println("Enter the index of the Scout to delete ==> ");
            int scoutI = input.nextInt();

            if ((scoutI >= 0) && (scoutI < scoutList.getScouts().size())) {
                scoutList.removeScout(scoutI);
                System.out.println("Scout Deleted");
            } else {
                System.out.println("There is no scout for this index number");
            }
        }
    }

    /**Method to update a scouts details*/
    private void updateScout() {
        System.out.println(scoutList.listOfScouts());

        if (scoutList.getScouts().size() > 0) {
            System.out.println("Index of the Scout to update ==> ");
            int scoutIndex = input.nextInt();

            System.out.println("Enter a new Scout Name: ");
            String name = input.next();

            input.nextLine();
            System.out.println(" County: ");
            String county = input.nextLine();

            System.out.println("Enter the Scouts Address: ");
            String address = input.next();

            System.out.println("Date of Birth: ");
            String dateOfBirth = input.next();

            System.out.println(" Contact Phone Number: ");
            String phoneNumber = input.next();

            if ((scoutIndex >= 0) && (scoutIndex < scoutList.getScouts().size())) {
                Scout scout = scoutList.getScouts().get(scoutIndex);
                scout.setName(name);
                scout.setCounty(county);
                scout.setAddress(address);
                scout.setDateOfBirth(dateOfBirth);
                scout.setPhoneNumber(phoneNumber);
            } else {
                System.out.println("There is no Scout for this index number");
            }
        }
    }

    /**Method to list the names of Scouts in each group*/
    private void listScoutByGroup() {
        char choice;
        System.out.println("List of Scout Member names only.");
        System.out.println("\t 1. Beaver Scout");
        System.out.println("\t 2. Cub Scout");
        System.out.println("\t 3. Scouter");
        System.out.println();
        System.out.print("Enter choice [1-3]: ");
        // get choice
        choice = ScannerInput.readNextLine().charAt(0);
        System.out.println("Your choice is " + choice);
        System.out.println();
        //dummy read of String to clear the buffer - bug in Scanner class.
        input.nextLine();

        /*Beaver Scout options*/
        if (choice == '1') {
            System.out.println(scoutList.listOfScoutByGroup(1));
        }

            /*Cub Scout options*/
            if (choice == '2') {
                System.out.println(scoutList.listOfScoutByGroup(2));
            }

            /*Scouter options*/
            if (choice == '3') {
                System.out.println(scoutList.listOfScoutByGroup(3));
            }
        }

        /**Method to list the amount Scouts in a particular sub class*/
        private void listAmountOfScoutsByGroup(){
            char choice;
            System.out.println("List of Scout Member names only.");
            System.out.println("\t 1. Beaver Scout");
            System.out.println("\t 2. Cub Scout");
            System.out.println("\t 3. Scouter");
            System.out.println();
            System.out.print("Enter choice [1-3]: ");
            // get choice
            choice = ScannerInput.readNextLine().charAt(0);
            System.out.println("Your choice is " + choice);
            System.out.println();
            //dummy read of String to clear the buffer - bug in Scanner class.
            input.nextLine();

            /*Beaver Scout options*/
            if (choice == '1') {
                System.out.println("Number of Beaver Scouts: " + scoutList.listOfScoutAmount(1));
            }

            /*Cub Scout options*/
            if (choice == '2') {
                System.out.println("Number of Cub Scouts: " + scoutList.listOfScoutAmount(2));
            }

            /*Scouter options*/
            if (choice == '3') {
                System.out.println("Number of Scouters: " + scoutList.listOfScoutAmount(3));
            }
        }

        /**Method to list scouts by name*/
        private void listScoutByName(){
            System.out.println("Enter Scouts Name: ");
            String name = input.next();

            System.out.println(scoutList.listScoutsBySpecificName(name));
        }

        /**Returns the total fees for each subclass*/
        private void totalFees(){
            char choice;
            System.out.println("List of Scout Member names only.");
            System.out.println("\t 1. Beaver Scout");
            System.out.println("\t 2. Cub Scout");
            System.out.println("\t 3. Scouter");
            System.out.println();
            System.out.print("Enter choice [1-3]: ");
            // get choice
            choice = ScannerInput.readNextLine().charAt(0);
            System.out.println("Your choice is " + choice);
            System.out.println();
            //dummy read of String to clear the buffer - bug in Scanner class.
            input.nextLine();

            /*Beaver Scout options*/
            if (choice == '1') {
                System.out.println("The total fees for Beaver Scouts is: " + scoutList.totalFees(1));
            }

            /*Cub Scout options*/
            if (choice == '2') {
                System.out.println("The total fees for Cub Scouts is: " + scoutList.totalFees(2));
            }

            /*Scouter options*/
            if (choice == '3') {
                System.out.println("The total fees for Scouters is: " + scoutList.totalFees(3));
            }
        }

        /**Summary of all numbers of Scouts*/
        private void scoutSummary(){
            System.out.println("Scout Member Summary Report: ");

            System.out.println("Total Number of Scouts: " + scoutList.scoutSummary(0) + "\n");

            System.out.println("Beaver Scout Summary Report: ");
            System.out.println("Total Number of Beaver Scouts: " + scoutList.scoutSummary(1) + "\n");

            System.out.println("Cub Scout Summary Report: ");
            System.out.println("Total Number of Cub Scouts: " + scoutList.scoutSummary(2) + "\n");

            System.out.println("Scouter Summary Report: ");
            System.out.println("Total Number of Scouters: " + scoutList.scoutSummary(3));

        }

}

