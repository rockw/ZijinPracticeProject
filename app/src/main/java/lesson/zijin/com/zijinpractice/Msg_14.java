package lesson.zijin.com.zijinpractice;

/**
 * Created by Barbara on 2017/5/13.
 */

public class Msg_14 {
    public static final int TYPE_RECEIVER=0;
    public  static final int TYPE_SEND=1;

    private String content;//短信的内容
    private int type;
    public Msg_14(String content, int type) {

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
