package lesson.zijin.com.zijinpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Guying6105 extends AppCompatActivity {

    private Button btnchat;
    private Button btnlink;
    private LinearLayout chatfragment;
    private LinearLayout linkfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_05);
        //绑定按钮
        btnchat = (Button) findViewById(R.id.btn_chat);
        btnlink = (Button) findViewById(R.id.btn_link);

        //绑定LinearLayout控件
        chatfragment = (LinearLayout) findViewById(R.id.fragment_chat05);
        linkfragment = (LinearLayout) findViewById(R.id.fragment_contect05);
        //点击聊天界面按钮
        btnchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chatfragment.setVisibility(View.VISIBLE);
                linkfragment.setVisibility(View.GONE);
            }
        });
        //点击联系人界面按钮
        btnlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chatfragment.setVisibility(View.GONE);
                linkfragment.setVisibility(View.VISIBLE);

            }
        });
    }

}
