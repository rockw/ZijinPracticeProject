package lesson.zijin.com.zijinpractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static lesson.zijin.com.zijinpractice.R.id.btn_send;

/**
 * Created by mac on 2017/5/14.
 */

public class HqqChatFragment extends Fragment {


    private View view;
    private ListView listView;
    private HqqMsgAdapter adapter = null;
    private ArrayList<HqqMsg> mylist = new ArrayList<HqqMsg>();
    private EditText input_hqq;
    private Button sendbtn_hqq;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_heqianqian6107,container,false);
        findView();
        //初始化数据 将数据添加到容器中
        initData();
        //将数据放入到适配器中
        adapter=new HqqMsgAdapter(getActivity(),R.layout.acticity_hqqmsg_item,mylist);
        listView.setAdapter(adapter);
        //按钮的监听事件
        sendbtn_hqq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content=input_hqq.getText().toString();
                //判空
                if ("".equals(content)){
                    Toast.makeText(getActivity(),"你输入的内容为空",Toast.LENGTH_SHORT).show();
                }else {
                    //不为空
                    HqqMsg msg=new HqqMsg(content,HqqMsg.TYPE_SEND);
                    mylist.add(msg);
                    //刷新消息
                    adapter.notifyDataSetChanged();
                    listView.smoothScrollToPosition(mylist.size()-1);;//将listview定位到最后一行
                    input_hqq.setText("");//清空
                }
            }
        });
        return view;
    }

    public void findView(){
        listView = (ListView) view.findViewById(R.id.listview_chat);
        input_hqq = (EditText) view.findViewById(R.id.input_hqq);
        sendbtn_hqq = (Button) view.findViewById(R.id.sendbtn_hqq);
    }
    public void initData(){
        HqqMsg msg1 = new HqqMsg("小宝贝",HqqMsg.TYPE_RECEIVER);
        mylist.add(msg1);
        HqqMsg msg2 = new HqqMsg("干啥",HqqMsg.TYPE_SEND);
        mylist.add(msg2);
        HqqMsg msg3 = new HqqMsg("叫叫你",HqqMsg.TYPE_RECEIVER);
        mylist.add(msg3);
    }
}
