package com.mihailproductions.newsapp.Model;

public class News {
    private String mSectionName;
    private String mWebPublicationDate;
    private String mWebTitle;
    private String mWebURL;

    public News(String mSectionName, String mWebPublicationDate, String mWebTitle, String mWebURL) {
        this.mSectionName = mSectionName;
        this.mWebPublicationDate = mWebPublicationDate;
        this.mWebTitle = mWebTitle;
        this.mWebURL = mWebURL;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getWebPublicationDate() {
        return mWebPublicationDate;
    }

    public String getWebTitle() {
        return mWebTitle;
    }

    public String getWebURL() {
        return mWebURL;
    }
}
