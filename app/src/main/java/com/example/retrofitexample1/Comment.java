package com.example.retrofitexample1;

import com.google.gson.annotations.SerializedName;

public class Comment {

    private int postId;

    private int Id;

    private String email;


    private String name;

    @SerializedName("body")
    private String text;

    public String getEmail() {
        return email;
    }

    public int getPostId() {
        return postId;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }
}
