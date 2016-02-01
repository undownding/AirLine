package me.undownding.airline.cs.model;

/**
 * Created by undownding on 2016/2/1.
 */
public class Airport {

    /**
     * city : SHA
     * code : SHA
     * enName : Hongqiao Airport
     * zhName : 上海虹桥
     */

    private String city;
    private String code;
    private String enName;
    private String zhName;

    public void setCity(String city) {
        this.city = city;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public void setZhName(String zhName) {
        this.zhName = zhName;
    }

    public String getCity() {
        return city;
    }

    public String getCode() {
        return code;
    }

    public String getEnName() {
        return enName;
    }

    public String getZhName() {
        return zhName;
    }
}
