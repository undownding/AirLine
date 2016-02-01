package me.undownding.airline.cs.model;

import java.util.List;

/**
 * Created by undownding on 2016/2/1.
 */
public class CSAirApiResult {

    /**
     * airports : []
     * citys : []
     * createtime : 1454327856813
     * id : Shopping:DIRECTSHACAN201603270B2CPC1NEWLAZY
     * planes : []
     * segment : {"adultfueltax":"0","arrcity":"CAN","childfueltax":"0","date":"20160327","dateflight":{"flight":[]},"depcity":"SHA","infantfueltax":"0"}
     */

    private String createtime;
    private String id;
    /**
     * adultfueltax : 0
     * arrcity : CAN
     * childfueltax : 0
     * date : 20160327
     * dateflight : {"flight":[]}
     * depcity : SHA
     * infantfueltax : 0
     */

    private SegmentEntity segment;
    private List<Airport> airports;
    private List<City> citys;
    private List<Plane> planes;

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSegment(SegmentEntity segment) {
        this.segment = segment;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }

    public void setCitys(List<City> citys) {
        this.citys = citys;
    }

    public void setPlanes(List<Plane> planes) {
        this.planes = planes;
    }

    public String getCreatetime() {
        return createtime;
    }

    public String getId() {
        return id;
    }

    public SegmentEntity getSegment() {
        return segment;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public List<City> getCitys() {
        return citys;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public static class SegmentEntity {
        private String adultfueltax;
        private String arrcity;
        private String childfueltax;
        private String date;
        private DateflightEntity dateflight;
        private String depcity;
        private String infantfueltax;

        public void setAdultfueltax(String adultfueltax) {
            this.adultfueltax = adultfueltax;
        }

        public void setArrcity(String arrcity) {
            this.arrcity = arrcity;
        }

        public void setChildfueltax(String childfueltax) {
            this.childfueltax = childfueltax;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public void setDateflight(DateflightEntity dateflight) {
            this.dateflight = dateflight;
        }

        public void setDepcity(String depcity) {
            this.depcity = depcity;
        }

        public void setInfantfueltax(String infantfueltax) {
            this.infantfueltax = infantfueltax;
        }

        public String getAdultfueltax() {
            return adultfueltax;
        }

        public String getArrcity() {
            return arrcity;
        }

        public String getChildfueltax() {
            return childfueltax;
        }

        public String getDate() {
            return date;
        }

        public DateflightEntity getDateflight() {
            return dateflight;
        }

        public String getDepcity() {
            return depcity;
        }

        public String getInfantfueltax() {
            return infantfueltax;
        }

        public static class DateflightEntity {
            private List<Flight> flight;

            public void setFlight(List<Flight> flight) {
                this.flight = flight;
            }

            public List<Flight> getFlight() {
                return flight;
            }
        }
    }
}
