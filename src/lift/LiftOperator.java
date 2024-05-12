package lift;

import java.util.*;


public class LiftOperator {
    List<Lift> lifts = new ArrayList<>();

//    public LiftOperator(int numLifts) {
//        for (int i = 1; i <= numLifts; i++) {
//            lifts.add(new Lift(i, 0));
//        }
//    }
//    public List<Lift> display(){
//        return lifts;
//    }
    public void LiftRestriction(int numLifts, Map<Integer, Set<Integer>> restrictedFloors) {
        for (int i = 1; i <= numLifts; i++) {
            if (restrictedFloors.containsKey(i)) {
                lifts.add(new Lift(i, 0, restrictedFloors.get(i)));
            } else {
                lifts.add(new Lift(i, 0));
            }
        }
    }

    public Lift getLift(int currentFloor, int targetFloor){
        int minDiff = 10;
        Lift resultLift = lifts.get(0);
        for(Lift lift: lifts){
            if(lift.canServeFloor(currentFloor) && lift.canServeFloor(targetFloor)){
                int temp =Math.abs(currentFloor-lift.getFloor());
                if(lift.getCapacity() < lift.getAllowedCapacity()){
                    if(temp < minDiff){
                        minDiff = temp;
                        resultLift = lift;
                    }
                    if(temp == minDiff) {
                        if(currentFloor < targetFloor) {
                            resultLift = resultLift.getFloor() < currentFloor ? resultLift : lift;
                        } else if(currentFloor > targetFloor) {
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

    public List<Lift> getLift(int currentFloor, int targetFloor, int capacity){
        List<Lift> resultLifts = new ArrayList<>();

        Lift lift;
        int remainingCapacity;

        do{
            lift = getLift(currentFloor,targetFloor);
            remainingCapacity = Math.abs(lift.getCapacity()-lift.getAllowedCapacity());

            if(capacity <= remainingCapacity){
                lift.setCapacity(lift.getCapacity() + capacity);
                capacity = 0;
                remainingCapacity -= capacity;
            } else {
                lift.setCapacity(lift.getCapacity() + remainingCapacity);
                capacity-=remainingCapacity;
                remainingCapacity = 0;
            }

            resultLifts.add(lift);

        }while(remainingCapacity <= capacity);

        return resultLifts;
    }

}
