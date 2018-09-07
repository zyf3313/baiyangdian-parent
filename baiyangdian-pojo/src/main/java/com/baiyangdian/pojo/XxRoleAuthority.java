package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxRoleAuthority implements Serializable {
    private static final long serialVersionUID = -3603066149093536567L;
    private Long role;

    private String authorities;

    public Long getRole() {
        return role;
    }

    public void setRole(Long role) {
        this.role = role;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities == null ? null : authorities.trim();
    }

    @Override
    public String toString() {
        return "XxRoleAuthority{" +
                "role=" + role +
                ", authorities='" + authorities + '\'' +
                '}';
    }
}