package com.example.administrator.bean;

import java.util.List;

/**
 * 今日天气界面实体类
 */
public class TodayWeather {
    //今日天气信息
    private String city;
    private String updatetime;
    private String wendu;
    private String shidu;
    private String pm25;
    private String quality;
    private String fengxiang;
    private String fengli;
    private String date;
    private String high;
    private String low;
    private String type;

    //更新：包括昨天在内的6天天气信息
    private List<String> dates;
    private List<String> types;
    private List<String> highs;
    private List<String> lows;
    private List<String> fenglis;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getWendu() {
        return wendu;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu;
    }

    public String getShidu() {
        return shidu;
    }

    public void setShidu(String shidu) {
        this.shidu = shidu;
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getFengxiang() {
        return fengxiang;
    }

    public void setFengxiang(String fengxiang) {
        this.fengxiang = fengxiang;
    }

    public String getFengli() {
        return fengli;
    }

    public void setFengli(String fengli) {
        this.fengli = fengli;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<String> getHighs() {
        return highs;
    }

    public void setHighs(List<String> highs) {
        this.highs = highs;
    }

    public List<String> getLows() {
        return lows;
    }

    public void setLows(List<String> lows) {
        this.lows = lows;
    }

    public List<String> getFenglis() {
        return fenglis;
    }

    public void setFenglis(List<String> fenglis) {
        this.fenglis = fenglis;
    }

    @Override
    public String toString() {
        return "TodayWeather{"+"city='"+city+'\''+
                ",updatetime='"+updatetime+'\''+
                ",wendu='"+wendu+'\''+
                ",shidu='"+shidu+'\''+
                ",pm25='"+pm25+'\''+
                ",quality='"+quality+'\''+
                ",fengxiang='"+fengxiang+'\''+
                ",fengli='"+fengli+'\''+
                ",date='"+date+'\''+
                ",high='"+high+'\''+
                ",low='"+low+'\''+
                ",type='"+type+'\''+
                '}';
    }
}
