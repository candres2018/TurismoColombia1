package com.example.turismocolombia.LugarApi;

import com.example.turismocolombia.Model.LugarT;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface LugarApi {
    @GET
    Call<List<LugarT>> getLugarTList(@Url String url);
}
