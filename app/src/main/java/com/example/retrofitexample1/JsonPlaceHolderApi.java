package com.example.retrofitexample1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Post>> getPosts();

    @GET("posts/{Id}/comments")
    Call<List<Comment>> getComments(@Path("Id") int postId);

}
