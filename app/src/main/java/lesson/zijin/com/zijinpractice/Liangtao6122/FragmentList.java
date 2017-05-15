package lesson.zijin.com.zijinpractice.Liangtao6122;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import lesson.zijin.com.zijinpractice.R;


/**
 *
 */
public class FragmentList extends Fragment {
    private ListView mMsgs;
    private ChatMessageAdapter mAdapter;
    private List<ChatMessageBean> mDatas;

    private EditText mInputMsg;
    private Button mSendMsg;
    private View view;


    public FragmentList() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_list, container, false);
        mMsgs = (ListView) view.findViewById(R.id.lv);
        initView();
        initDatas();
        initListener();
        return view;
    }

    private void initView() {
        mMsgs = (ListView) view.findViewById(R.id.lv);
        mInputMsg = (EditText) view.findViewById(R.id.ed_send);
        mSendMsg = (Button) view.findViewById(R.id.btn_send);
    }
    private void initDatas() {
        mDatas = new ArrayList<ChatMessageBean>();
        mDatas.add(new ChatMessageBean("你好啊！", ChatMessageBean.Type.INCOMING));
        mAdapter = new ChatMessageAdapter(getContext(), mDatas);
        mDatas.add(new ChatMessageBean("你也好啊！", ChatMessageBean.Type.OUTCOMING));
        mAdapter = new ChatMessageAdapter(getContext(), mDatas);
        mDatas.add(new ChatMessageBean("好吧，再见！", ChatMessageBean.Type.INCOMING));
        mAdapter = new ChatMessageAdapter(getContext(), mDatas);
        mMsgs.setAdapter(mAdapter);

    }
    private void initListener() {
        mSendMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String toMsg = mInputMsg.getText().toString();
                if (TextUtils.isEmpty(toMsg))
                {
                    Toast.makeText(getContext(), "请输入内容",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                ChatMessageBean toMessage = new ChatMessageBean();
                toMessage.setMsg(toMsg);
                toMessage.setType(ChatMessageBean.Type.OUTCOMING);
                mDatas.add(toMessage);
                mAdapter.notifyDataSetChanged();
                mMsgs.setSelection(mDatas.size()-1);

                mInputMsg.setText("");
            }
        });
    }


}
