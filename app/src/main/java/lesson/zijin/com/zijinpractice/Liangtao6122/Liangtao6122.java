package lesson.zijin.com.zijinpractice.Liangtao6122;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import lesson.zijin.com.zijinpractice.R;

public class Liangtao6122 extends AppCompatActivity {

    private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liangtao6122);
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED) {
            //进入到这里代表没有权限.
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CODE);
        }
        showFragment_1();
    }
    private void showFragment_1() {
        getSupportFragmentManager().beginTransaction().
                replace(R.id.fr,new FragmentList()).commit();
    }
    private void showFragment_2() {
        getSupportFragmentManager().beginTransaction().
                replace(R.id.fr,new FragmentContact()).commit();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mToolBar_1:
                showFragment_1();
                break;
            case R.id.mToolBar_2:
                showFragment_2();
                break;
        }
        return true;
    }


}
