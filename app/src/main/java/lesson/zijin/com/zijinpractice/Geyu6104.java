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

public class Geyu6104 extends AppCompatActivity {
    private Button btn_ChatToContacts;
    private Button btn_ContactsToChat;
    private LinearLayout gychatfragment;
    private LinearLayout gycontactsfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gy_choose_fragment);
        //绑定按钮
        btn_ChatToContacts = (Button) findViewById(R.id.btn_ChatToContacts);
        btn_ContactsToChat = (Button) findViewById(R.id.btn_ContactsToChat);

        //绑定LinearLayout控件
        gychatfragment = (LinearLayout) findViewById(R.id.gychatfragment);
        gycontactsfragment = (LinearLayout) findViewById(R.id.gycontactsfragment);
        //点击聊天界面按钮
        btn_ChatToContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gychatfragment.setVisibility(View.VISIBLE);
                gycontactsfragment.setVisibility(View.GONE);
            }
        });
        //点击联系人界面按钮
        btn_ContactsToChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gychatfragment.setVisibility(View.GONE);
                gycontactsfragment.setVisibility(View.VISIBLE);

            }
        });
    }
}
