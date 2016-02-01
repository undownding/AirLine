package me.undownding.airline.cs.model;

import java.util.List;

/**
 * Created by undownding on 2016/2/1.
 */
public class Cabin {

    /**
     * adultfarebasis : J
     * adultprice : 3110
     * brandtype : ["J"]
     * changemessage_ad_en : free, 5% of J published fare
     * changemessage_ad_zh : 免费, J舱公布运价5%
     * changemessage_ch_en : free, 5% of ticket fare
     * changemessage_ch_zh : 免费, 票面价5%
     * childfarebasis : JCH
     * childfarereference : CZB2C-SHA-CAN-CAN-SHA-27MAR--S-CHJ03_9700754--
     * childprice : 1560
     * childpricetype :
     * discount : 230
     * farereference : CZB2C-SHA-CAN-CAN-SHA-27MAR--S-9700754--
     * gbadultprice : 3110
     * infantfarebasis : JIN
     * infantfarereference : CZB2C-SHA-CAN-CAN-SHA-27MAR--S-INJ03_9700754--
     * infantprice : 310
     * info : >9
     * name : J
     * refundmessage_ad_en : 5% of ticket fare, 10% of ticket fare
     * refundmessage_ad_zh : 票面价5%, 票面价10%
     * refundmessage_ch_en : 5% of ticket fare, 10% of ticket fare
     * refundmessage_ch_zh : 票面价5%, 票面价10%
     * secondprices : []
     * specifiedtime_en : 2 hours before departure
     * specifiedtime_zh : 航班起飞前2小时
     */

    private String adultfarebasis;
    private String adultprice;
    @com.google.gson.annotations.SerializedName("changemessage_ad_en")
    private String changemessageAdEn;
    @com.google.gson.annotations.SerializedName("changemessage_ad_zh")
    private String changemessageAdZh;
    @com.google.gson.annotations.SerializedName("changemessage_ch_en")
    private String changemessageChEn;
    @com.google.gson.annotations.SerializedName("changemessage_ch_zh")
    private String changemessageChZh;
    private String childfarebasis;
    private String childfarereference;
    private String childprice;
    private String childpricetype;
    private String discount;
    private String farereference;
    private String gbadultprice;
    private String infantfarebasis;
    private String infantfarereference;
    private String infantprice;
    private String info;
    private String name;
    @com.google.gson.annotations.SerializedName("refundmessage_ad_en")
    private String refundmessageAdEn;
    @com.google.gson.annotations.SerializedName("refundmessage_ad_zh")
    private String refundmessageAdZh;
    @com.google.gson.annotations.SerializedName("refundmessage_ch_en")
    private String refundmessageChEn;
    @com.google.gson.annotations.SerializedName("refundmessage_ch_zh")
    private String refundmessageChZh;
    @com.google.gson.annotations.SerializedName("specifiedtime_en")
    private String specifiedtimeEn;
    @com.google.gson.annotations.SerializedName("specifiedtime_zh")
    private String specifiedtimeZh;
    private List<String> brandtype;
    private List<?> secondprices;

    public void setAdultfarebasis(String adultfarebasis) {
        this.adultfarebasis = adultfarebasis;
    }

    public void setAdultprice(String adultprice) {
        this.adultprice = adultprice;
    }

    public void setChangemessageAdEn(String changemessageAdEn) {
        this.changemessageAdEn = changemessageAdEn;
    }

    public void setChangemessageAdZh(String changemessageAdZh) {
        this.changemessageAdZh = changemessageAdZh;
    }

    public void setChangemessageChEn(String changemessageChEn) {
        this.changemessageChEn = changemessageChEn;
    }

    public void setChangemessageChZh(String changemessageChZh) {
        this.changemessageChZh = changemessageChZh;
    }

    public void setChildfarebasis(String childfarebasis) {
        this.childfarebasis = childfarebasis;
    }

    public void setChildfarereference(String childfarereference) {
        this.childfarereference = childfarereference;
    }

    public void setChildprice(String childprice) {
        this.childprice = childprice;
    }

    public void setChildpricetype(String childpricetype) {
        this.childpricetype = childpricetype;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public void setFarereference(String farereference) {
        this.farereference = farereference;
    }

    public void setGbadultprice(String gbadultprice) {
        this.gbadultprice = gbadultprice;
    }

    public void setInfantfarebasis(String infantfarebasis) {
        this.infantfarebasis = infantfarebasis;
    }

    public void setInfantfarereference(String infantfarereference) {
        this.infantfarereference = infantfarereference;
    }

    public void setInfantprice(String infantprice) {
        this.infantprice = infantprice;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRefundmessageAdEn(String refundmessageAdEn) {
        this.refundmessageAdEn = refundmessageAdEn;
    }

    public void setRefundmessageAdZh(String refundmessageAdZh) {
        this.refundmessageAdZh = refundmessageAdZh;
    }

    public void setRefundmessageChEn(String refundmessageChEn) {
        this.refundmessageChEn = refundmessageChEn;
    }

    public void setRefundmessageChZh(String refundmessageChZh) {
        this.refundmessageChZh = refundmessageChZh;
    }

    public void setSpecifiedtimeEn(String specifiedtimeEn) {
        this.specifiedtimeEn = specifiedtimeEn;
    }

    public void setSpecifiedtimeZh(String specifiedtimeZh) {
        this.specifiedtimeZh = specifiedtimeZh;
    }

    public void setBrandtype(List<String> brandtype) {
        this.brandtype = brandtype;
    }

    public void setSecondprices(List<?> secondprices) {
        this.secondprices = secondprices;
    }

    public String getAdultfarebasis() {
        return adultfarebasis;
    }

    public String getAdultprice() {
        return adultprice;
    }

    public String getChangemessageAdEn() {
        return changemessageAdEn;
    }

    public String getChangemessageAdZh() {
        return changemessageAdZh;
    }

    public String getChangemessageChEn() {
        return changemessageChEn;
    }

    public String getChangemessageChZh() {
        return changemessageChZh;
    }

    public String getChildfarebasis() {
        return childfarebasis;
    }

    public String getChildfarereference() {
        return childfarereference;
    }

    public String getChildprice() {
        return childprice;
    }

    public String getChildpricetype() {
        return childpricetype;
    }

    public String getDiscount() {
        return discount;
    }

    public String getFarereference() {
        return farereference;
    }

    public String getGbadultprice() {
        return gbadultprice;
    }

    public String getInfantfarebasis() {
        return infantfarebasis;
    }

    public String getInfantfarereference() {
        return infantfarereference;
    }

    public String getInfantprice() {
        return infantprice;
    }

    public String getInfo() {
        return info;
    }

    public String getName() {
        return name;
    }

    public String getRefundmessageAdEn() {
        return refundmessageAdEn;
    }

    public String getRefundmessageAdZh() {
        return refundmessageAdZh;
    }

    public String getRefundmessageChEn() {
        return refundmessageChEn;
    }

    public String getRefundmessageChZh() {
        return refundmessageChZh;
    }

    public String getSpecifiedtimeEn() {
        return specifiedtimeEn;
    }

    public String getSpecifiedtimeZh() {
        return specifiedtimeZh;
    }

    public List<String> getBrandtype() {
        return brandtype;
    }

    public List<?> getSecondprices() {
        return secondprices;
    }
}
