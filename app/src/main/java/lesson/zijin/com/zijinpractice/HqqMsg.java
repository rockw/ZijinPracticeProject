package lesson.zijin.com.zijinpractice;

/**
 * Created by apple on 2017/3/28.
 */

public class HqqMsg {
    public static final int TYPE_RECEIVER=0;
    public static final int TYPE_SEND=1;

    private String content;//短信的内容
    private int type;

    public HqqMsg(String content, int type) {
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
