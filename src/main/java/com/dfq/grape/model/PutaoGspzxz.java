package com.dfq.grape.model;

import lombok.Data;

/**
 *
 */
@Data
public class PutaoGspzxz {
    /**
     *
     */
    private Integer id;
    /**
     *
     */
    private String kinds;
    /**
     *
     */
    private String max;
    /**
     *
     */
    private String min;
    /**
     *
     */
    private String avg;
    /**
     *
     */
    private String sd;
    /**
     *
     */
    private String cv;

    @Override
    public String toString() {
        return "PutaoGspzxz{" +
                "id=" + id +
                ", kinds='" + kinds + '\'' +
                ", max='" + max + '\'' +
                ", min='" + min + '\'' +
                ", avg='" + avg + '\'' +
                ", sd='" + sd + '\'' +
                ", cv='" + cv + '\'' +
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

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getAvg() {
        return avg;
    }

    public void setAvg(String avg) {
        this.avg = avg;
    }

    public String getSd() {
        return sd;
    }

    public void setSd(String sd) {
        this.sd = sd;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }
}