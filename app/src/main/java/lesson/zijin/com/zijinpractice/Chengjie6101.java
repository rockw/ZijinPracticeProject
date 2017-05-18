package lesson.zijin.com.zijinpractice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static lesson.zijin.com.zijinpractice.Msg_01.TYPE_RECEIVED;
import static lesson.zijin.com.zijinpractice.Msg_01.TYPE_SENT;

public class Chengjie6101 extends Activity {
    private ListView msgListView;

    private EditText inputText;
    private Button send;
    private MsgAdapter_01 adapter;private List<Msg_01> msgList = new ArrayList<Msg_01>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_chengjie6101);
        initMsgs(); // 初始化消息数据
        adapter = new MsgAdapter_01(Chengjie6101.this, R.layout.msg_01, msgList);
        inputText = (EditText) findViewById(R.id.input_text);
        send = (Button) findViewById(R.id.send);
        msgListView = (ListView) findViewById(R.id.msg_list_view);
        msgListView.setAdapter(adapter);
        send.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String content = inputText.getText().toString();
                if (!"".equals(content))
                {
                    Msg_01 msg = new Msg_01(content, TYPE_SENT);
                    msgList.add(msg);
                    adapter.notifyDataSetChanged(); // 当有新消息时，刷新ListView中的显示
                    msgListView.setSelection(msgList.size()); // 将ListView定位到最后一行
                    inputText.setText(""); // 清空输入框中的内容
                }
            }
        });
    }
    private void initMsgs()
    {
        Msg_01 msg1 = new Msg_01("想喝一点点", TYPE_RECEIVED);
        msgList.add(msg1);
        Msg_01 msg2 = new Msg_01("好呀，走！", TYPE_SENT);
        msgList.add(msg2);
        Msg_01 msg3 = new Msg_01("Go,Go,Go! ", TYPE_RECEIVED);
        msgList.add(msg3);
    }
}
