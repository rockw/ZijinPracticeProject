package lesson.zijin.com.zijinpractice;

/**
 * Created by zxy on 2017/5/18.
 */

public class ZxyMsg {
    public static final int TYPE_RECEIVER=0;
    public  static final int TYPE_SEND=1;

    private String content;//短信的内容
    private int type;

//    @Override
//    public String toString() {
//        return super.toString();
//    }
//
//    public ZxyMsg() {
//        super();
//    }

    public ZxyMsg(String content, int type) {

        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

//    public void setContent(String content) {
//        this.content = content;
//    }

    public int getType() {
        return type;
    }

//    public void setType(int type) {
//        this.type = type;
//    }
}
