package com.news.model;

import java.time.LocalDateTime;

public class News {
    private final String headline;
    private final String category;
    private final String content;
    private final LocalDateTime timestamp;

    public News(String headline, String category, String content) {
        this.headline = headline;
        this.category = category;
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    public String getHeadline() {
        return headline;
    }

    public String getCategory() {
        return category;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}