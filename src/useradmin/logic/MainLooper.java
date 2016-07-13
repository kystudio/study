package useradmin.logic;

import useradmin.io.UserInputIO;

/**
 * Created by kystudio on 2016/7/14.
 */
public class MainLooper {
    private boolean flag = true;
    public UserInputIO userInputIO;

    public MainLooper(){
        userInputIO = new UserInputIO();
    }

    public void loop(){
        while (flag){
            String input = userInputIO.getInputLine();
            System.out.println(input);
        }
    }
}
