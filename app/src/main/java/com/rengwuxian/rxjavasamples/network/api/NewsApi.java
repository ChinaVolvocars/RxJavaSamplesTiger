package com.rengwuxian.rxjavasamples.network.api;

import android.database.Observable;

import com.rengwuxian.rxjavasamples.model.news;

import java.util.List;

import retrofit2.http.GET;

/**
 * Created by idea on 2016/10/14.
 */

public interface NewsApi {
    //http://c.m.163.com/nc/article/headline/
    @GET("/nc/article/headline/T1348647909107/0-20.html")
    Observable<List<news>> getNews();
}
