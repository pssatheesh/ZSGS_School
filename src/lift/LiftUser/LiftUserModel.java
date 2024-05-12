package lift.LiftUser;

import lift.Lift;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LiftUserModel {
    private LiftUserView liftUserView;
    private final List<Lift> lifts = new ArrayList<>();

    public LiftUserModel(LiftUserView liftUserView) {
        this.liftUserView = liftUserView;
    }

    public void createLifts(int numLifts) {
        for (int i = 1; i <= numLifts; i++) {
            lifts.add(new Lift(i, 0));
        }
    }

    public List<Lift> display() {
        return lifts;
    }

    public Lift getLift(int currentFloor, int targetFloor) {
        int minDiff = 10;
        Lift resultLift = lifts.get(0);
        for (Lift lift : lifts) {
            if (lift.isNotInMaintenance() && lift.canServeFloor(currentFloor) && lift.canServeFloor(targetFloor)) {
                int temp = Math.abs(currentFloor - lift.getFloor());
                if (lift.getCapacity() < lift.getAllowedCapacity()) {
                    if (temp < minDiff) {
                        minDiff = temp;
                        resultLift = lift;
                    }
                    if (temp == minDiff) {
                        if (currentFloor < targetFloor) {
                            resultLift = resultLift.getFloor() < currentFloor ? resultLift : lift;
                        } else if (currentFloor > targetFloor) {
                            resultLift = resultLift.getFloor() > currentFloor ? resultLift : lift;
                        } else {
                            System.out.println("Current floor and Target Floor cannot be same.");
                        }
                    }
                }
            }
        }
        resultLift.setFloor(targetFloor);

        return resultLift;
    }

    public void liftRestriction(int numLifts, Map<Integer, Set<Integer>> restrictedFloors) {
        for (int i = 1; i <= numLifts; i++) {
            if (restrictedFloors.containsKey(i)) {
                lifts.add(new Lift(i, 0, restrictedFloors.get(i)));
            } else {
                lifts.add(new Lift(i, 0));
            }
        }
    }

    public List<Lift> getLift(int currentFloor, int targetFloor, int capacity) {
        List<Lift> resultLifts = new ArrayList<>();

        Lift lift;
        int remainingCapacity;

        do {
            lift = getLift(currentFloor, targetFloor);
            remainingCapacity = Math.abs(lift.getCapacity() - lift.getAllowedCapacity());

            if (capacity <= remainingCapacity) {
                lift.setCapacity(lift.getCapacity() + capacity);
                capacity = 0;
                remainingCapacity -= capacity;
            } else {
                lift.setCapacity(lift.getCapacity() + remainingCapacity);
                capacity -= remainingCapacity;
                remainingCapacity = 0;
            }

            resultLifts.add(lift);

        } while (remainingCapacity <= capacity && resultLifts.size() < lifts.size());

        if (capacity > 0) {
            System.out.println("All lifts are taken and working with maximum capacity.\n" + capacity + " - person should wait till the other lifts come to your floor.");
        }

        return resultLifts;
    }

    public void setLiftMaintenance(String liftNo) {
        this.lifts.forEach(lift -> {
            if (lift.getLiftNo().equalsIgnoreCase(liftNo))
                lift.setInMaintenance(true);
        });
    }

    public void removeLiftMaintenance(String liftNo) {
        this.lifts.forEach(lift -> {
            if (lift.getLiftNo().equalsIgnoreCase(liftNo))
                lift.setInMaintenance(false);
        });
    }
}
