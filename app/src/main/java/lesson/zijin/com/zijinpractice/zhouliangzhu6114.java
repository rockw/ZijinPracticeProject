package lesson.zijin.com.zijinpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class zhouliangzhu6114 extends AppCompatActivity {
    private Button btn_ChatToContacts;
    private Button btn_ContactsToChat;
    private LinearLayout chatfragment14;
    private LinearLayout contactsfragment14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_fragment_14);
        //绑定按钮
        btn_ChatToContacts = (Button) findViewById(R.id.btn_ChatToContacts);
        btn_ContactsToChat = (Button) findViewById(R.id.btn_ContactsToChat);

        //绑定LinearLayout控件
        chatfragment14 = (LinearLayout) findViewById(R.id.chatfragment14);
        contactsfragment14 = (LinearLayout) findViewById(R.id.contactsfragment14);
        //点击聊天界面按钮
        btn_ChatToContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chatfragment14.setVisibility(View.VISIBLE);
                contactsfragment14.setVisibility(View.GONE);
            }
        });
        //点击联系人界面按钮
        btn_ContactsToChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chatfragment14.setVisibility(View.GONE);
                contactsfragment14.setVisibility(View.VISIBLE);

            }
        });
    }

}
