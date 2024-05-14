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
 * @date 2024-03-16
 */
public class LeaseGoods extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 租赁商品id */
    @Excel(name = "租赁商品id")
    private String leaseId;

    /** 租赁商品名称 */
    @Excel(name = "租赁商品名称")
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

    /** 上传图 */
    @Excel(name = "上传图")
    private String photoUrl;

    /** 发布时间 */
    private Date publishTime;

    public void setLeaseId(String leaseId)
    {
        this.leaseId = leaseId;
    }

    public String getLeaseId()
    {
        return leaseId;
    }
    public void setLeaseName(String leaseName)
    {
        this.leaseName = leaseName;
    }

    public String getLeaseName()
    {
        return leaseName;
    }
    public void setPublishStatus(Integer publishStatus)
    {
        this.publishStatus = publishStatus;
    }

    public Integer getPublishStatus()
    {
        return publishStatus;
    }
    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    public String getCreatedBy()
    {
        return createdBy;
    }
    public void setCreatedTime(Date createdTime)
    {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime()
    {
        return createdTime;
    }
    public void setUpdatedBy(String updatedBy)
    {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedBy()
    {
        return updatedBy;
    }
    public void setUpdatedTime(Date updatedTime)
    {
        this.updatedTime = updatedTime;
    }

    public Date getUpdatedTime()
    {
        return updatedTime;
    }
    public void setIsdeleted(Integer isdeleted)
    {
        this.isdeleted = isdeleted;
    }

    public Integer getIsdeleted()
    {
        return isdeleted;
    }
    public void setPhotoUrl(String photoUrl)
    {
        this.photoUrl = photoUrl;
    }

    public String getPhotoUrl()
    {
        return photoUrl;
    }
    public void setPublishTime(Date publishTime)
    {
        this.publishTime = publishTime;
    }

    public Date getPublishTime()
    {
        return publishTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("leaseId", getLeaseId())
                .append("leaseName", getLeaseName())
                .append("publishStatus", getPublishStatus())
                .append("createdBy", getCreatedBy())
                .append("createdTime", getCreatedTime())
                .append("updatedBy", getUpdatedBy())
                .append("updatedTime", getUpdatedTime())
                .append("isdeleted", getIsdeleted())
                .append("photoUrl", getPhotoUrl())
                .append("publishTime", getPublishTime())
                .toString();
    }
}
