package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by iR1s on 2018/3/30.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }

}