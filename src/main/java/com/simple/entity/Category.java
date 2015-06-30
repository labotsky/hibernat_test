package com.simple.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Labotski_SV on 6/30/2015.
 */
public class Category {
    private Long categoryId;
    private String name;
    private String description;
    private Set<Info> infos = new HashSet<>(0);

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Info> getInfos() {
        return infos;
    }

    public void setInfos(Set<Info> infos) {
        this.infos = infos;
    }
}
