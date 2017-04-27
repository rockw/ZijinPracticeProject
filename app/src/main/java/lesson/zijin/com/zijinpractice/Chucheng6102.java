package lesson.zijin.com.zijinpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static lesson.zijin.com.zijinpractice.Msg_02.TYPE_RECEIVED;
import static lesson.zijin.com.zijinpractice.Msg_02.TYPE_SENT;

public class Chucheng6102 extends AppCompatActivity {
    private ListView msgListView;

    private EditText inputText;
    private Button send;
    private MsgAdapter_02 adapter;private List<Msg_02> msgList = new ArrayList<Msg_02>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_chucheng6102);
        initMsgs(); // 初始化消息数据
        adapter = new MsgAdapter_02(Chucheng6102.this, R.layout.msg_02, msgList);
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
                    Msg_02 msg = new Msg_02(content, TYPE_SENT);
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
        Msg_02 msg1 = new Msg_02("dada,喝酸奶吗？", TYPE_RECEIVED);
        msgList.add(msg1);
        Msg_02 msg2 = new Msg_02("喝.", TYPE_SENT);
        msgList.add(msg2);
        Msg_02 msg3 = new Msg_02("走! ", TYPE_RECEIVED);
        msgList.add(msg3);
    }
}
