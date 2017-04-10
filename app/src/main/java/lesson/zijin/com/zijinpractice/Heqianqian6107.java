package lesson.zijin.com.zijinpractice;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class Heqianqian6107 extends AppCompatActivity {

    private ListView listView;
    private HqqMsgAdapter adapter = null;
    private ArrayList<HqqMsg> mylist = new ArrayList<HqqMsg>();
    private EditText input_hqq;
    private Button sendbtn_hqq;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        initData();
        setContentView(R.layout.activity_heqianqian6107);
        findView();

        adapter = new HqqMsgAdapter(Heqianqian6107.this,R.layout.acticity_hqqmsg_item,mylist);
        listView.setAdapter(adapter);
        sendbtn_hqq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content=input_hqq.getText().toString();
                if(TextUtils.isEmpty(content)){
                    Toast.makeText(getApplication(),"你输入的内容为空",Toast.LENGTH_SHORT).show();
                }else {
                    HqqMsg msg=new HqqMsg(content,HqqMsg.TYPE_SEND);
                    mylist.add(msg);
                    adapter.notifyDataSetChanged();
                    listView.setSelection(mylist.size());
                    input_hqq.setText("");
                }
            }
        });
    }

    public void findView(){
        listView = (ListView) findViewById(R.id.listview_hqq);
        input_hqq = (EditText) findViewById(R.id.input_hqq);
        sendbtn_hqq = (Button) findViewById(R.id.sendbtn_hqq);
    }
    public void initData(){
        HqqMsg msg1 = new HqqMsg("小宝贝",HqqMsg.TYPE_RECEIVER);
        mylist.add(msg1);
        HqqMsg msg2 = new HqqMsg("干啥",HqqMsg.TYPE_SEND);
        mylist.add(msg2);
        HqqMsg msg3 = new HqqMsg("叫叫你",HqqMsg.TYPE_RECEIVER);
        mylist.add(msg3);
    }
}
