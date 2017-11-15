package com.ldpoly.coolweather.gson;

/**
 * Created by zj on 2017/11/14.
 */

public class AQI {
    public  AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
