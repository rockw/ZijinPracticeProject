package lesson.zijin.com.zijinpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Qianzhaoyue6109 extends AppCompatActivity {
    private Button btn_ChatToContacts;
    private Button btn_ContactsToChat;
    private LinearLayout qzychatfragment;
    private LinearLayout qzycontactsfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qzy_choose_fragment);
        //绑定按钮
        btn_ChatToContacts = (Button) findViewById(R.id.btn_ChatToContacts);
        btn_ContactsToChat = (Button) findViewById(R.id.btn_ContactsToChat);

        //绑定LinearLayout控件
        qzychatfragment = (LinearLayout) findViewById(R.id.qzychatfragment);
        qzycontactsfragment = (LinearLayout) findViewById(R.id.qzycontactsfragment);
        //点击聊天界面按钮
        btn_ChatToContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qzychatfragment.setVisibility(View.VISIBLE);
                qzycontactsfragment.setVisibility(View.GONE);
            }
        });
        //点击联系人界面按钮
        btn_ContactsToChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qzychatfragment.setVisibility(View.GONE);
                qzycontactsfragment.setVisibility(View.VISIBLE);

            }
        });
    }
}