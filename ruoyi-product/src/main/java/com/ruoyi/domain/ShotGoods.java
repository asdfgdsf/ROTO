package com.ruoyi.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 预约跟拍商品对象 shot_product
 *
 * @author jjzhaodi
 * @date 2024-03-16
 */
public class ShotGoods extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 跟拍商品id */
    @Excel(name = "跟拍商品id")
    private String shotId;

    /** 商品品名称 */
    @Excel(name = "商品品名称")
    private String productName;

    /** 景区 */
    @Excel(name = "景区")
    private String scenic;

    /** 景点 */
    @Excel(name = "景点")
    private String attraction;

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
    @Excel(name = "上传图id")
    private String photoUrl;

    /** 发布时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date publishTime;

    public void setShotId(String shotId)
    {
        this.shotId = shotId;
    }

    public String getShotId()
    {
        return shotId;
    }
    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getProductName()
    {
        return productName;
    }
    public void setScenic(String scenic)
    {
        this.scenic = scenic;
    }

    public String getScenic()
    {
        return scenic;
    }
    public void setAttraction(String attraction)
    {
        this.attraction = attraction;
    }

    public String getAttraction()
    {
        return attraction;
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
                .append("shotId", getShotId())
                .append("productName", getProductName())
                .append("scenic", getScenic())
                .append("attraction", getAttraction())
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
