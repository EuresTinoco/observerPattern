package com.news.observer;

import com.news.model.News;

public interface Subscriber {
    void update(News news);
}