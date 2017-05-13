package lesson.zijin.com.zijinpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class zhouliangzhu6114 extends AppCompatActivity {
    private ListView listView;
    private MsgAdapter14 adapter=null;
    private ArrayList<Msg_14> mylist=new ArrayList<>();
    private EditText intput_text;
    private Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhouliangzhu6114);
        findView();
        initData();
        adapter=new MsgAdapter14(zhouliangzhu6114.this,R.layout.msg_14,mylist);
        listView.setAdapter(adapter);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content=intput_text.getText().toString();
                if ("".equals(content)){
                    Toast.makeText(getApplicationContext(),"你输入的内容为空",Toast.LENGTH_SHORT).show();
                }else {
                    Msg_14 msg=new Msg_14(content,Msg_14.TYPE_SEND);
                    mylist.add(msg);
                    adapter.notifyDataSetChanged();
                    listView.smoothScrollToPosition(mylist.size()-1);;
                    intput_text.setText("");
                }
            }
        });


    }
    private void findView(){
        listView=(ListView)findViewById(R.id.listview_chat);
        intput_text=(EditText)findViewById(R.id.input_text);
        btn_send=(Button)findViewById(R.id.btn_send);
    }
    private void initData() {
        Msg_14 msg1 = new Msg_14("你出发了吗？", Msg_14.TYPE_RECEIVER);
        mylist.add(msg1);
        Msg_14 msg2 = new Msg_14("再过一会！", Msg_14.TYPE_SEND);
        mylist.add(msg2);
        Msg_14 msg3 = new Msg_14("好的", Msg_14.TYPE_RECEIVER);
        mylist.add(msg3);
    }
}
