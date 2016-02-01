package me.undownding.airline.cs.model;

/**
 * Created by undownding on 2016/2/1.
 */
public class Plane {

    /**
     * airportTax : 50
     * code : 77W
     * enName : B77W
     * zhName : 波音77W
     */

    private String airportTax;
    private String code;
    private String enName;
    private String zhName;

    public void setAirportTax(String airportTax) {
        this.airportTax = airportTax;
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

    public String getAirportTax() {
        return airportTax;
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
