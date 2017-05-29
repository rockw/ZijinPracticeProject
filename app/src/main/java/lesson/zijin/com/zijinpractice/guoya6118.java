package lesson.zijin.com.zijinpractice;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/20 0020.
 */

public class guoya6118 extends AppCompatActivity {
    private ListView msgListView;

    private EditText inputText;
    private Button send;
    private MsgAdapter_18 adapter;private List<Msg_18> msgList = new ArrayList<Msg_18>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guoya6118);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.chenglei6116);
        initMsgs(); // 初始化消息数据
        adapter = new MsgAdapter_18(guoya6118.this, R.layout.msg_18, msgList);
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
                    Msg_18 msg = new Msg_18(content,Msg_18.TYPE_SENT);
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
        Msg_18 msg1 = new Msg_18("Hello.What's your name?", Msg_18.TYPE_RECEIVED);
        msgList.add(msg1);
        Msg_18 msg2 = new Msg_18("My name is guoya.", Msg_18.TYPE_SENT);
        msgList.add(msg2);
        Msg_18 msg3 = new Msg_18("Nice to meet you! ", Msg_18.TYPE_RECEIVED);
        msgList.add(msg3);
    }
}
