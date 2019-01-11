package com.qf.manager.pojo.po;

public class Poetry {
    private Integer poetryId;

    private String poetryTitle;

    private String poetryBody;

    private String poetryAuthor;

    private String poetryDynasty;

    public Integer getPoetryId() {
        return poetryId;
    }

    public void setPoetryId(Integer poetryId) {
        this.poetryId = poetryId;
    }

    public String getPoetryTitle() {
        return poetryTitle;
    }

    public void setPoetryTitle(String poetryTitle) {
        this.poetryTitle = poetryTitle == null ? null : poetryTitle.trim();
    }

    public String getPoetryBody() {
        return poetryBody;
    }

    public void setPoetryBody(String poetryBody) {
        this.poetryBody = poetryBody == null ? null : poetryBody.trim();
    }

    public String getPoetryAuthor() {
        return poetryAuthor;
    }

    public void setPoetryAuthor(String poetryAuthor) {
        this.poetryAuthor = poetryAuthor == null ? null : poetryAuthor.trim();
    }

    public String getPoetryDynasty() {
        return poetryDynasty;
    }

    public void setPoetryDynasty(String poetryDynasty) {
        this.poetryDynasty = poetryDynasty == null ? null : poetryDynasty.trim();
    }
}