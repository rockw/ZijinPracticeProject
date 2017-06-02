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

import static lesson.zijin.com.zijinpractice.Msg_16.TYPE_RECEIVED;
import static lesson.zijin.com.zijinpractice.Msg_16.TYPE_SENT;

public class Wangjinyuan6129 extends Activity
{   private ListView msgListView;

    private EditText inputText;
    private Button send;
    private MsgAdapter_29 adapter;private List<Msg_29> msgList = new ArrayList<Msg_29>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_wangjinyuan6129);
        initMsgs(); // 初始化消息数据
        adapter = new MsgAdapter_29(Wangjinyuan6129.this, R.layout.msg_29, msgList);
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
                    Msg_29 msg = new Msg_29(content, TYPE_SENT);
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
        Msg_29 msg1 = new Msg_29("Hello.", TYPE_RECEIVED);
        msgList.add(msg1);
        Msg_29 msg2 = new Msg_29("Hello. How are you?", TYPE_SENT);
        msgList.add(msg2);
        Msg_29 msg3 = new Msg_29("I'm fine,thank you! ", TYPE_RECEIVED);
        msgList.add(msg3);
    }
}