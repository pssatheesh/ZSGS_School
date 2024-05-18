package lift.liftuser;

import lift.Lift;

import java.util.*;


public class LiftUserView {
    private static LiftUserViewModel liftUserViewModel;
    private static Scanner scanner;
    private static List<Lift> lifts;

    public LiftUserView() {
        liftUserViewModel = new LiftUserViewModel(this);
    }

    public void init() {
        scanner = new Scanner(System.in);
        System.out.println("Enter the number of Lifts: ");
        int numLift = scanner.nextInt();
        liftUserViewModel.createLifts(numLift);
        while (true) {
            System.out.println("1.Display all Lifts \n2.Get Lift\n3.Set Floor Restriction for a lift\n4.Get Lift for given Capacity\n5.Set Maintenance to a lift\n6 Remove Maintenance to a lift\n7.Exit");
            System.out.println("Enter the choice:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayLift();
                    break;
                case 2:
                    accessLift();
                    break;
                case 3:
                    setRestriction();
                    break;
                case 4:
                    setLiftCapacity();
                    break;
                case 5:
                    setLiftMaintenance();
                    break;
                case 6:
                    removeLiftMaintenance();
                    break;
                case 7:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

    }

    private void displayLift() {
        lifts = new ArrayList<>();
        lifts = liftUserViewModel.display();
        for (Lift l : lifts) {
            System.out.println(l);
        }
    }

    private void accessLift() {
        scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Current floor");
        int currentFloor = scanner.nextInt();
        System.out.println("Destination floor");
        int destination = scanner.nextInt();
        Lift lift = liftUserViewModel.getLift(currentFloor, destination);
        System.out.println(lift);
        lift.setCapacity(0);
    }

    private void setRestriction() {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Set<Integer>> restrictedFloors = new HashMap<>();
        System.out.println("Enter the Restricted Lift Number:");
        int liftnumber = scanner.nextInt();
        System.out.println("Enter the number of Restricted Floors");
        int n = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + "th floor number:");
            int temp = scanner.nextInt();
            set.add(temp);
        }
        restrictedFloors.put(liftnumber, set);
        liftUserViewModel.liftRestriction(liftnumber, restrictedFloors);
    }

    private void setLiftCapacity() {
        scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Current floor");
        int currentFloor = scanner.nextInt();
        System.out.println("Destination floor");
        int destination = scanner.nextInt();
        System.out.println("Enter the Capacity");
        int capacity = scanner.nextInt();
        List<Lift> result = liftUserViewModel.getLift(currentFloor, destination, capacity);
        System.out.println(result);
        result.forEach(lift -> lift.setCapacity(0));
    }

    private void setLiftMaintenance() {
        scanner = new Scanner(System.in);
        System.out.println("Enter the Lift number to set Maintenance");
        int number = scanner.nextInt();
        liftUserViewModel.setLiftMaintenance("L" + number);

    }

    private void removeLiftMaintenance() {
        scanner = new Scanner(System.in);
        System.out.println("Enter the Lift number to remove Maintenance");
        int number = scanner.nextInt();
        liftUserViewModel.removeLiftMaintenance("L" + number);

    }
}
