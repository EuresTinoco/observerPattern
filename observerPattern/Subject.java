package com.news.observer;

import com.news.model.News;

public interface Subject {
    void registerSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers(News news);
}