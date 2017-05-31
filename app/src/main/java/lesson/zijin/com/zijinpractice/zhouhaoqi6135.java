package lesson.zijin.com.zijinpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class zhouhaoqi6135 extends AppCompatActivity {

    private Button btn_ChatToContacts;
    private Button btn_ContactsToChat;
    private LinearLayout zhqchatfragment;
    private LinearLayout zhqcontactsfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhq_choose_fragment);
        //绑定按钮
        btn_ChatToContacts = (Button) findViewById(R.id.btn_ChatToContacts);
        btn_ContactsToChat = (Button) findViewById(R.id.btn_ContactsToChat);

        //绑定LinearLayout控件
        zhqchatfragment = (LinearLayout) findViewById(R.id.zhqchatfragment);
        zhqcontactsfragment = (LinearLayout) findViewById(R.id.zhqcontactsfragment);
        //点击聊天界面按钮
        btn_ChatToContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zhqchatfragment.setVisibility(View.VISIBLE);
                zhqcontactsfragment.setVisibility(View.GONE);
            }
        });
        //点击联系人界面
        btn_ContactsToChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zhqchatfragment.setVisibility(View.GONE);
                zhqcontactsfragment.setVisibility(View.VISIBLE);

            }
        });
    }

}