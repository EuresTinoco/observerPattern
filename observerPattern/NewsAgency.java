package com.news.publisher;

import com.news.model.News;
import com.news.observer.Subject;
import com.news.observer.Subscriber;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NewsAgency implements Subject {
    private final List<Subscriber> subscribers = new CopyOnWriteArrayList<>();

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(News news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    public void publishNews(String headline, String category, String content) {
        News news = new News(headline, category, content);
        System.out.println("\n[AGENCY BROADCAST] Publishing Breaking News: " + headline);
        notifySubscribers(news);
    }
}