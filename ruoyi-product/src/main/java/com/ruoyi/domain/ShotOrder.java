package com.ruoyi.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 跟拍订单对象 shot_order
 *
 * @author jjzhaodi
 * @date 2024-03-10
 */
public class ShotOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 跟拍订单id */
    @Excel(name = "跟拍订单id")
    private String shotOrderId;

    /** 产品名称 */
    @Excel(name = "产品名称")
    private String productName;

    /** 套餐 */
    @Excel(name = "套餐")
    private String pack;

    /** 用户名 */
    @Excel(name = "用户名")
    private String userName;

    /** 客户手机号 */
    private String userPhone;

    /** 单价 */
    @Excel(name = "单价")
    private BigDecimal price;

    /** 拍摄日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "拍摄日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date shotDate;

    /** 下单时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下单时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date placeDate;

    /** 支付状态（0表示已支付，1表示未支付） */
    @Excel(name = "支付状态", readConverterExp = "0=表示已支付，1表示未支付")
    private String payStatus;

    /** 订单状态 */
    @Excel(name = "订单状态")
    private String orderstatus;

    /** 店铺id */
    @Excel(name = "店铺id")
    private String businessId;

    /** 摄影师id */
    private String photographerId;

    /** 创建人 */
    private String createdBy;

    /** 创建时间 */
    private Date createdTime;

    /** 更新人 */
    private String updatedBy;

    /** 更新时间 */
    private Date updatedTime;

    /** 逻辑删除标识(0-未删除,1-已删除) */
    private Integer isdeleted;

    /** 支付金额 */
    @Excel(name = "支付金额")
    private BigDecimal pay;

    /** 产品id */
    @Excel(name = "产品id")
    private Long shotId;

    /** 店铺名 */
    @Excel(name = "店铺名")
    private String shopName;
    @Excel(name = "商品图")
    private String photoUrl;

    public ShotOrder(String shotOrderId, String productName, String pack, String userName, String userPhone, BigDecimal price, Date shotDate, Date placeDate, String payStatus, String orderstatus, String businessId, String photographerId, String createdBy, Date createdTime, String updatedBy, Date updatedTime, Integer isdeleted, BigDecimal pay, Long shotId, String shopName, String photoUrl) {
        this.shotOrderId = shotOrderId;
        this.productName = productName;
        this.pack = pack;
        this.userName = userName;
        this.userPhone = userPhone;
        this.price = price;
        this.shotDate = shotDate;
        this.placeDate = placeDate;
        this.payStatus = payStatus;
        this.orderstatus = orderstatus;
        this.businessId = businessId;
        this.photographerId = photographerId;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
        this.isdeleted = isdeleted;
        this.pay = pay;
        this.shotId = shotId;
        this.shopName = shopName;
        this.photoUrl = photoUrl;
    }

    public ShotOrder() {
    }

    @Override
    public String toString() {
        return "ShotOrder{" +
                "shotOrderId='" + shotOrderId + '\'' +
                ", productName='" + productName + '\'' +
                ", pack='" + pack + '\'' +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", price=" + price +
                ", shotDate=" + shotDate +
                ", placeDate=" + placeDate +
                ", payStatus='" + payStatus + '\'' +
                ", orderstatus='" + orderstatus + '\'' +
                ", businessId='" + businessId + '\'' +
                ", photographerId='" + photographerId + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdTime=" + createdTime +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedTime=" + updatedTime +
                ", isdeleted=" + isdeleted +
                ", pay=" + pay +
                ", shotId=" + shotId +
                ", shopName='" + shopName + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                '}';
    }

    public String getShotOrderId() {
        return shotOrderId;
    }

    public void setShotOrderId(String shotOrderId) {
        this.shotOrderId = shotOrderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getShotDate() {
        return shotDate;
    }

    public void setShotDate(Date shotDate) {
        this.shotDate = shotDate;
    }

    public Date getPlaceDate() {
        return placeDate;
    }

    public void setPlaceDate(Date placeDate) {
        this.placeDate = placeDate;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getPhotographerId() {
        return photographerId;
    }

    public void setPhotographerId(String photographerId) {
        this.photographerId = photographerId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    public BigDecimal getPay() {
        return pay;
    }

    public void setPay(BigDecimal pay) {
        this.pay = pay;
    }

    public Long getShotId() {
        return shotId;
    }

    public void setShotId(Long shotId) {
        this.shotId = shotId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
