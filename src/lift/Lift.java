package lift;

import java.util.HashSet;
import java.util.Set;

public class Lift {
    private final int allowedCapacity = 5;
    private boolean inMaintenance = false;
    private int capacity;
    private int floor;
    private final String liftNo;
    private Set<Integer> restrictedFloors;

    public Lift(int liftNo,int floor) {
        this.floor = floor;
        this.liftNo = "L"+liftNo;
        this.restrictedFloors = new HashSet<>();
    }

    // Constructor with restricted floors
    public Lift(int liftNo, int floor, Set<Integer> restrictedFloors) {
        this.floor = floor;
        this.liftNo = "L"+liftNo;
        this.restrictedFloors = restrictedFloors;
    }

    public int getFloor() {
        return this.floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getAllowedCapacity() {
        return this.allowedCapacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getLiftNo(){
        return this.liftNo;
    }

    public boolean canServeFloor(int targetFloor) {
        return !restrictedFloors.contains(targetFloor);
    }

    public boolean isNotInMaintenance() {
        return !inMaintenance;
    }

    public void setInMaintenance(boolean inMaintenance) {
        this.inMaintenance = inMaintenance;
    }
    @Override
    public String toString() {
        return  this.liftNo + " - floor: " + this.floor+ " - capacity: " + this.capacity+ "Maintenance State: "+this.inMaintenance ;
    }
}
