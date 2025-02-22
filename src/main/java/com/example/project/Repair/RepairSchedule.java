package com.example.project.Repair;
import java.util.ArrayList;

public class RepairSchedule {
    /** Each element represents a repair by an individual mechanic in a bay. */
    private ArrayList<CarRepair> schedule;

    /** Number of mechanics available in this schedule. */
    private int numberOfMechanics;

    /** Constructs a RepairSchedule object.
     * Precondition: n >= 0
     */
    public RepairSchedule(int n) {
        schedule = new ArrayList<>();
        numberOfMechanics = n;
    }


    public ArrayList<CarRepair> getSchedule() {
        return schedule;
    }

    /** Attempts to schedule a repair by a given mechanic in a given bay as described in part (a).
     * Precondition: 0 <= m < numberOfMechanics and b >= 0
     */
    public boolean addRepair(int m, int b) {
        for(int i = 0; i < schedule.size(); i ++){
            if(schedule.get(i).getBayNum() == b || schedule.get(i).getMechanicNum() == m){
                return false;
            }
        }
        schedule.add(new CarRepair(m, b));
        return true;
    }


    /** Returns an ArrayList containing the mechanic identifiers of all available mechanics,
     * as described in part (b).
     */
    public ArrayList<Integer> availableMechanics() {
        ArrayList<Integer> availableList = new ArrayList<Integer>();
        String allMechanics = "";
        for(int i = 0; i < schedule.size(); i ++){
            allMechanics += schedule.get(i).getMechanicNum();
        }
        System.out.println(allMechanics);
        for(int i = 0; i < numberOfMechanics; i ++){
            if(allMechanics.indexOf(String.valueOf(i)) == -1){
                availableList.add(i);
            }
        }
        return availableList;
    }


    /** Removes an element from schedule when a repair is complete.
        THIS METHOD HAS BEEN ADDED FOR ILLUSTRATIVE PURPOSES ONLY,
        AS DESCRIBED IN PART B; you do NOT need to call this
        method as part of your solution to part B
      */
    public void carOut(int b)
    {
        for (int i = 0; i < schedule.size(); i++)
        {
            CarRepair carAtIdx = schedule.get(i);
            if (carAtIdx.getBayNum() == b)
            {
                schedule.remove(i);
            }
        }
    }
}
