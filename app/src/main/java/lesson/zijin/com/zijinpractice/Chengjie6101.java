package lesson.zijin.com.zijinpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Chengjie6101 extends AppCompatActivity {
    private Button btn_ChatToContacts;
    private Button btn_ContactsToChat;
    private LinearLayout cjchatfragment;
    private LinearLayout cjcontactsfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cj_choose_fragment);
        //绑定按钮
        btn_ChatToContacts = (Button) findViewById(R.id.btn_ChatToContacts);
        btn_ContactsToChat = (Button) findViewById(R.id.btn_ContactsToChat);

        //绑定LinearLayout控件
        cjchatfragment = (LinearLayout) findViewById(R.id.cjchatfragment);
        cjcontactsfragment = (LinearLayout) findViewById(R.id.cjcontactsfragment);
        //点击聊天界面按钮
        btn_ChatToContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cjchatfragment.setVisibility(View.VISIBLE);
                cjcontactsfragment.setVisibility(View.GONE);
            }
        });
        //点击联系人界面按钮
        btn_ContactsToChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cjchatfragment.setVisibility(View.GONE);
                cjcontactsfragment.setVisibility(View.VISIBLE);

            }
        });
    }
}
