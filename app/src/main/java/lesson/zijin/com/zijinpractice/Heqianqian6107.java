package lesson.zijin.com.zijinpractice;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class Heqianqian6107 extends AppCompatActivity {


    private Button btn_ChatToContacts;
    private Button btn_ContactsToChat;
    private LinearLayout hqqchatfragment;
    private LinearLayout hqqcontactsfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hqq_choose_fragment);
        //绑定按钮
        btn_ChatToContacts = (Button) findViewById(R.id.btn_ChatToContacts);
        btn_ContactsToChat = (Button) findViewById(R.id.btn_ContactsToChat);

        //绑定LinearLayout控件
        hqqchatfragment = (LinearLayout) findViewById(R.id.hqqchatfragment);
        hqqcontactsfragment = (LinearLayout) findViewById(R.id.hqqcontactsfragment);
        //点击聊天界面按钮
        btn_ChatToContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hqqchatfragment.setVisibility(View.VISIBLE);
                hqqcontactsfragment.setVisibility(View.GONE);
            }
        });
        //点击联系人界面按钮
        btn_ContactsToChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hqqchatfragment.setVisibility(View.GONE);
                hqqcontactsfragment.setVisibility(View.VISIBLE);

            }
        });
    }
}
