package echo.serverandclient;

import java.io.Serializable;

/**
 * 要发送的数据对象
 * Created by kystudio on 2016/6/2.
 */
public class Info implements Serializable {
    private String to;
    private String from;
    private String info;
    private int type;// 0表示登陆，1表示发送消息

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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
