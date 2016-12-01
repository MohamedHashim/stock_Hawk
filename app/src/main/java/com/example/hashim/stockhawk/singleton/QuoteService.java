package com.example.hashim.stockhawk.singleton;

import com.example.hashim.stockhawk.modal.Result;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;


/**
 * Created by Mohamed Hashim on 07/11/2016.
 */
public interface QuoteService {

    //So these are the list available in our WEB API and the methods look straight forward
    @GET("/public/yql")
    void getHistoricalData(@Query("q") String q, @Query("diagnostics") String diagnostics,
                                                    @Query("env") String env, @Query("format") String format,
                                                     Callback<Result> cb
                                            );
}
