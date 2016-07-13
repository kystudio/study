package useradmin.ui;

import useradmin.io.IOUtils;
import useradmin.model.User;

import java.util.Properties;

/**
 * 该类用于定义整个应用程序的UI系统
 * Created by kystudio on 2016/7/12.
 */
public class UserAdminUI {
    private static Properties properties = null;

    static {
        properties = IOUtils.loadProperties("resources", "info.properties");
    }

    public void loadUI() {
        System.out.println(getHelpInfo("welcome"));
    }

    public String getHelpInfo(String key) {
        String helpInfo = properties.getProperty(key);

        return helpInfo;
    }

    /*
    public void displayHelp() {
        System.out.println("*********************USER ADMIN*********************");
        System.out.println("欢迎使用用户管理系统");
        System.out.println("具体使用方法如下：");
        System.out.println("1->添加用户");
        System.out.println("2->删除用户");
        System.out.println("3->更新用户数据");
        System.out.println("4->查询用户");
        System.out.println("5->退出");
        System.out.println("*********************USER ADMIN*********************");
        System.out.println("请选择您所需要的功能：");
    }

    public void displayAddUserHelp() {
        System.out.println("添加用户的操作方法：add 用户名 年龄 性别 薪水");
        System.out.println("例子：add 张三 33 男 8000.00");
    }

    public void displayDeleteUserHelp() {
        System.out.println("删除用户的操作方法：delete id 或者 delete 用户名");
        System.out.println("例子：delete 5 或者 delete 张三");
    }

    public void displayUpdateUserHelp() {
        System.out.println("更新用户的操作方法：update id:id salary=薪水");
        System.out.println("例子：update id:5 salsry=10000.00");
    }

    public void displayQueryUserHelp() {
        System.out.println("查询用户的操作方法：query id=id 或者 query name=用户名 或者 query salsry>薪水");
        System.out.println("例子：query id=5 或者 query name=张三 或者 query salary>5000.00");
    }
    */

    public void displayUserInfo(User user) {
        System.out.println("id:" + user.getId() + "\tname:" + user.getName() + "\tage:" + user.getAge() + "\tgender:" + user.getGender() + "\tsalary:" + user.getSalary());
    }
}
