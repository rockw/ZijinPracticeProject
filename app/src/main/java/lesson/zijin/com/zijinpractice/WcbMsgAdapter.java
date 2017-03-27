package lesson.zijin.com.zijinpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 王陈博 on 2017/3/26.
 */

public class WcbMsgAdapter extends ArrayAdapter<WcbMsg>{
    private Context context;
    private  int resourceId;
    private ArrayList<WcbMsg> list;

    public WcbMsgAdapter(Context context,int resourceId,ArrayList<WcbMsg> list) {
        //super();
        super(context, resourceId, list);
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }


    @Override
    public WcbMsg getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public int getItemViewType(int position) {
        WcbMsg msg = list.get(position);
        return msg.getType();
    }


    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        //
        ViewHolder viewHolder;
       WcbMsg msg=getItem(position);
        View view;
        if (convertView==null){
            //加载布局
            view =  LayoutInflater.from(getContext()).inflate(R.layout.wcb_chat_item,null);
            viewHolder = new ViewHolder();
           // convertView= LayoutInflater.from(getContext()).inflate(resourceId,null);
            //查找控件
            viewHolder.left_layout=(LinearLayout)view.findViewById(R.id.left_layout);
            viewHolder.right_layout=(LinearLayout)view.findViewById(R.id.right_layout);
            viewHolder.tv_left=(TextView)view.findViewById(R.id.tv_left);
            viewHolder.tv_right=(TextView)view.findViewById(R.id.tv_right);
            view.setTag(viewHolder);
        }else{
            //直接获取
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }

        if (msg.getType()== WcbMsg.TYPE_RECEIVER)//如果它是接收消息 就放左边
        {
            //显示左边 隐藏右边
            viewHolder.left_layout.setVisibility(View.VISIBLE);
            viewHolder.right_layout.setVisibility(View.GONE);
            //设置左边的内容
            viewHolder.tv_left.setText(msg.getContent());
        }else{
            //显示右边 隐藏左边
            viewHolder.left_layout.setVisibility(View.GONE);
            viewHolder.right_layout.setVisibility(View.VISIBLE);
            //设置右边的内容
            viewHolder.tv_right.setText(msg.getContent());
        }
        return view;
    }

    static class ViewHolder{
        static LinearLayout left_layout;
        static LinearLayout right_layout;
        static TextView tv_left;
        static TextView tv_right;
    }
}
