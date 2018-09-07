package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxMemberFavoriteProductKey implements Serializable{
    private static final long serialVersionUID = -4537808871128815014L;
    private Long favoriteMembers;

    private Long favoriteProducts;

    public Long getFavoriteMembers() {
        return favoriteMembers;
    }

    public void setFavoriteMembers(Long favoriteMembers) {
        this.favoriteMembers = favoriteMembers;
    }

    public Long getFavoriteProducts() {
        return favoriteProducts;
    }

    public void setFavoriteProducts(Long favoriteProducts) {
        this.favoriteProducts = favoriteProducts;
    }

    @Override
    public String toString() {
        return "XxMemberFavoriteProductKey{" +
                "favoriteMembers=" + favoriteMembers +
                ", favoriteProducts=" + favoriteProducts +
                '}';
    }
}