package me.undownding.airline.cs.model;

/**
 * Created by undownding on 2016/2/1.
 */
public class City {

    /**
     * code : SHA
     * enName : Shanghai
     * zhName : 上海
     */

    private String code;
    private String enName;
    private String zhName;

    public void setCode(String code) {
        this.code = code;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public void setZhName(String zhName) {
        this.zhName = zhName;
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
