package com.dfq.grape.model;

import lombok.Data;

/**
 *
 */
@Data
public class PutaoKinds {
    /**
     *
     */
    private Integer id;
    /**
     * 品种名称
     */
    private String pname;
    /**
     * 别名
     */
    private String bieming;
    /**
     * 品种特性
     */
    private String characters;
    /**
     * 来源
     */
    private String forms;
    /**
     * 栽培事项
     */
    private String projects;

    @Override
    public String toString() {
        return "PutaoKinds{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", bieming='" + bieming + '\'' +
                ", characters='" + characters + '\'' +
                ", forms='" + forms + '\'' +
                ", projects='" + projects + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getBieming() {
        return bieming;
    }

    public void setBieming(String bieming) {
        this.bieming = bieming;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    public String getForms() {
        return forms;
    }

    public void setForms(String forms) {
        this.forms = forms;
    }

    public String getProjects() {
        return projects;
    }

    public void setProjects(String projects) {
        this.projects = projects;
    }
}