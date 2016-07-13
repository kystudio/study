package useradmin;

import useradmin.logic.MainLooper;
import useradmin.ui.UserAdminUI;

/**
 * Created by kystudio on 2016/7/12.
 */
public class Main {
    public static void main(String[] args) {
        UserAdminUI ui = new UserAdminUI();
        ui.loadUI();

        MainLooper mainLooper = new MainLooper();
        mainLooper.loop();
    }
}
