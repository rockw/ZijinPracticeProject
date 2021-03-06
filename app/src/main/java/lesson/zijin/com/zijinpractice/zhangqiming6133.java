package lesson.zijin.com.zijinpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class zhangqiming6133 extends AppCompatActivity {

    private Button btn_ChatToContacts;
    private Button btn_ContactsToChat;
    private LinearLayout zqmchatfragment;
    private LinearLayout zqmcontactsfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zqm_choose_fragment);
        //绑定按钮
        btn_ChatToContacts = (Button) findViewById(R.id.btn_ChatToContacts);
        btn_ContactsToChat = (Button) findViewById(R.id.btn_ContactsToChat);

        //绑定LinearLayout控件
        zqmchatfragment = (LinearLayout) findViewById(R.id.zqmchatfragment);
        zqmcontactsfragment = (LinearLayout) findViewById(R.id.zqmcontactsfragment);
        //点击聊天界面按钮
        btn_ChatToContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zqmchatfragment.setVisibility(View.VISIBLE);
                zqmcontactsfragment.setVisibility(View.GONE);
            }
        });
        //点击 联系人界面按钮
        btn_ContactsToChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zqmchatfragment.setVisibility(View.GONE);
                zqmcontactsfragment.setVisibility(View.VISIBLE);

            }
        });
    }

}