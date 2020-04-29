package com.dfq.grape.model;

import lombok.Data;

/**
 *
 */
@Data
public class Msb {
    /**
     *
     */
    private Integer id;
    /**
     *
     */
    private String kinds;
    /**
     * 反应型
     */
    private String reaction;
    /**
     * 疫情指数
     */
    private String disease;

    @Override
    public String toString() {
        return "Msb{" +
                "id=" + id +
                ", kinds='" + kinds + '\'' +
                ", reaction='" + reaction + '\'' +
                ", disease='" + disease + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKinds() {
        return kinds;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    public String getReaction() {
        return reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}