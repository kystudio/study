package useradmin.io;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * 该类中包含了常用的IO工具函数
 * Created by kystudio on 2016/7/14.
 */
public class IOUtils {
    /**
     * 该海曙用于装载资源文件
     * @param dir
     * @param fileName
     * @return
     */
    public static Properties loadProperties(String dir, String fileName) {
        Properties properties = new Properties();
        String projectDir = System.getProperty("user.dir");
        String propertiesFilePath = projectDir + File.separator + dir + File.separator + fileName;

        try {
            properties.load(new FileInputStream(new File(propertiesFilePath)));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return properties;
    }
}
