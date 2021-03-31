import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.*;
import java.util.ArrayList;

/**
 * ScoutList Class
 * @author Evan Casey
 * @version 1.0
 */

public class ScoutList {
    /**ArrayList for Scout objects*/
    private ArrayList<Scout> scouts = new ArrayList<>();

    /**Method to Add Scout*/
    public void addScout(Scout scout) {
        scouts.add(scout);
    }

    /**Method which
     * @returns the arraylist scout */
    public ArrayList<Scout> getScouts() {
        return scouts;
    }

    /**Method to return the total number of Scouts per subClass using
     *  @variable totalScout which is returned at the end*/
    public int listOfScoutAmount(int x) {
            int totalScout = 0;
            for(Scout scout : scouts) {
                if (x == 1 && scout instanceof BeaverScout) {
                    totalScout = totalScout + 1;
                } else if (x == 2 && scout instanceof CubScout) {
                    totalScout = totalScout + 1;
                } else if (x == 3 && scout instanceof Scouter) {
                    totalScout = totalScout + 1;
                }
            }
                return totalScout;
    }

    /**List of all scout numbers calculating running total using
     * @variable totalScout which is returned based on user choice*/
    public int scoutSummary(int x) {
        int totalScout = 0;
        for(Scout scout : scouts) {
           if ( x == 0) {
             totalScout = scouts.size();
           }
            else if ( x == 1 && scout instanceof BeaverScout) {
                totalScout = totalScout + 1 ;
            } else if ( x == 2 && scout instanceof CubScout) {
                totalScout = totalScout + 1;
            } else if ( x == 3 && scout instanceof Scouter) {
                totalScout = totalScout + 1;
            }
        }
        return totalScout;
    }

    /**Method to return the total fees of all Scouts using instanceof operator & interface method calcMembership for each subClass of Scout*/
    public double totalFees(int x){
        double totalScout = 0;
        for(Scout scout : scouts) {
            if (x == 1 && scout instanceof BeaverScout) {
                totalScout = totalScout + 1 * scout.calcMembership();
            } else if (x == 2 && scout instanceof CubScout) {
                totalScout = totalScout + 1 * scout.calcMembership();
            } else if (x == 3 && scout instanceof Scouter) {
                totalScout = totalScout + 1 * scout.calcMembership();
            }
        }
        return totalScout;
    }


    /**Method to list scouts which
     * @returns listScout if scouts exists else it
     * @returns "There are no scouts in the list" */

    public String listOfScouts() {
        if (scouts.size() == 0) {
            return " There are no scouts in the list";
        } else {
            String listScout = "";
            for (int i = 0; i < scouts.size(); i++) {
                listScout = listScout + i + ": " + scouts.get(i) + "\n";
            }
            return listScout;
        }
    }

    /** Returns list of Scouts Names from each instanceof scout subClasses using the .getName method*/
    public String listOfScoutByGroup(int x) {
        if (scouts.size() == 0) {
            return " There are no scouts in the list";
        } else {
            String listScout = "";
            for(Scout scout : scouts) {
                if (x == 1 && scout instanceof BeaverScout) {
                    listScout = listScout + ": " + scout.getName() + "\n";
                } else if (x == 2 && scout instanceof CubScout){
                    listScout = listScout + ": " + scout.getName();
                } else if (x == 3 && scout instanceof Scouter){
                    listScout = listScout + ": " + scout.getName();
                }
            }
            return listScout;
        }
    }

    /**Method to list names of scouts using a for each loop to state for each scout check the name contains the
     * @param name then assign it to the @variable name which contains the to string of the Scout class
     * else
     * @return names*/
    public String listScoutsBySpecificName(String name) {
        if (scouts.size() == 0) {
            return " There are no scouts in the list ";
        }
        //For each loop
        String names = " ";
        for (Scout scout : scouts) {
                        if (scout.getName().equalsIgnoreCase(name)) {
                            names = names + scout.toString();
                        }
        }
        return names;
    }

    /** Method to remove a Scout from a particular index if it exists using the
     * @param scoutI which
     * @return true and remove a scout from a particular index
     * else @return false if the arrayList scouts is empty
     */
    public boolean removeScout(int scoutI) {
        if (scouts.size() < scoutI) {
            return false;
        }
        else {
            scouts.remove(scoutI);
            return true;
        }
    }

    /** Method to load scouts*/
    public void load() throws Exception
    {
        XStream xstream = new XStream(new DomDriver());
        ObjectInputStream is = xstream.createObjectInputStream(new FileReader("scouts.xml"));
        scouts = (ArrayList<Scout>) is.readObject();
        is.close();
    }

    /** Method to save scouts*/
    @SuppressWarnings("unchecked")
    public void save() throws Exception
    {
        XStream xstream = new XStream(new DomDriver());
        ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("scouts.xml"));
        out.writeObject(scouts);
        out.close();
    }

}
