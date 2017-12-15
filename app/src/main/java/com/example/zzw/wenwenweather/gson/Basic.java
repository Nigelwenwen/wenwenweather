package com.example.zzw.wenwenweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zzw on 2017/12/12.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
