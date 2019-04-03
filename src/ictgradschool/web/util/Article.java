package ictgradschool.web.util;

import org.json.simple.JSONObject;

import java.io.Serializable;

public class Article implements Serializable {
    private int id;
    private String title;
    private String content;
    private int authorId;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAuthorId() {
        return this.authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static JSONObject toJson(Article a) {
        JSONObject jObj = new JSONObject();

        if (a != null) {
            jObj.put("id", a.getId());
            jObj.put("title", JSONObject.escape(a.getTitle()));
            jObj.put("content", JSONObject.escape(a.getContent()));
            jObj.put("author_id", a.getAuthorId());
        }

        return jObj;
    }
}
