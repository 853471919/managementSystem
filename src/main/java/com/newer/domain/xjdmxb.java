package com.newer.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

import java.sql.Timestamp;


/*询价单细表*/
public class xjdmxb implements Serializable {
    private  String id; //流水号
    private  Integer xjdid; //询价单ID
    private  String cp; //厂牌
    private  String clgg; //车辆规格
    private  String clxx; //车辆型号
    private String ys;  //颜色
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Timestamp xjrq; //询价日期
    private String bz; //备注

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getXjdid() {
        return xjdid;
    }

    public void setXjdid(Integer xjdid) {
        this.xjdid = xjdid;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getClgg() {
        return clgg;
    }

    public void setClgg(String clgg) {
        this.clgg = clgg;
    }

    public String getClxx() {
        return clxx;
    }

    public void setClxx(String clxx) {
        this.clxx = clxx;
    }

    public String getYs() {
        return ys;
    }

    public void setYs(String ys) {
        this.ys = ys;
    }

    public Timestamp getXjrq() {
        return xjrq;
    }

    public void setXjrq(Timestamp xjrq) {
        this.xjrq = xjrq;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
}
