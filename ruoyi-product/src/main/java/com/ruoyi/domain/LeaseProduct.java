package com.ruoyi.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 租赁产品对象 lease_product
 *
 * @author jjzhaodi
 * @date 2024-03-09
 */
public class LeaseProduct extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 租赁产品id */
    @Excel(name = "租赁产品id")
    private String leaseId;

    /** 租赁产品名称 */
    @Excel(name = "租赁产品名称")
    private String leaseName;

    /** 发布状态(0-未发布1-已发布) */
    private Integer publishStatus;

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

    /** 上传图id */
    private String photoUrl;

    /** 发布时间 */
    private Date publishTime;

    @Override
    public String toString() {
        return "LeaseProduct{" +
                "leaseId='" + leaseId + '\'' +
                ", leaseName='" + leaseName + '\'' +
                ", publishStatus=" + publishStatus +
                ", createdBy='" + createdBy + '\'' +
                ", createdTime=" + createdTime +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedTime=" + updatedTime +
                ", isdeleted=" + isdeleted +
                ", photoUrl='" + photoUrl + '\'' +
                ", publishTime=" + publishTime +
                '}';
    }

    public String getLeaseId() {
        return leaseId;
    }

    public void setLeaseId(String leaseId) {
        this.leaseId = leaseId;
    }

    public String getLeaseName() {
        return leaseName;
    }

    public void setLeaseName(String leaseName) {
        this.leaseName = leaseName;
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
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

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public LeaseProduct() {
    }

    public LeaseProduct(String leaseId, String leaseName, Integer publishStatus, String createdBy, Date createdTime, String updatedBy, Date updatedTime, Integer isdeleted, String photoUrl, Date publishTime) {
        this.leaseId = leaseId;
        this.leaseName = leaseName;
        this.publishStatus = publishStatus;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
        this.isdeleted = isdeleted;
        this.photoUrl = photoUrl;
        this.publishTime = publishTime;
    }
}
