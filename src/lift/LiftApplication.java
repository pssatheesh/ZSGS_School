package lift;

import lift.liftuser.LiftUserView;

import java.util.*;

public class LiftApplication {
    private Lift lift;
    private static List<Lift> lifts;

    private static LiftApplication LiftApplication;

    private String appName = "Lift Management System";

    private String appVersion = "0.2.0";



    private LiftApplication() {

    }

    public static LiftApplication getInstance() {
        if (LiftApplication == null) {
            LiftApplication = new LiftApplication();
        }
        return LiftApplication;
    }


    public String getAppName() {
        return appName;
    }

    public String getAppVersion() {
        return appVersion;
    }


    public static void main(String[] args) {

        LiftUserView liftUserView = new LiftUserView();
        liftUserView.init();
       // LiftApplication.getInstance();

    }

}

