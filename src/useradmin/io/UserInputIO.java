package useradmin.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 用于接收用户从键盘当中输入的数据
 * Created by kystudio on 2016/7/14.
 */
public class UserInputIO {
    private BufferedReader bufferedReader;

    public UserInputIO(){
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getInputLine(){
        String inputLine = null;

        try {
            //  用户输入数据之后，按下回车键，该行代码即可读取到用户的输入。
            inputLine = bufferedReader.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }

        return inputLine;
    }
}
