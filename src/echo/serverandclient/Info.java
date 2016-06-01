package echo.serverandclient;

import java.io.Serializable;

/**
 * 要发送的数据对象
 * Created by kystudio on 2016/6/2.
 */
public class Info implements Serializable {
    private String to;
    private  String from;
    private String info;

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getInfo() {
        return info;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Info{" +
                "to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
