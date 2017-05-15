package lesson.zijin.com.zijinpractice.Liangtao6122;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import lesson.zijin.com.zijinpractice.R;

/**
 *
 */
public class ListAdapter extends BaseAdapter {

    private List<PhoneBean> list;
    //承接上下文
    private Context context;
    private RelativeLayout layout;

    //构造方法
    public ListAdapter(List<PhoneBean> list, Context context) {
        this.list = (List<PhoneBean>) list;
        this.context = (Context) context;
    }

    //返回的是集合的数量,大小
    @Override
    public int getCount() {
        return list.size();
    }

    //返回当前这条数据
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    //获取当前的ID
    @Override
    public long getItemId(int position) {
        //id和position是相等的
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /**
         * 我们要获取当前视图的View并且加载到视图当中
         */
        ViewHolder holder;
        //==null代表并没有记载view
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.tv_name = (TextView) convertView.findViewById(R.id.tv_name);
            holder.tv_phone = (TextView) convertView.findViewById(R.id.tv_phone);
            //加载内容
            holder.tv_name.setText(list.get(position).getName());
            holder.tv_phone.setText(list.get(position).getPhone());
            //第一次加载完毕后标签储存
            convertView.setTag(holder);
        } else {
            //代表加载过了
            holder = (ViewHolder) convertView.getTag();
            //加载内容
            holder.tv_name.setText(list.get(position).getName());
            holder.tv_phone.setText(list.get(position).getPhone());
        }

        return convertView;
    }

    private static class ViewHolder {
        TextView tv_name;
        TextView tv_phone;
    }
}
