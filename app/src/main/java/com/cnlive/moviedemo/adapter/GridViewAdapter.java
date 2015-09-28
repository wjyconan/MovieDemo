package com.cnlive.moviedemo.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.cnlive.moviedemo.R;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by WJY on 2015/9/26.
 */
public class GridViewAdapter extends BaseAdapter{
	
	private Context context;
	private List<String> list;
	private String  baseUrl = "http://image.tmdb.org/t/p/w185";

	public GridViewAdapter(Context context,List<String> list) {
		this.context = context;
		this.list = list;
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder mHolder ;
		if (convertView == null){
			mHolder = new ViewHolder();
			LayoutInflater inflater = LayoutInflater.from(context);
			convertView = inflater.inflate(R.layout.item_gridview_img,null,true);
			mHolder.my_image_view = (SimpleDraweeView) convertView.findViewById(R.id.my_image_view);
			convertView.setTag(mHolder);
		}else {
			mHolder = (ViewHolder) convertView.getTag();
		}
		Uri uri = Uri.parse(baseUrl+list.get(position));
		mHolder.my_image_view.setImageURI(uri);
		return convertView;
	}
	
	class ViewHolder{
		private SimpleDraweeView my_image_view;
	}
}
