package day001.io;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;

/**
 * Created by kystudio on 2016/5/9.
 */
public class CharsetTest {
    public static void main(String[] args) {
        SortedMap<String,Charset> map = Charset.availableCharsets();

        Set<String> set = map.keySet();

        for (Iterator<String> iter = set.iterator();iter.hasNext();) {
            System.out.println(iter.next());
        }
    }
}
