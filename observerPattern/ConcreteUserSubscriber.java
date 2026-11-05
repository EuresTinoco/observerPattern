package com.news.subscriber;

import com.news.model.News;
import com.news.observer.Subscriber;

public class ConcreteUserSubscriber implements Subscriber {
    private final String name;
    private final String preferredCategory;

    public ConcreteUserSubscriber(String name, String preferredCategory) {
        this.name = name;
        this.preferredCategory = preferredCategory;
    }

    @Override
    public void update(News news) {
        if ("ALL".equalsIgnoreCase(preferredCategory) || preferredCategory.equalsIgnoreCase(news.getCategory())) {
            System.out.println("Notification to " + name + ": [" + news.getCategory() + "] " + news.getHeadline() + " - " + news.getContent());
        }
    }

    public String getName() {
        return name;
    }

    public String getPreferredCategory() {
        return preferredCategory;
    }
}