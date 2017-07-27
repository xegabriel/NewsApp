package com.mihailproductions.newsapp.Loader;

import android.content.AsyncTaskLoader;
import android.content.Context;

import com.mihailproductions.newsapp.Fetcher.QueryUtils;
import com.mihailproductions.newsapp.Model.News;

import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>> {
    private String mUrl;

    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        List<News> news = QueryUtils.fetchNewsData(mUrl);
        return news;
    }
}