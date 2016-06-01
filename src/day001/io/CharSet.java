package day001.io;

import java.util.Properties;

/**
 * Created by kystudio on 2016/5/9.
 */
public class CharSet {
    public static void main(String[] args) {
        Properties p = System.getProperties();

        p.list(System.out);
    }
}
