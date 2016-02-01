package me.undownding.airline.cs.model;

/**
 * Created by undownding on 2016/2/1.
 */
public class Flight {

    /**
     * airline : CZ
     * arrdate : 20160327
     * arrport : CAN
     * arrtime : 2305
     * codeshare : FALSE
     * codeshareinfo :
     * depdate : 20160327
     * depport : SHA
     * deptime : 2045
     * flightno : CZ3582
     * meal : Y
     * plane : 33A
     * rate : 约90%
     * roundtripcabin : KA
     * seginterval : N
     * stopname_en : N
     * stopname_zh : 无
     * stopnumber : 0
     * term : T2
     * timeduringflight : 2小时20分钟
     * timeduringflight_en : 2Hours 20Minutes
     */

    private String airline;
    private String arrdate;
    private String arrport;
    private String arrtime;
    private Cabin cabin;
    private String codeshare;
    private String codeshareinfo;
    private String depdate;
    private String depport;
    private String deptime;
    private String flightno;
    private String meal;
    private String plane;
    private String rate;
    private String roundtripcabin;
    private String seginterval;
    private String stopname_en;
    private String stopname_zh;
    private String stopnumber;
    private String term;
    private String timeduringflight;
    private String timeduringflight_en;

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setArrdate(String arrdate) {
        this.arrdate = arrdate;
    }

    public void setArrport(String arrport) {
        this.arrport = arrport;
    }

    public void setArrtime(String arrtime) {
        this.arrtime = arrtime;
    }

    public void setCabin(Cabin cabin) {
        this.cabin = cabin;
    }

    public void setCodeshare(String codeshare) {
        this.codeshare = codeshare;
    }

    public void setCodeshareinfo(String codeshareinfo) {
        this.codeshareinfo = codeshareinfo;
    }

    public void setDepdate(String depdate) {
        this.depdate = depdate;
    }

    public void setDepport(String depport) {
        this.depport = depport;
    }

    public void setDeptime(String deptime) {
        this.deptime = deptime;
    }

    public void setFlightno(String flightno) {
        this.flightno = flightno;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public void setPlane(String plane) {
        this.plane = plane;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public void setRoundtripcabin(String roundtripcabin) {
        this.roundtripcabin = roundtripcabin;
    }

    public void setSeginterval(String seginterval) {
        this.seginterval = seginterval;
    }

    public void setStopname_en(String stopname_en) {
        this.stopname_en = stopname_en;
    }

    public void setStopname_zh(String stopname_zh) {
        this.stopname_zh = stopname_zh;
    }

    public void setStopnumber(String stopnumber) {
        this.stopnumber = stopnumber;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setTimeduringflight(String timeduringflight) {
        this.timeduringflight = timeduringflight;
    }

    public void setTimeduringflight_en(String timeduringflight_en) {
        this.timeduringflight_en = timeduringflight_en;
    }

    public String getAirline() {
        return airline;
    }

    public String getArrdate() {
        return arrdate;
    }

    public String getArrport() {
        return arrport;
    }

    public String getArrtime() {
        return arrtime;
    }

    public Cabin getCabin() {
        return cabin;
    }

    public String getCodeshare() {
        return codeshare;
    }

    public String getCodeshareinfo() {
        return codeshareinfo;
    }

    public String getDepdate() {
        return depdate;
    }

    public String getDepport() {
        return depport;
    }

    public String getDeptime() {
        return deptime;
    }

    public String getFlightno() {
        return flightno;
    }

    public String getMeal() {
        return meal;
    }

    public String getPlane() {
        return plane;
    }

    public String getRate() {
        return rate;
    }

    public String getRoundtripcabin() {
        return roundtripcabin;
    }

    public String getSeginterval() {
        return seginterval;
    }

    public String getStopname_en() {
        return stopname_en;
    }

    public String getStopname_zh() {
        return stopname_zh;
    }

    public String getStopnumber() {
        return stopnumber;
    }

    public String getTerm() {
        return term;
    }

    public String getTimeduringflight() {
        return timeduringflight;
    }

    public String getTimeduringflight_en() {
        return timeduringflight_en;
    }
}
