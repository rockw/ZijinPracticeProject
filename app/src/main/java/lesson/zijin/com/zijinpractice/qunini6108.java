package lesson.zijin.com.zijinpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class qunini6108 extends AppCompatActivity {

    private Button btn_ChatToContacts;
    private Button btn_ContactsToChat;
    private LinearLayout qnnchatfragment;
    private LinearLayout qnncontactsfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qnn_choose_fragment);
        //绑定按钮
        btn_ChatToContacts = (Button) findViewById(R.id.btn_ChatToContacts);
        btn_ContactsToChat = (Button) findViewById(R.id.btn_ContactsToChat);

        //绑定LinearLayout控件
        qnnchatfragment = (LinearLayout) findViewById(R.id.qnnchatfragment);
        qnncontactsfragment = (LinearLayout) findViewById(R.id.qnncontactsfragment);
        //点击聊天界面按钮
        btn_ChatToContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qnnchatfragment.setVisibility(View.VISIBLE);
                qnncontactsfragment.setVisibility(View.GONE);
            }
        });
        //点击联系人界面按钮
        btn_ContactsToChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qnnchatfragment.setVisibility(View.GONE);
                qnncontactsfragment.setVisibility(View.VISIBLE);

            }
        });
    }

}
