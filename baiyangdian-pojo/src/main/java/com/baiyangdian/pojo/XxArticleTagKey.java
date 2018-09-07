package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxArticleTagKey implements Serializable {
    private static final long serialVersionUID = -91643835435850311L;
    private Long articles;

    private Long tags;

    public Long getArticles() {
        return articles;
    }

    public void setArticles(Long articles) {
        this.articles = articles;
    }

    public Long getTags() {
        return tags;
    }

    public void setTags(Long tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "XxArticleTagKey{" +
                "articles=" + articles +
                ", tags=" + tags +
                '}';
    }
}