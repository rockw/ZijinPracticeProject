package lesson.zijin.com.zijinpractice;

/**
 * Created by admin on 2017/5/31.
 */

public class Msg_28 {
    public static final int TYPE_RECEIVED = 0;
    public static final int TYPE_SENT = 1;
    private String content;
    private int type;

    public Msg_28(String content, int type) {
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
