package lesson.zijin.com.zijinpractice;

/**
 * Created by Administrator on 2017/4/17.
 */

public class Msg26 {
    public static final int TYPE_RECEIVED = 0;
    public static final int TYPE_SENT = 1;
    private String content;
    private int type;

    public Msg26(String content, int type) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public int getType() {
        return type;
    }
}
