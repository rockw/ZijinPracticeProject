package lesson.zijin.com.zijinpractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by 王陈博 on 2017/5/13.
 */

public class cylchatfragment extends Fragment {
    private View view;
    private ListView listView;
    private cylMsgAdapter adapter=null;
    private ArrayList<cylMsg> mylist=new ArrayList<cylMsg>();
    private EditText intput_text;
    private Button btn_send;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_wangchenbo6127,container,false);
        findView();
        //初始化数据 将数据添加到容器中
        initData();
        //将数据放入到适配器中
        adapter=new cylMsgAdapter(getActivity(),R.layout.cyl_chat_item,mylist);
        listView.setAdapter(adapter);
        //按钮的监听事件
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content=intput_text.getText().toString();
                //判空
                if ("".equals(content)){
                    Toast.makeText(getActivity(),"你输入的内容为空",Toast.LENGTH_SHORT).show();
                }else {
                    //不为空
                    cylMsg msg=new cylMsg(content,cylMsg.TYPE_SEND);
                    mylist.add(msg);
                    //刷新消息
                    adapter.notifyDataSetChanged();
                    listView.smoothScrollToPosition(mylist.size()-1);;//将listview定位到最后一行
                    intput_text.setText("");//清空
                }
            }
        });
        return view;
    }

    //绑定控件
    private void findView(){
        listView=(ListView)view.findViewById(R.id.listview_chat);
        intput_text=(EditText)view.findViewById(R.id.input_text);
        btn_send=(Button)view.findViewById(R.id.btn_send);
    }
    //初始化数据
    private void initData(){
        cylMsg msg1=new cylMsg("吃饭了吗？",cylMsg.TYPE_RECEIVER);
        mylist.add(msg1);
        cylMsg msg2=new cylMsg("吃了！",cylMsg.TYPE_SEND);
        mylist.add(msg2);
        cylMsg msg3=new cylMsg("什么时候出发？",cylMsg.TYPE_RECEIVER);
        mylist.add(msg3);
    }
}
