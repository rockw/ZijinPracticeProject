package lesson.zijin.com.zijinpractice;

/**
 * Created by huizhiheng on 2017/4/9.
 */

public class Msg_20 {
    public static final int TYPE_SENT = 1;
    public static final int TYPE_RECEIVED = 0;
    private String content;
    private int type;
    public Msg_20(String content, int type)
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