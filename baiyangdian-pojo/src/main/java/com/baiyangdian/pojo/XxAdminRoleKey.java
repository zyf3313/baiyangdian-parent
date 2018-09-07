package com.baiyangdian.pojo;

import java.io.Serializable;

public class XxAdminRoleKey implements Serializable {
    private static final long serialVersionUID = -2530840041876669645L;
    private Long admins;

    private Long roles;

    public Long getAdmins() {
        return admins;
    }

    public void setAdmins(Long admins) {
        this.admins = admins;
    }

    public Long getRoles() {
        return roles;
    }

    public void setRoles(Long roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "XxAdminRoleKey{" +
                "admins=" + admins +
                ", roles=" + roles +
                '}';
    }
}