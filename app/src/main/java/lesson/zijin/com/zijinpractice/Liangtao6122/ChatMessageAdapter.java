package lesson.zijin.com.zijinpractice.Liangtao6122;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import lesson.zijin.com.zijinpractice.R;


public class ChatMessageAdapter extends BaseAdapter
{
	private LayoutInflater mInflater;
	private List<ChatMessageBean> mDatas;

	public ChatMessageAdapter(Context context, List<ChatMessageBean> mDatas)
	{
		mInflater = LayoutInflater.from(context);
		this.mDatas = mDatas;
	}

	@Override
	public int getCount()
	{
		return mDatas.size();
	}

	@Override
	public Object getItem(int position)
	{
		return mDatas.get(position);
	}

	@Override
	public long getItemId(int position)
	{
		return position;
	}

	@Override
	public int getItemViewType(int position)
	{
		ChatMessageBean chatMessage = mDatas.get(position);
		if (chatMessage.getType() == ChatMessageBean.Type.INCOMING)
		{
			return 0;
		}
		return 1;
	}

	@Override
	public int getViewTypeCount()
	{
		return 2;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		ChatMessageBean chatMessage = mDatas.get(position);
		ViewHolder viewHolder = null;
		if (convertView == null)
		{
			if (getItemViewType(position) == 0)
			{
				convertView = mInflater.inflate(R.layout.item_from_msg, parent,
						false);
				viewHolder = new ViewHolder();
				viewHolder.mMsg = (TextView) convertView
						.findViewById(R.id.id_from_msg_info);
			} else
			{
				convertView = mInflater.inflate(R.layout.item_to_msg, parent,
						false);
				viewHolder = new ViewHolder();
				viewHolder.mMsg = (TextView) convertView
						.findViewById(R.id.id_to_msg_info);
			}
			convertView.setTag(viewHolder);
		} else
		{
			viewHolder = (ViewHolder) convertView.getTag();
		}
		viewHolder.mMsg.setText(chatMessage.getMsg());
		return convertView;
	}

	private final class ViewHolder
	{
		TextView mMsg;
	}

}
