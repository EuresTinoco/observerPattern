package com.news;

import com.news.publisher.NewsAgency;
import com.news.subscriber.ConcreteUserSubscriber;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        ConcreteUserSubscriber alice = new ConcreteUserSubscriber("Alice", "ALL");
        ConcreteUserSubscriber bob = new ConcreteUserSubscriber("Bob", "Tech");
        ConcreteUserSubscriber charlie = new ConcreteUserSubscriber("Charlie", "Sports");

        newsAgency.registerSubscriber(alice);
        newsAgency.registerSubscriber(bob);
        newsAgency.registerSubscriber(charlie);

        newsAgency.publishNews(
            "AI Model Achieves Breakthrough",
            "Tech",
            "A new state-of-the-art AI model demonstrates human-level reasoning."
        );

        newsAgency.removeSubscriber(bob);

        newsAgency.publishNews(
            "Championship Final Score",
            "Sports",
            "Underdogs pull off a stunning last-minute victory."
        );
    }
}