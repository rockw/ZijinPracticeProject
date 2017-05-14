package lesson.zijin.com.zijinpractice;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by admin on 2017/4/9.
 */

public class MsgAdapter_12 extends ArrayAdapter<Msg_12>{
    private  int resource;

    public MsgAdapter_12(@NonNull Context context, @LayoutRes int resource, @NonNull List<Msg_12> objects) {
        super(context, resource, objects);
        this.resource = resource;
    }


    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        Msg_12 msg=getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView==null){
            //加载布局
            view =  LayoutInflater.from(getContext()).inflate(resource,parent,false);
            viewHolder = new ViewHolder();
            //查找控件
            viewHolder.left_layout=(LinearLayout)view.findViewById(R.id.left_layout);
            viewHolder.right_layout=(LinearLayout)view.findViewById(R.id.right_layout);
            viewHolder.tv_left=(TextView)view.findViewById(R.id.tv_left);
            viewHolder.tv_right=(TextView)view.findViewById(R.id.tv_right);
            view.setTag(viewHolder);
        }else{ //直接获取
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

    private class ViewHolder{
        LinearLayout left_layout;
        LinearLayout right_layout;
        TextView tv_left;
        TextView tv_right;
    }
}
