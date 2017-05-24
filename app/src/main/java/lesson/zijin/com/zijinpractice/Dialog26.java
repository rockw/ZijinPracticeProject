package lesson.zijin.com.zijinpractice;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Manifest;

public class Dialog26 extends AppCompatActivity {
    private List<Msg26> msgList = new ArrayList<>();
    ArrayAdapter<String> adapter2;
    List<String> contactsList = new ArrayList<>();
    private EditText inputText;
    private Button send;
    private Button button1;
    private Button button2;
    LinearLayout contactpeople;
    LinearLayout bottomlayout;
    LinearLayout abc;
    private RecyclerView msgRecyclerView;
    private MsgAdapter26 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog26);
        initMsgs();
        inputText = (EditText) findViewById(R.id.input_text);
        send = (Button) findViewById(R.id.send);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        abc = (LinearLayout) findViewById(R.id.abc);
        contactpeople = (LinearLayout) findViewById(R.id.contact_people);
        bottomlayout = (LinearLayout) findViewById(R.id.bottom_layout);
        msgRecyclerView = (RecyclerView) findViewById(R.id.msg_recycler_view);



        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        msgRecyclerView.setLayoutManager(layoutManager);
        adapter = new MsgAdapter26(msgList);
        msgRecyclerView.setAdapter(adapter);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = inputText.getText().toString();
                if (!"".equals(content)){
                    Msg26 msg = new Msg26(content,Msg26.TYPE_SENT);
                    msgList.add(msg);
                    adapter.notifyItemInserted(msgList.size()-1);
                    msgRecyclerView.scrollToPosition(msgList.size()-1);
                    inputText.setText("");
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msgRecyclerView.setVisibility(View.VISIBLE);
                abc.setVisibility(View.VISIBLE);
                contactpeople.setVisibility(View.GONE);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msgRecyclerView.setVisibility(View.GONE);
                abc.setVisibility(View.GONE);
                contactpeople.setVisibility(View.VISIBLE);
            }
        });
    }

    private void initMsgs(){
        Msg26 msg1 = new Msg26("hello,guy!",Msg26.TYPE_RECEIVED);
        msgList.add(msg1);
        Msg26 msg2 = new Msg26("hello,你是哪个",Msg26.TYPE_SENT);
        msgList.add(msg2);
        Msg26 msg3 = new Msg26("Tom.",Msg26.TYPE_RECEIVED);
        msgList.add(msg3);
    }
}
