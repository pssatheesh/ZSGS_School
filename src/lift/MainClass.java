package lift;

import lift.LiftUser.LiftUserView;

import java.util.*;


public class MainClass {
    private Lift lift;
    private static List<Lift> lifts;

    public static void main(String[] args) {
        //int numLifts = 5;

//        Scanner scanner=new Scanner(System.in);
//        Map<Integer, Set<Integer>> restrictedFloors = new HashMap<>();
//        System.out.println("Enter the Restricted Lift Number:");
//        int liftnumber=scanner.nextInt();
//        System.out.println("Enter the number of Restricted Floors");
//        int n=scanner.nextInt();
//        Set<Integer> set=new HashSet<>();
//        for(int i=0;i<n;i++){
//            int temp=scanner.nextInt();
//            set.add(temp);
//        }
//        restrictedFloors.put(liftnumber, set);
//
//        LiftOperator liftOperator = new LiftOperator(numLifts);
//
//        liftOperator.LiftRestriction(numLifts, restrictedFloors);
//
//        System.out.println(liftOperator.getLift(4,10)); //L1
//        System.out.println(liftOperator.getLift(1,7));  //L2
//        System.out.println(liftOperator.getLift(4,0));  //L2
//        System.out.println(liftOperator.getLift(6,8));  //L1
//        System.out.println(liftOperator.getLift(1,7));  //L2
//        System.out.println(liftOperator.getLift(3,8));  //L3

        LiftUserView liftUserView = new LiftUserView();
        liftUserView.init();
    }

}
