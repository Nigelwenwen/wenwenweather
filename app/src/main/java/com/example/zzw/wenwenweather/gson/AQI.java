package com.example.zzw.wenwenweather.gson;

/**
 * Created by zzw on 2017/12/12.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
