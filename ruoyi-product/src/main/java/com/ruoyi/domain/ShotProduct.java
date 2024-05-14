package com.ruoyi.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 预约跟拍产品对象 shot_product
 * 
 * @author jjzhaodi
 * @date 2023-12-01
 */
public class ShotProduct extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private String id;

    /** 产品名称 */
    @Excel(name = "产品名称")
    private String productName;

    /** 景区 */
    @Excel(name = "景区")
    private String scenic;

    /** 景点 */
    @Excel(name = "景点")
    private String attraction;

    /** 发布状态 */
    @Excel(name = "发布状态")
    private Long publishStatus;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createdBy;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdTime;

    /** 更新人 */
    @Excel(name = "更新人")
    private String updatedBy;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updatedTime;

    /** 是否删除 */
    @Excel(name = "是否删除")
    private Long isdeleted;
    @Excel(name = "是否删除")
    private String photoUrl;

    public ShotProduct(String id, String productName, String scenic, String attraction, Long publishStatus, String createdBy, Date createdTime, String updatedBy, Date updatedTime, Long isdeleted, String photoUrl) {
        this.id = id;
        this.productName = productName;
        this.scenic = scenic;
        this.attraction = attraction;
        this.publishStatus = publishStatus;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
        this.isdeleted = isdeleted;
        this.photoUrl = photoUrl;
    }

    public ShotProduct() {
    }

    @Override
    public String toString() {
        return "ShotProduct{" +
                "id='" + id + '\'' +
                ", productName='" + productName + '\'' +
                ", scenic='" + scenic + '\'' +
                ", attraction='" + attraction + '\'' +
                ", publishStatus=" + publishStatus +
                ", createdBy='" + createdBy + '\'' +
                ", createdTime=" + createdTime +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedTime=" + updatedTime +
                ", isdeleted=" + isdeleted +
                ", photoUrl='" + photoUrl + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getScenic() {
        return scenic;
    }

    public void setScenic(String scenic) {
        this.scenic = scenic;
    }

    public String getAttraction() {
        return attraction;
    }

    public void setAttraction(String attraction) {
        this.attraction = attraction;
    }

    public Long getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Long publishStatus) {
        this.publishStatus = publishStatus;
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

    public Long getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Long isdeleted) {
        this.isdeleted = isdeleted;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
