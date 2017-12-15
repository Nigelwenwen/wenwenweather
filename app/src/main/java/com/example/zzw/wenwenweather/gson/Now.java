package com.example.zzw.wenwenweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zzw on 2017/12/12.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
