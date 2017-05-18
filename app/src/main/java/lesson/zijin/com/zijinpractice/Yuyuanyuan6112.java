package lesson.zijin.com.zijinpractice;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static lesson.zijin.com.zijinpractice.Msg_16.TYPE_RECEIVED;
import static lesson.zijin.com.zijinpractice.Msg_16.TYPE_SENT;

public class Yuyuanyuan6112 extends AppCompatActivity {

    private Button btn_ChatToContacts;
    private Button btn_ContactsToChat;
    private LinearLayout Yyychatfragment;
    private LinearLayout Yyycontactsfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_yyychat);
        //绑定按钮
        btn_ChatToContacts = (Button) findViewById(R.id.btn_ChatToContacts);
        btn_ContactsToChat = (Button) findViewById(R.id.btn_ContactsToChat);

        //绑定LinearLayout控件
        Yyychatfragment = (LinearLayout) findViewById(R.id.Yyychatfragment);
        Yyycontactsfragment = (LinearLayout) findViewById(R.id.YyyContactsFragment);
        //点击聊天界面按钮
        btn_ChatToContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Yyychatfragment.setVisibility(View.VISIBLE);
                Yyycontactsfragment.setVisibility(View.GONE);
            }
        });
        //点击联系人界面按钮
        btn_ContactsToChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Yyychatfragment.setVisibility(View.GONE);
                Yyycontactsfragment.setVisibility(View.VISIBLE);

            }
        });
    }

}