package lesson.zijin.com.zijinpractice;

/**
 * Created by pc on 2017/4/27.
 */

public class Msg_01 {
    public static final int TYPE_SENT = 1;
    public static final int TYPE_RECEIVED = 0;
    private String content;
    private int type;
    public Msg_01(String content, int type)
    {
        this.content = content;
        this.type = type;
    }
    public String getContent()
    {
        return content;
    }
    public int getType()
    {
        return type;
    }
}

