package com.mihailproductions.newsapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.mihailproductions.newsapp.Model.News;
import com.mihailproductions.newsapp.R;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, parent, false);
            holder = new ViewHolder();
            holder.webTitle = (TextView) convertView.findViewById(R.id.webTitle);
            holder.sectionName = (TextView) convertView.findViewById(R.id.sectionName);
            holder.webPublicationDate = (TextView) convertView.findViewById(R.id.webPublicationDate);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        News currentNews = getItem(position);

        if (currentNews != null) {
            holder.webTitle.setText(currentNews.getWebTitle());
            holder.sectionName.setText(currentNews.getSectionName());
            holder.webPublicationDate.setText(currentNews.getWebPublicationDate());
        }
        return convertView;
    }

    static class ViewHolder {
        TextView webTitle;
        TextView sectionName;
        TextView webPublicationDate;
    }
}
