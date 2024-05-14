package com.ruoyi.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 租赁产品款式对象 lease_style
 *
 * @author jjzhaodi
 * @date 2024-03-09
 */
public class LeaseStyle extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 款式id */
    @Excel(name = "款式id")
    private String styleId;

    /** 款式名称 */
    @Excel(name = "款式名称")
    private String styleName;

    /** 尺码 */
    @Excel(name = "尺码")
    private String size;

    /** 价格 */
    @Excel(name = "价格")
    private BigDecimal price;

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

    /** 适用产品id */
    @Excel(name = "适用产品id")
    private String applicableProduct;


    public LeaseStyle() {
    }

    public LeaseStyle(String styleId, String styleName, String size, BigDecimal price, String createdBy, Date createdTime, String updatedBy, Date updatedTime, Integer isdeleted, String applicableProduct) {
        this.styleId = styleId;
        this.styleName = styleName;
        this.size = size;
        this.price = price;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
        this.isdeleted = isdeleted;
        this.applicableProduct = applicableProduct;
    }

    public String getStyleId() {
        return styleId;
    }

    public void setStyleId(String styleId) {
        this.styleId = styleId;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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

    public String getApplicableProduct() {
        return applicableProduct;
    }

    public void setApplicableProduct(String applicableProduct) {
        this.applicableProduct = applicableProduct;
    }

    @Override
    public String toString() {
        return "LeaseStyle{" +
                "styleId='" + styleId + '\'' +
                ", styleName='" + styleName + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", createdBy='" + createdBy + '\'' +
                ", createdTime=" + createdTime +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedTime=" + updatedTime +
                ", isdeleted=" + isdeleted +
                ", applicableProduct='" + applicableProduct + '\'' +
                '}';
    }
}
