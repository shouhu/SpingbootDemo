package com.shouhu.spingstart.pojo;

import java.util.Date;
import javax.persistence.*;

public class Product {
    @Id
    private String pid;

    private String pname;

    @Column(name = "market_price")
    private Double marketPrice;

    @Column(name = "shop_price")
    private Double shopPrice;

    private String pimage;

    private Date pdate;

    @Column(name = "is_hot")
    private Integer isHot;

    private String pdesc;

    private Integer pflag;

    private String cid;

    /**
     * @return pid
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * @return pname
     */
    public String getPname() {
        return pname;
    }

    /**
     * @param pname
     */
    public void setPname(String pname) {
        this.pname = pname;
    }

    /**
     * @return market_price
     */
    public Double getMarketPrice() {
        return marketPrice;
    }

    /**
     * @param marketPrice
     */
    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * @return shop_price
     */
    public Double getShopPrice() {
        return shopPrice;
    }

    /**
     * @param shopPrice
     */
    public void setShopPrice(Double shopPrice) {
        this.shopPrice = shopPrice;
    }

    /**
     * @return pimage
     */
    public String getPimage() {
        return pimage;
    }

    /**
     * @param pimage
     */
    public void setPimage(String pimage) {
        this.pimage = pimage;
    }

    /**
     * @return pdate
     */
    public Date getPdate() {
        return pdate;
    }

    /**
     * @param pdate
     */
    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    /**
     * @return is_hot
     */
    public Integer getIsHot() {
        return isHot;
    }

    /**
     * @param isHot
     */
    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    /**
     * @return pdesc
     */
    public String getPdesc() {
        return pdesc;
    }

    /**
     * @param pdesc
     */
    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    /**
     * @return pflag
     */
    public Integer getPflag() {
        return pflag;
    }

    /**
     * @param pflag
     */
    public void setPflag(Integer pflag) {
        this.pflag = pflag;
    }

    /**
     * @return cid
     */
    public String getCid() {
        return cid;
    }

    /**
     * @param cid
     */
    public void setCid(String cid) {
        this.cid = cid;
    }
}