package day004.url;

import java.net.URL;

/**
 * Created by kystudio on 2016/7/19.
 */
public class UrlTest {
    public static void main(String[] args) throws Exception {
        String urlString = "http://sports.sina.com.cn/basketball/nba/2016-07-19/doc-ifxuapvw2330356.shtml";
        urlString = "http://java.sun.com:80/docs/books/tutorial/index.html#DOWN";

        URL url = new URL(urlString);

        String protocol = url.getProtocol();
        String host = url.getHost();
        String file = url.getFile();
        int port = url.getPort();
        String ref = url.getRef();

        System.out.println(protocol);
        System.out.println(host);
        System.out.println(file);
        System.out.println(port);
        System.out.println(ref);
    }
}
