package com.example.newsshell;

import com.example.newsshell.Models.NewsHeadLines;

import java.util.List;

public interface OnFetchDataListener<NewsAPIResponse> {
    void onFetchData(List<NewsHeadLines> list, String message);
    void onError(String message);
}
