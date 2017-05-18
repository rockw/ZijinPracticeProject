package lesson.zijin.com.zijinpractice;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static lesson.zijin.com.zijinpractice.Msg_05.TYPE_RECEIVED;
import static lesson.zijin.com.zijinpractice.Msg_05.TYPE_SENT;

/**
 * Created by Administrator on 2017/5/14.
 */

public class ChatFragment_05 extends Fragment {
    private View view;
    private ListView msgListview;
    private EditText inputText;
    private Button send;
    private MsgAdapter_05 adapter;
    private List<Msg_05> msgList = new ArrayList<Msg_05>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        view = inflater.inflate(R.layout.activity_guying6105,container,false);
        findView();
        initData();
        adapter=new MsgAdapter_05(getActivity(),R.layout.msg_05,msgList);
        msgListview.setAdapter(adapter);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = inputText.getText().toString();
                if (!"".equals(content)) {
                    Msg_05 msg = new Msg_05(content, TYPE_SENT);
                    msgList.add(msg);
                    adapter.notifyDataSetChanged(); // 当有新消息时，刷新ListView中的显示
                    msgListview.setSelection(msgList.size()); // 将ListView定位到最后一行
                    inputText.setText(""); // 清空输入框中的内容

                }
            }
        });
        return view;
    }

    private void initData() {
        Msg_05 msg1 = new Msg_05("hi,guy", TYPE_RECEIVED);
        msgList.add(msg1);
        Msg_05 msg2 = new Msg_05("oh,hello", TYPE_SENT);
        msgList.add(msg2);
        Msg_05 msg3 = new Msg_05("Nice to meet you! ", TYPE_RECEIVED);
        msgList.add(msg3);
    }

    private void findView() {
        msgListview=(ListView)view.findViewById(R.id.msg_list_view);
        inputText=(EditText)view.findViewById(R.id.input_text);
        send=(Button)view.findViewById(R.id.send);

    }
}
