package lesson.zijin.com.zijinpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   public final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Wangchenbo6127.class);
                startActivity(intent);
            }
        });
        Button bt1 = (Button) findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Guying6105.class);
                startActivity(intent);

            }
        });

        Button cj= (Button) findViewById(R.id.cj);
        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Chengjie6101.class);
                startActivity(intent);

            }
        });
        Button fy= (Button) findViewById(R.id.fy);
        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,fangyan6103.class);
                startActivity(intent);

            }
        });
        Button button1=(Button)findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent=new Intent(MainActivity.this,Yuyuanyuan6112.class);
                startActivity(intent);
            }
        });

        Button abc=(Button)findViewById(R.id.abc);
        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Ezl6117.class);
                startActivity(intent);
            }
        });


        Button cl6116 = (Button) findViewById(R.id.cl6116);
        cl6116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Chenglei6116.class);
                startActivity(intent);
            }
        });



        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sunbaoqi6126Activity.class);
                startActivity(intent);
            }
        });


        Button cc = (Button) findViewById(R.id.cc);
        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Chucheng6102.class);
                startActivity(intent);
            }
        });


        Button hqq = (Button) findViewById(R.id.hqq);
        hqq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Heqianqian6107.class);
                startActivity(intent);
            }
        });

        Button qzy = (Button) findViewById(R.id.qzy);
        hqq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Qianzhaoyue6109.class);
                startActivity(intent);
            }
        });
        Button GY = (Button) findViewById(R.id.GY);
        hqq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Geyu6104.class);
                startActivity(intent);
            }
        });
    }

}
