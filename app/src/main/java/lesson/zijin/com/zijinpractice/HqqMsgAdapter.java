package lesson.zijin.com.zijinpractice;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HqqMsgAdapter extends ArrayAdapter<HqqMsg> {

    private ArrayAdapter<HqqMsg> list;

    public HqqMsgAdapter(@NonNull Context context, @LayoutRes int resource,ArrayList<HqqMsg> list) {
        super(context, resource,list);
    }




    @Override
    public int getCount() {
        return list.getCount();
    }

    @Nullable
    @Override
    public HqqMsg getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;
        HqqMsg msg = getItem(position);
        View view;
        if(convertView==null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.acticity_hqqmsg_item, null);
            viewHolder = new ViewHolder();
            viewHolder.leftlayout_hqq = (LinearLayout) view.findViewById(R.id.leftlayout_hqq);
            viewHolder.rightlayout_hqq = (LinearLayout) view.findViewById(R.id.rightlayout_hqq);
            viewHolder.leftmsg_hqq = (TextView) view.findViewById(R.id.leftmsg_hqq);
            viewHolder.rightmsg_hqq = (TextView) view.findViewById(R.id.rightmsg_hqq);
            view.setTag(viewHolder);
        }else {
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }
        if(msg.getType()==HqqMsg.TYPE_RECEIVER){
            viewHolder.leftlayout_hqq.setVisibility(View.VISIBLE);
            viewHolder.rightlayout_hqq.setVisibility(View.GONE);
            viewHolder.leftmsg_hqq.setText(msg.getContent());
        }else {
            viewHolder.leftlayout_hqq.setVisibility(View.GONE);
            viewHolder.rightlayout_hqq.setVisibility(View.VISIBLE);
            viewHolder.rightmsg_hqq.setText(msg.getContent());
        }
        return view;
    }
    static class ViewHolder{
        static LinearLayout leftlayout_hqq;
        static LinearLayout rightlayout_hqq;
        static TextView leftmsg_hqq;
        static TextView rightmsg_hqq;
    }
}
